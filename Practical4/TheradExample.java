/*
 * Created by:- Nishkumar Patel
 * Id:- 21CE102
 * Aim:- Write a program to create three threads ‘FIRST’, ‘SECOND’, ‘THIRD’. 
 * Set the priority of the ‘FIRST’ thread to 3, the ‘SECOND’ thread to 5(default) and the ‘THIRD’ thread to 7.
 * Github Repository Link:- https://github.com/NishPatel1/21CE102_Java_Part6.git
 */

public class TheradExample extends Thread{

    TheradExample() {}
    
    TheradExample(String s){
        super(s);
    }

    @Override
    public void run() {
        System.out.println("Hello world");
    }
}