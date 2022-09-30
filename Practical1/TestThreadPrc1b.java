/*
 * Created by:- Nishkumar Patel
 * Id:- 21CE102
 * Aim:- Write a program to create thread which display “Hello World” message.
 * A. by extending Thread class
 * B. by using Runnable interface.
 * Github Repository Link:- https://github.com/NishPatel1/21CE102_Java_Part6.git
 */

public class TestThreadPrc1b {
    public static void main(String[] args) {
        ThreadExaPrac1b b = new ThreadExaPrac1b();
        Thread t = new Thread(b);
        t.start();
    }
}
