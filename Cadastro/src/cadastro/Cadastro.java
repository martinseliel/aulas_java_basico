/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;
import java.util.Scanner;

/**
 *
 * @author marti
 */
public class Cadastro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //criar um scanner para obter entrada a apartir da janela de comando
    
    Scanner entrada = new Scanner(System.in);
    
    String nome, cidade, rua, estado;
    int idade, n_casa;
    
        System.out.println("Informe seu Nome: ");
        nome = entrada.nextLine();
        
        System.out.println("Informe  sua Cidade: ");
        cidade = entrada.nextLine();
        
        System.out.println("Informe seu endereço: ");
        rua = entrada.nextLine();
        
        System.out.println("Digite seu estado: ");
        estado = entrada.nextLine();
        
        System.out.println("Qual a sua idade: ");
        idade = entrada.nextInt();
        
        System.out.println("Qual o numero da sua casa: ");
        n_casa = entrada.nextInt();
        
        System.out.println("ola senhor\n" + nome+ "\nA sua cidade\n" + cidade + "\ne muito bonita");
               
        
       
       
    }
    
}
