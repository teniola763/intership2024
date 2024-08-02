//public class threadPractice2 extends Thread {
//    public static void main(String[] args) {
//        threadPractice2 thread = new threadPractice2();
//        thread.start();
//
//        System.out.println("The code is outside ");
//    }
//    public void run(){
//        System.out.println("The code is now running inside a thread ");
//    }
//    }


public class threadPractice2 implements Runnable{
    public static void main(String[] args) {
        threadPractice2 obj = new threadPractice2();
        Thread thread = new Thread(obj);
        thread.start();

        System.out.println("The code is outside");
    }
    public void run (){
        System.out.println("The code is running in a thread ");
    }
}