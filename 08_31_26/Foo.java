class Foo {
    // declare class attributes
    private int size;
    private int currentIdx;
    private int[] data;

    // define the constructer method using the class name
    public Foo(){
        size = 5;
        currentIdx = 0;
        data = new int[5];
    }
    public Foo(int x){
        size = x;
        currentIdx = 0;
        data = new int[x];
    }
    public void setSize(int x){
        this.size = x;
    }
    public int getSize(){
        return this.size;
    }
    // public void changeSize(int size){
    //     this.size =size;
    //     this.data = new int[this.size];
    // }
    public boolean add(int item){
        if (currentIdx == this.size){
            // array is full
            return false;
        } else {
            this.data[currentIdx] = item;
            currentIdx++;
            return true;
        }
    } 
    public static void main(String[] args) {
        Foo newObj = new Foo();
        System.out.println(newObj.size);
        Foo newObj2 = new Foo(20);
        System.out.println(newObj2.size);
        newObj.add(15);
        System.out.println(newObj.currentIdx);
        System.out.println(newObj.data[0]);
    }
}