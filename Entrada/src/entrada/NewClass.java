/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada;
import java.util.Scanner;
/**
 *
 * @author marti
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    int idade;
    String nome;
    
    System.out.printf("Informe sua idade:\n");
    idade = ler.nextInt();
    
    ler.nextLine();
    
        System.out.printf("\nInforme seu nome:\n");
        nome =ler.nextLine();
        
        System.out.printf("\nResultado:\n");
        System.out.printf("%s tem %d anos.\n", nome,idade);
        
    
    }
        
}
