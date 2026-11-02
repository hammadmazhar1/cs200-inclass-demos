public abstract class Shape{
    private int x,y;
    public abstract Shape clone();
    public void setX(int userX){
        x = userX;
    }
    public int getX(){
        return x;
    }
    public void setY(int userY){
        y = userY;
    }
    public int getY(){
        return y;
    }
    
}
