public class ShapeCreator{
    public static void main(String[] args){
        Rectangle rect = new Rectangle();
        rect.setX(10);
        rect.setY(15);
        rect.height = 5;
        rect.width = 20;

        Shape copy = rect.clone();
        System.out.println(copy == (Shape) rect);
        System.out.println(copy.getX());
        System.out.println(copy.getY());
        System.out.println(((Rectangle)copy).height);
        System.out.println(((Rectangle)copy).width);
    }
}