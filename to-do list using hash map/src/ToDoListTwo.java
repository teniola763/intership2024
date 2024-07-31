import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ToDoListTwo {
    private HashMap<Integer, String > items;
    public ToDoListTwo()  {
        items = new HashMap<>();

    }

    public void addTask(int id, String tasks ){
        items.put(id, tasks);
        System.out.println( "tasks" + tasks +  " has been successfully added ");

    }

    public void deleteTask (int id ) {
        viewTask();
        if (items.containsKey(id)) {
            String deletedTask = items.remove(id);
            System.out.println("tasks: " + deletedTask + " has been deleted successfully ");
        }else {
            System.out.println("Task id NOT FOUND ");
        }
    }

    public void viewTask() {
        if (items.isEmpty()) {
        System.out.println("There is nothing to display ");
    }else {
        for(Map.Entry<Integer, String> entry : items.entrySet()){
            System.out.println("id: " + entry.getKey()+  "- tasks :"  + entry.getValue() );
        }
    }

    }

//    public void viewTask (int id ,String tasks) {
//        if (items.isEmpty()) {
//            System.out.println("There is nothing to display ");
//        }else {
//            for(Map.Entry<Integer, String> entry : items.entrySet()){
//                System.out.println("id: " + entry.getKey()+  "- tasks :"  + entry.getValue() );
//            }
//        }
//    }


    }


