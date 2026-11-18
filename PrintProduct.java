/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreport;

/**
 *
 * @author Student
 */

public class PrintProduct {
    public void PrintTotal(int total){
        System.out.println("TOTAL PRODUCT SALES: " + total);
    }
    public void PrintAverage(double avg) {
        System.out.println("AVERAGE PRODUCT SALES: " +(int) avg);
    }
    public void PrintMostPopular(String popular){
        System.out.println("MOST POPULAR PRODUCT: " + popular);
    }
}    

