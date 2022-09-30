/*
 * Created by:- Nishkumar Patel
 * Id:- 21CE102
 * Aim:- Write a program to create thread which display “Hello World” message.
 * A. by extending Thread class
 * B. by using Runnable interface.
 * Github Repository Link:- https://github.com/NishPatel1/21CE102_Java_Part6.git
 */

public class ThreadExaPrac1b implements Runnable {

    ThreadExaPrac1b() {}

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Hello World");
    }
}
