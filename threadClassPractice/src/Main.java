//public class main extends Thread {
//    public void run() {
//        System.out.println("This code is running in a thread");
//    }

//    public class main implements Runnable{
//        public void run(){
//            System.out.println("This code is running in a thread ");
//        }
//    }
//}

//example of extends
//public class Main extends Thread {
//    public static void main(String[] args) {
//        Main thread = new Main();
//        thread.start();
//        System.out.println("This code is outside of the  thread ");
//    }
//    public void run(){
//        System.out.println("This code s running in  a thread ");
//
//    }
//
//    }

//example of implements ,obj is used here
//     public class  Main implements Runnable {
//    public static void main(String[] args) {
//        Main obj = new Main();
//        Thread thread = new Thread(obj);
//        thread.start();
//        System.out.println("This code is outside of the  thread ");
//    }
//
//    public void run() {
//        System.out.println("This code s running in  a thread ");
//    }
//}
//

public class  Main extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();


        //waiting for thread to finish
        while(thread.isAlive()) {
            System.out.println("Waiting...");
        }
            //update value and print amount
        System.out.println("Main :" + amount++);
        System.out.println("Main" + amount);

    }
    public void run (){
    System.out.println(amount++);
}
    }

