package ru.pavlenty;

public class MiniCalculator extends Calculator implements Devideable {

    MiniCalculator(int xx, int yy) {
        super(xx, yy);
    }

    public double devide() {
        return this.x/this.y;
    }
}
