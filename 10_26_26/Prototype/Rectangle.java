public class Rectangle extends Shape{
    int height, width;

    public Rectangle(){
        height =0;
        width = 0;
    }
    public Shape clone(){
        Shape new_rect = new Rectangle();

        new_rect.setX(super.getX());
        new_rect.setY(super.getY());
        ((Rectangle)new_rect).height = height;
        ((Rectangle)new_rect).width = width;
        return new_rect;
    }
}