package com.sparrowwallet.toucan.impl;

public class FracGrid extends Grid<Double> {
    public FracGrid(Size size) {
        super(size);
    }

    public void overlay(CellGrid cellGrid, double frac) {
        for(Point point : getPoints()) {
            if(cellGrid.getValue(point)) {
                setValue(frac, point);
            }
        }
    }

    @Override
    protected Color colorForValue(Double value) {
        return Colors.BLACK.lerpTo(Colors.WHITE, value);
    }

    @Override
    protected Double getDefault() {
        return 0d;
    }
}
