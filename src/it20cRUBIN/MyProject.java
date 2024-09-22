/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package it20cRUBIN;

/**
 *
 * @author Erick James Rubin
 */
public class MyProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] Cars = {"Lamborghini","GT500","Ford Ranger","Honda Civic","Ferrari"};  
        // Array 'Cars' is initialized with 5 car names
        
        System.out.println("My favorite cars are: ");  
        // Prints an introductory message
        
        // Loop through each element in the 'Cars' array
        for (int i = 0; i < Cars.length; i++){  
            // Prints each car name from the array
            System.out.println(Cars[i]);
        }
    }
    
}
