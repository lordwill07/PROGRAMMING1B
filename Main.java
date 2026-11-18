/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreport;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        int[][] sales = new int[3][3];

        // Ask for sales 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j+1) 
                    + " for " + products[i] + " mattress: ");
                sales[i][j] = input.nextInt();
            }
            System.out.println();
        }

        Product p = new Product(products, sales);
        PrintProduct printer = new PrintProduct();

        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("**************");
        printer.PrintTotal(p.GetTotalProductsSold());
        printer.PrintAverage(p.GetAverageProductSold());
        printer.PrintMostPopular(p.GetMostPopularProduct());
    }
}
        
    
