/*
 * Created by:- Nishkumar Patel
 * Id:- 21CE102
 * Aim:- Write a program to increment the value of one variable by one and display 
 * it after one second using thread using sleep() method.
 * Github Repository Link:- https://github.com/NishPatel1/21CE102_Java_Part6.git
 */

public class ThreadSleep extends Thread{
    
    ThreadSleep() {}
    
    ThreadSleep(String s){
        super(s);
    }

    @Override
    public void run() {
        int i;
        for(i=0;i<5;i++){
            System.out.println(i);
            try{
                sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
