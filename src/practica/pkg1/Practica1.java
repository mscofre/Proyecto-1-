/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg1;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.print ("Ingrese su edad: ");
        edad = sc.nextInt();
        if (edad<=0){
            System.out.println("!!ERROR!! Ingrese una edad valida ");
        }else if(edad>=150){
            System.out.println("!!ERROR!! Ingrese una edad valida ");
        }else if(edad>=105){
            System.out.println("Usted es de edad avanzada ");        
        }else if(edad>=65){
            System.out.println("Usted es de tercera edad ");
        }else if(edad>=18){
            System.out.println("Eres mayor de edad ");
        }else {
            System.out.println("Eres menor de edad");
        }
         System.out.println("Esto fue realizado por Michael Cofre");
    }
    
}
