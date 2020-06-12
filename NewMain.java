/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhonatan Salcedo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner sc = new Scanner(System.in);
        //Se toma la dimension del vector y se crean los vectores
        System.out.println("Ingrese la DIMENSION del Vector A:");
        int n = sc.nextInt();              
        int A[] = new int[n];
        int B[] = new int[n];
        int cont = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el elemento: "+i);
            A[i] = sc.nextInt();
        }        
        System.out.println("Ingrese el PID: ");
        int PID =  sc.nextInt();
        if(PID <= n){
        System.out.println("Ingrese el PCD: ");
        int PCD = sc.nextInt();
        
           while(cont < n){
               if((PID+PCD+cont)<n){
                  B[cont] = A[PID+PCD+cont];                  
               }else{                   
                   System.out.println((int)(cont) - (int)(PID+PCD));
                   B[cont] = A[(int)(PID+PCD+cont-n)];
               }               
               cont++;
               System.out.println("Contador:" +cont);
           }           
        System.out.println("Vector A: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
        System.out.println("Vector B: ");
        for (int i = 0; i < n; i++) {
            System.out.print(B[i]);
            System.out.print(" ");
        }      
        }else{
            System.out.println("PID invalido");
        } 
        
    }
    
}
