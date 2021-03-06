/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
import java.util.*;
/**
 *
 * @author carlosneira
 */
public class Assignment1Tester {

//        int[] testArr = {0, -3, 5, -4, -2, 3, 1, 0};
//      int[] arr = {10,10,-5,25,-5};
    public static void main(String[] args) {
        int[] testArr1 = {0, -3, 5, -4, -2, 3, 1, 0};
        int[] testArr2 = {0, 3, 5, 14, 22, 33, 41, 50};
        indexStability(testArr1);
        
        System.out.println(terSearch(testArr2,0,7,99));
        
    }
    
     public static void indexStability(int[] arr){
        int all = 0;
        int sumLeft= 0;
        for (int num : arr){
            all += num;
        }
        for(int num = 0; num < arr.length; num++){
         int sumRight = all - sumLeft - arr[num]; 
         if(sumLeft==sumRight){
            System.out.println(num);
        }
       sumLeft = sumLeft + arr[num]; 
        }
    }

     public static int terSearch(int[] arr, int l, int r, int x){
         if ( l > r )
        {
            return -1;
        }
        
        int d1 = l + ((r - l) / 3);
        int d2 = d1 + ((r - l) / 3);

        if (arr[d1] == x)
        {
            return d1;
        }
        else if (arr[d2] == x)
        {
            return d2;
        }
        else if ( x < arr[d1])
        {
            return terSearch(arr, l, d1 - 1, x);
        }
        else if ( x > arr[d2])
        {
            return terSearch(arr, d2 + 1, r, x);
        }
        else
        {
            return terSearch(arr, d1, d2, x);
        }
     }
}
