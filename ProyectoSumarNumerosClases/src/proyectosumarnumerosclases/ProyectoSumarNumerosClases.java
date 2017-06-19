/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosumarnumerosclases;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class ProyectoSumarNumerosClases {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
	System.out.prinltn("Ingrese un numero");
        int a = Input.nextInt();
	System.out.prinlnt("Ingrese otro numero");
        int b = Input.nextInt();
        System.out.println("La suma de "+ a + "+" + b + " es: " + (a+b));
    }
    
}
