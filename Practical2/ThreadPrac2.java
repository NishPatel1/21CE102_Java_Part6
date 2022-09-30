/*
 * Created by:- Nishkumar Patel
 * Id:- 21CE102
 * Aim:- Generate 15 random numbers from 1 to 100 and store it in an int array. 
 * Write a program to display the numbers stored at odd indexes by thread1 and 
 * display numbers stored at even indexes by thread2.
 * Github Repository Link:- https://github.com/NishPatel1/21CE102_Java_Part6.git
 */

import java.util.*;

public class ThreadPrac2{
    public static void main(String[] args) {
        int arr[] = new int[15];
         //here we use Random Class take A Random Number Between 0 to 100
         Random r = new Random();
         for(int i=0;i<15;i++)
         {
             arr[i] = r.nextInt(100);
         }
         ThreadOdd o = new ThreadOdd(arr);
         ThreadEven e = new ThreadEven(arr);
 
         o.start();
         e.start();
    }
}
