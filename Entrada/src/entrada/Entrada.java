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
public class Entrada {

    /**
     * @param args the command line arguments
     */
    static final int ano_atual = 2020;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);      
      
        int ano_nascimento,idade;
       
        
        System.out.printf("Digite o ano de nascimento:");
        ano_nascimento = entrada.nextInt();
        
        System.out.println("Infome sua idade: ");
        idade = entrada.nextInt();
        
        
        System.out.printf("Idade = " + (ano_atual - ano_nascimento));
        System.out.println("\nsua idade = " + idade);
    }
    
}
