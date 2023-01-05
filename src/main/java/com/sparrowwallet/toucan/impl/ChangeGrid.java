package com.sparrowwallet.toucan.impl;

public class ChangeGrid extends Grid<Boolean> {
    public ChangeGrid(Size size) {
        super(size);
    }

    public void setChanged(Point point) {
        for(PointPair neighborhood : getNeighborhood(point)) {
            setValue(true, neighborhood.p());
        }
    }

    @Override
    protected Color colorForValue(Boolean value) {
        return value ? Colors.RED : Colors.BLUE;
    }

    @Override
    protected Boolean getDefault() {
        return Boolean.FALSE;
    }
}
