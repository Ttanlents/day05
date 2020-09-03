package day05._05;

public class Circle {
    int r;

    public Circle() {
    }

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void showArea(){
        System.out.println("半径为"+r+"面积为"+Math.PI*r*r);
    }
    public void showPerimeter(){
        System.out.println("半径为"+r+"面积为"+Math.PI*r*2);
    }
}
