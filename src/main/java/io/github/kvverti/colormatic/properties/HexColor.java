/*
 * Colormatic
 * Copyright (C) 2019  Thalia Nero
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package io.github.kvverti.colormatic.properties;

/**
 * Represents a hexadecimal color in ARGB format with full alpha.
 */
public final class HexColor {

    public static final HexColor WHITE = new HexColor(0xffffff);

    private final int color;

    public HexColor(int col) {
        color = 0xff000000 | col;
    }

    public int get() {
        return color;
    }

    @Override
    public String toString() {
        return Integer.toHexString(color);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof HexColor && color == ((HexColor)obj).color;
    }

    @Override
    public int hashCode() {
        return color;
    }
}
