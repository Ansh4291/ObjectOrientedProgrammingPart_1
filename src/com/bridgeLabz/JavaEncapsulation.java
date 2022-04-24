package com.bridgeLabz;
class Area {
    private int length;
    private int breadth;

    Area (int length , int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void getArea() {
        int Area = length * breadth;
        System.out.println("Rectangle Area is  = " + Area);

    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void  setLength(int length) {
        this.length = length;

    }
    public void setBreadth(int breadth) {
        this.breadth= breadth;
    }
}

public class JavaEncapsulation {
    public static void main(String[] args) {
        Area rect = new Area(5, 6);
        rect.getLength();
//			rect.getArea();
        rect.setBreadth(2);
        rect.setLength(3);
        rect.getArea();
    }
}
