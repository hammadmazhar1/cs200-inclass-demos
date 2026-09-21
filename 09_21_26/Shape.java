public abstract class Shape {
    protected int[] position;

    abstract double computeArea();

    public int[] getPosition(){
        return this.position;
    }
    public void setPosition(int x, int y){
        position[0] = x;
        position[1] = y;
    }

    // public static void main(String[] args){
    //     Shape shape = new Shape();
    // }
}
