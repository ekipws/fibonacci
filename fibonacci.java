/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal;

import java.util.Scanner;

/**
 *
 * @author Praktikum
 */
public class fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Eki PWS");
        System.out.println("Input   : ");
        int number = new Scanner(System.in).nextInt();
      
        //printing Fibonacci series upto number
        System.out.println("");
        System.out.println("Output  : ");
        for(int i=1; i<=number; i++){
            System.out.print(fibonacci(i) +" ");
        }
    } 
 
    public static int fibonacci(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        return fibonacci(number-1) + fibonacci(number -2); //tail recursion
    }
}
