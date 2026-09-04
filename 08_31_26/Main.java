public class Main {
  public static void main(String[ ] args) {
    // int[] myNumbers = {1, 2, 3};
    // try {
    //     System.out.println(myNumbers[10]); // error!
    // } catch (Exception e){
    //     System.out.println("Index out of bounds");
    // } finally {
    //     System.out.println("Program completed successfully");
    // }

    // int a = 2;
    // int b = 5;
    // int c = 6;
    // System.out.println(a+b+c);

    Foo newObj = new Foo();
    System.out.println(newObj.getSize());
    newObj.setSize(10);
    System.out.println(newObj.getSize());
  }
}
