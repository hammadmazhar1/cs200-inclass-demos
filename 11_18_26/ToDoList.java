import com.todo.ToDoItem;
import java.util.ArrayList;

public class ToDoList{
    public static void main(String[] args){
        ArrayList<ToDoItem> tasks = new ArrayList<ToDoItem>();
        
        tasks.add(new ToDoItem("1","Iron Clothes"));
        tasks.add(new ToDoItem("2","Prepare for Class"));

        for (ToDoItem i : tasks){
            System.out.println(i.getID() +": " + i.task);
        }
    }
}