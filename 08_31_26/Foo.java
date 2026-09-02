class Foo {
    // declare class attributes
    int size;
    int[] data;

    // define the constructer method using the class name
    public Foo(){
        size = 5;
        data = new int[5];
    }
    public Foo(int x){
        size = x;
        data = new int[x];
    }

    public static void main(String[] args) {
        Foo newObj = new Foo();
        System.out.println(newObj.size);
        Foo newObj2 = new Foo(20);
        System.out.println(newObj2.size);
    }
}