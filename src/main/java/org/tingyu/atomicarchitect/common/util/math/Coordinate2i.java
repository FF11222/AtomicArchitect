package org.tingyu.atomicarchitect.common.util.math;

import java.util.Objects;

public class Coordinate2i {
    public int x;
    public int y;

    public Coordinate2i(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.x+this.y);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Coordinate2i) {
            return ((Coordinate2i) obj).x == this.x && ((Coordinate2i) obj).y == this.y;
        }
        return false;
    }
}
