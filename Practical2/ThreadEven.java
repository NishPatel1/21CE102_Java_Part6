/*
 * Created by:- Nishkumar Patel
 * Id:- 21CE102
 * Aim:- Generate 15 random numbers from 1 to 100 and store it in an int array. 
 * Write a program to display the numbers stored at odd indexes by thread1 and 
 * display numbers stored at even indexes by thread2.
 * Github Repository Link:- https://github.com/NishPatel1/21CE102_Java_Part6.git
 */

public class ThreadEven extends Thread{
    int[] arr = new int[15];

    ThreadEven(int[] arr){
        for (int i=0;i<15;i++) {
            this.arr[i] = arr[i];
        }
    }

    @Override
    public void run() {
        for (int i=0;i<15;i++) {
            if(arr[i]%2==0)
                System.out.println("Even number is " + arr[i]);
        }
    }
}
