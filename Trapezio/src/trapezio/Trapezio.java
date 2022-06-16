/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trapezio;
import java.util.Scanner;

/**
 *
 * @author marti
 */
public class Trapezio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declarando variaveis.
        float altura, baseMaior, baseMenor, mE, area;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe a altura do Trapézio: ");
        altura = input.nextFloat();
        //lendo dados variavel altura.
        
        System.out.println("Informe a base maior do Trapézio: ");
        baseMaior = input.nextFloat();
        //lendo dados variavel base maior.
        
        System.out.println("Informe a base menor do Trapézio: ");
        baseMenor = input.nextFloat();
        // lendo dados da variavel base menor.
        
        // calculo da area
        area = ((baseMaior+baseMenor)* altura)/2;
        // recebendo media.
        
        mE = (baseMaior-baseMenor)/2;
        
        //saida
        
        System.out.println("A area é: " + area);
        System.out.println("A mediana de Euler é: " + mE);
        
        
    }
    
}
