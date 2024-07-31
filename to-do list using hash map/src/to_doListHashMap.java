import java.util.*;
import java.util.HashMap;

public class to_doListHashMap {
    static Scanner scanner = new Scanner(System.in);

    //create an hash map called items
    HashMap<Integer, String> items = new HashMap<Integer, String>();
    //Add your keys and values ( task, no of task )
    Scanner in = new Scanner(System.in);
    private int taskId = 1;


    public  void addTask() {
        System.out.println("add a task");

        while (true) {
            System.out.println("Task: ");
            String task = scanner.nextLine();


            if (task.equalsIgnoreCase("exit")) {
                break;
            }


            items.put(taskId++, task);
            System.out.println("Task has been added: " + task);

        }
    }

    public void viewTask() {

        if (items.isEmpty()) {
            System.out.println("No tasks to be displayed");
        } else {
            for (Map.Entry<Integer, String> m : items.entrySet()) {

                System.out.println(m.getKey() + ". " + m.getValue());
            }

        }
    }

    public void editTask() {
        viewTask();
         if (!items.isEmpty()) {
             System.out.println("Enter number of task to be edited ");
             String b = scanner.nextLine();

             int hashCode = b.hashCode();
             int index = hashCode % items.size();

              if (items.containsKey(index)) {
                  String key = items.get(index);
                  System.out.println("Enter new task: ");
                  String newTask = scanner.nextLine();
                 items.put(index, newTask);
                System.out.println("Task edited successfully!");
                } else {
                    System.out.println("Task not found!");
              }
             } else {
             System.out.println("No tasks available to edit!");
         }
        }


    public void delete() {
        //displaying the hash map
        viewTask();

        System.out.println("Input the index to be deleted: ");
        int red = scanner.nextInt();

        if (items.containsKey(red)) {
            items.remove(red);

            // Shift values up to the indexes
            for (int i = red; i < items.size(); i++) {
                items.put(i, items.get(i + 1));
            }

            items.remove(items.size() - 1);

            System.out.println("Item has been successfully deleted ");
        } else {
            System.out.println("Item not found. Key in one of the available options ");
            return;
        }
    }

        public void exit(){
            System.out.println("Exiting the program...");
         }
    }








