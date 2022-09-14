/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piv1;

import java.util.Scanner;

/**
 *
 * @author Marie Maldonado
 */
public class PIV1 {
    public static void main(String[] args) {
     Scanner Entrada = new Scanner(System.in);
        float nota1, nota2, nota3, promedio;
        System.out.println("Ingrese la primera nota");
        nota1 = Entrada.nextFloat(); 
        System.out.println("Ingrese la primera nota");
        nota2 = Entrada.nextFloat();
        System.out.println("Ingrese la primera nota");
        nota3 = Entrada.nextFloat();
        promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El primedio es: " + promedio);
        if (promedio >= 7){
            System.out.println("promocionado");    
        } else if (promedio >= 4){
            System.out.println("regular"); 
        } else {
            System.out.println("reprobado"); 
        }
        }

    }
     
        
    
    
