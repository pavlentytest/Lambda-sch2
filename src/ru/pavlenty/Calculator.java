package ru.pavlenty;

public class Calculator implements Devideable {
    protected int x;
    protected int y;

    Calculator(int xx, int yy) {
        x = xx;
        y = yy;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public int sum() {
        return this.x + this.y;
    }

    public int mult() {
        return this.x*this.y;
    }

    public double devide() {
        return this.x/this.y+100;
    }
}
