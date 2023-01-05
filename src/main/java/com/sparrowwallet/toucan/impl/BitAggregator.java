package com.sparrowwallet.toucan.impl;

import java.util.ArrayList;
import java.util.List;

public class BitAggregator {
    private final List<Byte> data;
    private int bitMask;

    public BitAggregator() {
        data = new ArrayList<>();
        bitMask = 0;
    }

    public void append(boolean bit) {
        if (bitMask == 0) {
            bitMask = 0x80;
            data.add((byte) 0);
        }

        if (bit) {
            data.set(data.size() - 1, (byte) (data.get(data.size() - 1) | bitMask));
        }

        bitMask >>= 1;
    }

    public byte[] getData() {
        byte[] result = new byte[data.size()];
        for (int i = 0; i < data.size(); i++) {
            result[i] = data.get(i);
        }
        return result;
    }
}
