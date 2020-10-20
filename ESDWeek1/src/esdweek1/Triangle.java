/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esdweek1;

/**
 *
 * @author Tom
 */
public class Triangle  {

    public Triangle(int value1, int value2, int value3) {
        int side1 = value1;
        int side2 = value2;
        int side3 = value3;
        
        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is an equilateral triangle.");
        }
        
        if ((side1 == side2 && side2 != side3) || (side1 == side3 && side2 != side3)
                || (side2 == side3 && side1 != side2)) {
            System.out.println("The triangle is an isoceles triangle.");
        }
        
        if (side1 != side2 && side2 != side3 && side1 != side3) {
            System.out.println("The triangle is a scalene triangle.");
        }
    }
}