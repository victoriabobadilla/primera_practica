/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primera_practica;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Primera_Practica 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
         Scanner lector=new Scanner(System.in);
        System.out.println("LA TABLA DE MULTIPLICAR");
     
        int numero=1 , i=0;
        System.out.println("ingresa un numero:");
        numero=lector.nextInt();
        System.out.println("tabla de multiplicar:");
        do
        {            
        System.out.println(numero+"*"+i+"="+(numero*i));
        i++;
        } 
        while (i<=12);
    }
    
}
