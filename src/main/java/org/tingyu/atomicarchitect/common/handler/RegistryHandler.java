package org.tingyu.atomicarchitect.common.handler;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.tingyu.atomicarchitect.AtomicArchitect;
import org.tingyu.atomicarchitect.common.world.item.AtomElement;
import org.tingyu.atomicarchitect.common.world.item.ModCreativeModeTab;

@Mod.EventBusSubscriber(modid = AtomicArchitect.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegistry(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(1).symbol("H").name("hydrogen")).setRegistryName("hydrogen"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(2).symbol("He").name("helium")).setRegistryName("helium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(3).symbol("Li").name("lithium")).setRegistryName("lithium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(4).symbol("Be").name("beryllium")).setRegistryName("beryllium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(5).symbol("B").name("boron")).setRegistryName("boron"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(6).symbol("C").name("carbon")).setRegistryName("carbon"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(7).symbol("N").name("nitrogen")).setRegistryName("nitrogen"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(8).symbol("O").name("oxygen")).setRegistryName("oxygen"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(9).symbol("F").name("fluorine")).setRegistryName("fluorine"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(10).symbol("Ne").name("neon")).setRegistryName("neon"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(11).symbol("Na").name("sodium")).setRegistryName("sodium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(12).symbol("Mg").name("magnesium")).setRegistryName("magnesium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(13).symbol("Al").name("aluminium")).setRegistryName("aluminium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(14).symbol("Si").name("silicon")).setRegistryName("silicon"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(15).symbol("P").name("phosphorus")).setRegistryName("phosphorus"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(16).symbol("S").name("sulfur")).setRegistryName("sulfur"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(17).symbol("Cl").name("chlorine")).setRegistryName("chlorine"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(18).symbol("Ar").name("argon")).setRegistryName("argon"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(19).symbol("K").name("potassium")).setRegistryName("potassium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(20).symbol("Ca").name("calcium")).setRegistryName("calcium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(21).symbol("Sc").name("scandium")).setRegistryName("scandium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(22).symbol("Ti").name("titanium")).setRegistryName("titanium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(23).symbol("V").name("vanadium")).setRegistryName("vanadium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(24).symbol("Cr").name("chromium")).setRegistryName("chromium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(25).symbol("Mn").name("manganese")).setRegistryName("manganese"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(26).symbol("Fe").name("iron")).setRegistryName("iron"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(27).symbol("Co").name("cobalt")).setRegistryName("cobalt"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(28).symbol("Ni").name("nickel")).setRegistryName("nickel"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(29).symbol("Cu").name("copper")).setRegistryName("copper"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(30).symbol("Zn").name("zinc")).setRegistryName("zinc"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(31).symbol("Ga").name("gallium")).setRegistryName("gallium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(32).symbol("Ge").name("germanium")).setRegistryName("germanium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(33).symbol("As").name("arsenic")).setRegistryName("arsenic"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(34).symbol("Se").name("selenium")).setRegistryName("selenium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(35).symbol("Br").name("bromine")).setRegistryName("bromine"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(36).symbol("Kr").name("krypton")).setRegistryName("krypton"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(37).symbol("Rb").name("rubidium")).setRegistryName("rubidium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(38).symbol("Sr").name("strontium")).setRegistryName("strontium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(39).symbol("Y").name("yttrium")).setRegistryName("yttrium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(40).symbol("Zr").name("zirconium")).setRegistryName("zirconium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(41).symbol("Nb").name("niobium")).setRegistryName("niobium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(42).symbol("Mo").name("molybdenum")).setRegistryName("molybdenum"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(43).symbol("Tc").name("technetium")).setRegistryName("technetium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(44).symbol("Ru").name("ruthenium")).setRegistryName("ruthenium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(45).symbol("Rh").name("rhodium")).setRegistryName("rhodium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(46).symbol("Pd").name("palladium")).setRegistryName("palladium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(47).symbol("Ag").name("silver")).setRegistryName("silver"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(48).symbol("Cd").name("cadmium")).setRegistryName("cadmium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(49).symbol("In").name("indium")).setRegistryName("indium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(50).symbol("Sn").name("tin")).setRegistryName("tin"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(51).symbol("Sb").name("antimony")).setRegistryName("antimony"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(52).symbol("Te").name("tellurium")).setRegistryName("tellurium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(53).symbol("I").name("iodine")).setRegistryName("iodine"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(54).symbol("Xe").name("xenon")).setRegistryName("xenon"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(55).symbol("Cs").name("cesium")).setRegistryName("cesium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(56).symbol("Ba").name("barium")).setRegistryName("barium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(57).symbol("La").name("lanthanum")).setRegistryName("lanthanum"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(58).symbol("Ce").name("cerium")).setRegistryName("cerium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(59).symbol("Pr").name("praseodymium")).setRegistryName("praseodymium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(60).symbol("Nd").name("neodymium")).setRegistryName("neodymium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(61).symbol("Pm").name("promethium")).setRegistryName("promethium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(62).symbol("Sm").name("samarium")).setRegistryName("samarium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(63).symbol("Eu").name("europium")).setRegistryName("europium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(64).symbol("Gd").name("gadolinium")).setRegistryName("gadolinium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(65).symbol("Tb").name("terbium")).setRegistryName("terbium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(66).symbol("Dy").name("dysprosium")).setRegistryName("dysprosium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(67).symbol("Ho").name("holmium")).setRegistryName("holmium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(68).symbol("Er").name("erbium")).setRegistryName("erbium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(69).symbol("Tm").name("thulium")).setRegistryName("thulium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(70).symbol("Yb").name("ytterbium")).setRegistryName("ytterbium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(71).symbol("Lu").name("lutetium")).setRegistryName("lutetium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(72).symbol("Hf").name("hafnium")).setRegistryName("hafnium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(73).symbol("Ta").name("tantalum")).setRegistryName("tantalum"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(74).symbol("W").name("tungsten")).setRegistryName("tungsten"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(75).symbol("Re").name("rhenium")).setRegistryName("rhenium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(76).symbol("Os").name("osmium")).setRegistryName("osmium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(77).symbol("Ir").name("iridium")).setRegistryName("iridium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(78).symbol("Pt").name("platinum")).setRegistryName("platinum"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(79).symbol("Au").name("gold")).setRegistryName("gold"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(80).symbol("Hg").name("mercury")).setRegistryName("mercury"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(81).symbol("Tl").name("thallium")).setRegistryName("thallium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(82).symbol("Pb").name("lead")).setRegistryName("lead"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(83).symbol("Bi").name("bismuth")).setRegistryName("bismuth"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(84).symbol("Po").name("polonium")).setRegistryName("polonium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(85).symbol("At").name("astatine")).setRegistryName("astatine"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(86).symbol("Rn").name("radon")).setRegistryName("radon"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(87).symbol("Fr").name("francium")).setRegistryName("francium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(88).symbol("Ra").name("radium")).setRegistryName("radium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(89).symbol("Ac").name("actinium")).setRegistryName("actinium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(90).symbol("Th").name("thorium")).setRegistryName("thorium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(91).symbol("Pa").name("protactinium")).setRegistryName("protactinium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(92).symbol("U").name("uranium")).setRegistryName("uranium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(93).symbol("Np").name("neptunium")).setRegistryName("neptunium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(94).symbol("Pu").name("plutonium")).setRegistryName("plutonium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(95).symbol("Am").name("americium")).setRegistryName("americium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(96).symbol("Cm").name("curium")).setRegistryName("curium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(97).symbol("Bk").name("berkelium")).setRegistryName("berkelium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(98).symbol("Cf").name("californium")).setRegistryName("californium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(99).symbol("Es").name("einsteinium")).setRegistryName("einsteinium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(100).symbol("Fm").name("fermium")).setRegistryName("fermium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(101).symbol("Md").name("mendelevium")).setRegistryName("mendelevium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(102).symbol("No").name("nobelium")).setRegistryName("nobelium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(103).symbol("Lr").name("lawrencium")).setRegistryName("lawrencium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(104).symbol("Rf").name("rutherfordium")).setRegistryName("rutherfordium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(105).symbol("Db").name("dubnium")).setRegistryName("dubnium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(106).symbol("Sg").name("seaborgium")).setRegistryName("seaborgium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(107).symbol("Bh").name("bohrium")).setRegistryName("bohrium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(108).symbol("Hs").name("hassium")).setRegistryName("hassium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(109).symbol("Mt").name("meitnerium")).setRegistryName("meitnerium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(110).symbol("Ds").name("darmstadtium")).setRegistryName("darmstadtium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(111).symbol("Rg").name("roentgenium")).setRegistryName("roentgenium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(112).symbol("Cn").name("copernicium")).setRegistryName("copernicium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(113).symbol("Nh").name("nihonium")).setRegistryName("nihonium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(114).symbol("Fl").name("flerovium")).setRegistryName("flerovium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(115).symbol("Mc").name("moscovium")).setRegistryName("moscovium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(116).symbol("Lv").name("livermorium")).setRegistryName("livermorium"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(117).symbol("Ts").name("tennessine")).setRegistryName("tennessine"));
        event.getRegistry().register(new AtomElement(new AtomElement.Properties().atomicNumber(118).symbol("Og").name("oganesson")).setRegistryName("oganesson"));
    }
}
