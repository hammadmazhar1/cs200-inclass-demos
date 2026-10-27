public class SingletonMain{
    public static void main(String[]args){
        Bank bank = Bank.getInstance();
        bank.setName("First UNCO Bank");
        System.out.println(bank.getName());
        Bank bank2 = Bank.getInstance();
        System.out.println(bank == bank2);
        System.out.println(bank2.getName());
    }
}