/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifelseperforming;

import java.util.Scanner;

/**
 *
 * @author Slime nightmare
 */
public class IfElsePerforming {

    /**
     * @param args the command line arguments
     */
    public static String performIfElse(int n){
        if(n%2 != 0 || (n >= 6 && n <= 20)){
            return "Weird";
        }
        else if(n%2 == 0 && (n> 20 || (n>=2 && n<= 4))){
            return "Not Weird";
        }
        return null;
    }

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(performIfElse(N));
        scanner.close();
    }
    
}
