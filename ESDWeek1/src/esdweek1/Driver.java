/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esdweek1;

import java.util.Scanner;

/**
 *
 * @author Tom
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter lengths of triangle: ");
        Scanner input = new Scanner(System.in);
        int value1 = input.nextInt();
        int value2 = input.nextInt();
        int value3 = input.nextInt();
        Triangle triangle = new Triangle(value1, value2, value3);
    }
    
}
