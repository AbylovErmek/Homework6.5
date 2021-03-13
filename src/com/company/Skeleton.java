package com.company;

public class Skeleton extends Boss {

    private int QuantityOfArrows;

    public void setQuantityOfArrows(int numberOfArrows) {
        this.QuantityOfArrows = numberOfArrows;
    }

    public int getQuantityOfArrows() {
        return QuantityOfArrows;
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }
}
