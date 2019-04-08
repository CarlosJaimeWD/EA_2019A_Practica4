/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;
import practica4.Calculadora;
import java.util.Scanner;

/**
 *
 * @author carlosjaime
 */
public class TestCalculadora {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        int option = 0;
        double numero1 = 0;
        double numero2 = 0;
        double numero3 = 0;
        System.out.println("0 Salir\n"
                + "1 Suma de 2 numeros\n"
                + "2 Suma de 3 numeros\n"
                + "3 Resta de 2 numeros\n"
                + "4 Resta de 3 numeros\n"
                + "5 Division\n"
                + "6 Multiplicacion\n");
        
        do {
            System.out.print("digite opcion: ");
            option = in.nextInt();
            switch (option) {
                case 0:
                    break;
                case 1:
                    System.out.print("Digite numero1: ");
                    numero1 = in.nextDouble();
                    System.out.print("Digite numero2: ");
                    numero2 = in.nextDouble();
                    System.out.println("Resultado: " + Calculadora.Suma(numero1, numero2));
                    break;
                case 2:
                    System.out.print("Digite numero1: ");
                    numero1 = in.nextDouble();
                    System.out.print("Digite numero2: ");
                    numero2 = in.nextDouble();
                    System.out.print("Digite numero3: ");
                    numero3 = in.nextDouble();
                    System.out.println("Resultado: " + Calculadora.Suma(numero1, numero2, numero3));
                    break;
                case 3:
                    System.out.print("Digite numero1: ");
                    numero1 = in.nextDouble();
                    System.out.print("Digite numero2: ");
                    numero2 = in.nextDouble();
                    System.out.println("Resultado: " + Calculadora.Resta(numero1, numero2));
                    break;
                case 4:
                    System.out.print("Digite numero1: ");
                    numero1 = in.nextDouble();
                    System.out.print("Digite numero2: ");
                    numero2 = in.nextDouble();
                    System.out.print("Digite numero3: ");
                    numero3 = in.nextDouble();
                    System.out.println("Resultado: " + Calculadora.Resta(numero1, numero2, numero3));
                    break;  
                case 5:
                    System.out.print("Digite numero1: ");
                    numero1 = in.nextDouble();
                    System.out.print("Digite numero2: ");
                    numero2 = in.nextDouble();
                    System.out.println("Resultado: " + Calculadora.Division(numero1, numero2));
                    break;
                case 6:
                    System.out.print("Digite numero1: ");
                    numero1 = in.nextDouble();
                    System.out.print("Digite numero2: ");
                    numero2 = in.nextDouble();
                    System.out.println("Resultado: " + Calculadora.Multiplicacion(numero1, numero2));
                    break;    
            }
        } while (option != 0);
    }  
}
