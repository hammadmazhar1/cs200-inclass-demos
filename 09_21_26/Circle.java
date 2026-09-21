public class Circle extends Shape {
    protected double radius;
    public Circle(int[]userPos, double userRad){
        super.position = userPos;
        this.radius = userRad;
    }    
    public double computeArea(){
        return Math.PI * Math.pow(this.radius,2);
    }

    public static void main(String[] args){
        int[] pos = new int[2];
        pos[0] = 5;
        pos[1] = 5;
        Circle circle = new Circle(pos,2.5);
        System.out.printf("%.2f",circle.computeArea());

    }
}
