package org.tingyu.atomicarchitect.common.handler;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimplePreparableReloadListener;
import net.minecraft.util.profiling.ProfilerFiller;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.tingyu.atomicarchitect.AtomicArchitect;
import org.tingyu.atomicarchitect.common.world.item.AtomElement;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

@Mod.EventBusSubscriber(modid = AtomicArchitect.MOD_ID)
public class AtomElementBuilder extends SimplePreparableReloadListener<Map<String, AtomElement>> {
    private static final Map<String, AtomElement> ELEMENTS = new HashMap<>();
    private static final Gson GSON = new Gson();
    public static final Map<String, RegistryObject<Item>> ATOM_ELEMENTS = new HashMap<>();


    public static void build(DeferredRegister<Item> ITEM) {
        for (Map.Entry<String, AtomElement> entry : ELEMENTS.entrySet()){
            RegistryObject<Item> temp = ITEM.register(entry.getKey(), entry::getValue);
            ATOM_ELEMENTS.put(entry.getKey(), temp);
        }

    }

    @Override
    protected Map<String, AtomElement> prepare(ResourceManager manager, ProfilerFiller filler) {
        Map<String, AtomElement> parsedElements = new HashMap<>();
        Collection<ResourceLocation> files = manager.listResources("atomicarchitect/elements", s -> s.endsWith(".json"));
        System.out.println("📜 found JSON : " + files.size());
        for (ResourceLocation file : files) {
            System.out.println("📂 try loading：" + file.toString());
            try (InputStream stream = manager.getResource(file).getInputStream()) {
                System.out.println(file.getPath()+"successful loaded");
                JsonObject json = GSON.fromJson(new InputStreamReader(stream), JsonObject.class);
                AtomElement element = parseElement(json);
                parsedElements.put(file.getPath(), element);
            } catch (Exception e) {
                System.err.println("Failed to load element data from: " + file);
                e.printStackTrace();
            }
        }
        return parsedElements;
    }

    @Override
    protected void apply(Map<String, AtomElement> prepared, ResourceManager manager, ProfilerFiller filler) {
//        for (Map.Entry<String, AtomElement> entry : prepared.entrySet()) {
//            ELEMENTS.put(entry.getKey(), entry.getValue());
//        }
//        ELEMENTS.keySet().removeIf(key -> !prepared.containsKey(key));
//
//        System.out.println("Loaded " + ELEMENTS.size() + " elements into the game.");
        System.out.println("ElementBuildHandler: apply() is running");
        System.out.println("🔄 resource reloading JSON...");
        Collection<ResourceLocation> files = manager.listResources("atomicarchitect/elements", s -> s.endsWith(".json"));
        System.out.println("found json : " + files.size());

        ELEMENTS.clear();
        ELEMENTS.putAll(prepared);
        System.out.println("Loaded " + ELEMENTS.size() + " elements into the game.");

    }

    private AtomElement parseElement(JsonObject json) {
        System.out.println("hi i'm parseElement");
        int atomicNumber = json.get("atomicNumber").getAsInt();
        String name = json.get("name").getAsString();
        String symbol = json.get("symbol").getAsString();
        List<AtomElement.Isotope> isotopes = new ArrayList<>();
        JsonArray isotopeArray = json.get("isotope").getAsJsonArray();

        for (JsonElement e : isotopeArray) {
            JsonObject obj = e.getAsJsonObject();
            int massNumber = obj.get("massNumber").getAsInt();
            boolean radioactive = obj.get("radioactive").getAsBoolean();
            float abundance = obj.get("abundance").getAsFloat();
            isotopes.add(new AtomElement.Isotope(massNumber, radioactive, abundance));
        }
        return new AtomElement(new AtomElement.Properties()
                .atomicNumber(atomicNumber).name(name).symbol(symbol).isotopes(isotopes));
    }
}
