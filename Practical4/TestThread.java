/*
 * Created by:- Nishkumar Patel
 * Id:- 21CE102
 * Aim:- Write a program to solve producer-consumer problem using thread Synchronization.
 * Github Repository Link:- https://github.com/NishPatel1/21CE102_Java_Part6.git
 */

public class TestThread {
    public static void main(String[] args) {
        TheradExample First = new TheradExample();
        TheradExample Second = new TheradExample();
        TheradExample Third = new TheradExample();

        First.setPriority(3);
        Third.setPriority(7);

        System.out.println("Priority of First Thread is " + First.getPriority());
        System.out.println("Priority of Second Thread is " + Second.getPriority());
        System.out.println("Priority of Third Thread is " + Third.getPriority());
    }
}
