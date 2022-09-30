/*
 * Created by:- Nishkumar Patel
 * Id:- 21CE102
 * Aim:- Write a program to solve producer-consumer problem using thread Synchronization.
 * Github Repository Link:- https://github.com/NishPatel1/21CE102_Java_Part6.git
 */

import java.util.*;

public class ThreadCons_Prod {
    LinkedList<Integer> a = new LinkedList<Integer>();
    int capacity = 5;

    public void producer() throws InterruptedException{
        int value = 0;
        int i = 0;
        while (i<capacity) {
            synchronized (this){
                // producer thread waits while list
                // is full
                while (a.size() == capacity)
                    wait();
                System.out.println("Producer produced-" + value);
                // to insert the jobs in the list
                a.add(value++);
                // notifies the consumer thread that
                // now it can start consuming
                notify();
                // makes the working of program easier
                // to  understand
                Thread.sleep(1000);
                i++;
            }
        }
    }

    public void consumer() throws InterruptedException{
        int i = 0;
        while (i<capacity) {
            synchronized (this){
                // consumer thread waits while list
                // is empty
                while (a.size() == 0)
                    wait();
                // to retrieve the first job in the list
                int val = a.removeFirst();
                System.out.println("Consumer consumed-" + val);
                // Wake up producer thread
                notify();
                // and sleep
                Thread.sleep(1000);
                i++;
            }
        }
    }
}
