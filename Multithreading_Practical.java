/**
 * NOTE: We create a class that extends the java.lang.Thread class. This class overrides the run() 
 * method available in the Thread class. A thread begins its life inside run() method. We create an 
 * object of our new class and call start() method to start the execution of a thread. Start() 
 * invokes the run() method on the Thread object.
 */


// Create our first thread
class Thread1 extends Thread{
    @Override
    public void run(){
        int n = 50;
        while(n-- > 0){
            System.out.println("Hello I'm Hrittik From Thread 1");
        }
    }
}

// Create out second thread
class Thread2 extends Thread{
    @Override
    public void run(){
        int n = 50;
        while(n-- > 0){
            System.out.println("Hello I'm Hrittik From Thread 2");
        }
    }
}

class Multithreading_Practical{
    public static void main(String[] args) {
        Thread1 t1 = new Thread1(); // Creating object of Thread1 class
        Thread2 t2 = new Thread2(); // Creating object of Thread2 class
        t1.start(); // Starting thread 1
        t2.start(); // Starting thread 2
    }
}