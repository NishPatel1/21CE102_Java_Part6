/*
 * Created by:- Nishkumar Patel
 * Id:- 21CE102
 * Aim:- Write a program to solve producer-consumer problem using thread Synchronization.
 * Github Repository Link:- https://github.com/NishPatel1/21CE102_Java_Part6.git
 */

public class ThreadPrac5 {
    public static void main(String[] args) throws InterruptedException{
        // Object of a class that has both produce()
        // and consume() methods
        final ThreadCons_Prod pc = new ThreadCons_Prod();
        // Create producer thread
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    pc.producer();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        // Create consumer thread
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    pc.consumer();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        // Start both threads
        t1.start();
        t2.start();
        // t1 finishes before t2
        t1.join();
        t2.join();
    }
}
