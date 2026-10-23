import java.util.HashMap;

public class Hash{
    public static void main(String[] args) {
        HashMap<String, String> phonebook = new HashMap<String, String>();

        // put in key-values
        phonebook.put("James","9283241223");
        phonebook.put("Max","9281289924");
        phonebook.put("Melvin","9283242353");

        // find values
        System.out.println(phonebook.get("Max"));
        System.out.println(phonebook.get("Abril"));

        // check if a key exists
        System.out.println(phonebook.containsKey("Alex"));
        System.out.println(phonebook.get("Alex"));
        phonebook.remove("Max");
        System.out.println(phonebook.values());
        System.out.println(phonebook.keySet());

    }
}