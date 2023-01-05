package com.sparrowwallet.toucan.impl;

public record Point(int x, int y) {
    public static Point ZERO = new Point(0, 0);
}
