/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_5_poo;

/**
 *
 * @author Estudiante
 */
import java.util.Scanner;
public class Clase_5_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el numero de cuenta");
        int numero = lectura.nextInt();
        System.out.println("Ingrese la clave");
        int clave = lectura.nextInt();
        System.out.println("Ingrese el dueno");
        String dueno = lectura.next();
        System.out.println("Saldo: ");
        double saldo = lectura.nextDouble();
        Cuenta c1 = new Cuenta(numero, clave, dueno, saldo);
        c1.consignar(1000000);
        System.out.println("Saldo actual: "+ c1.ConsultarSaldo());
        
        
        
        
    }
    
}
