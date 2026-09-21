import java.util.*;
public class Rectangle extends Shape {
    protected double length;
    protected double height;
    
    public Rectangle(int[] userPos, double uLength, double uHeight){
        super.position = userPos;
        this.length = uLength;
        this.height = uHeight;

    }
    public double computeArea(){
        return this.length * this.height;
    }

    public static void main(String[] args){
        int[] pos = new int[2];
        pos[0] = 10;
        pos[1] = 0;
        Shape rectangle = new Rectangle(pos, 5, 8.5);
        System.out.println(rectangle.computeArea());
    }
}
