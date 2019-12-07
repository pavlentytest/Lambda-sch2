package ru.pavlenty;

public class Main {

    public static void main(String[] args) {

     Calculator c = new Calculator(6,7);

     System.out.println(c.sum());
     System.out.println(c.devide());

     MiniCalculator m = new MiniCalculator(8,9);
     System.out.println(m.mult());
     System.out.println(m.devide());

     Devideable d = new Devideable();

     Devideable d2 = new Devideable() {
            public double devide(int k, int l) {
                return k/l+100;
            }
     };

     d2.devide(4,6);

     Devideable d3 = (k, l) ->  k/l;
     d3.devide(5,7);

    }
}
