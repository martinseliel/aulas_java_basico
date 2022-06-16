/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
       float nota = teclado.nextFloat();
       String nome = teclado.nextLine();
       
       // System.out.println("A nota é " + nota);
        System.out.printf("A nota de %s é %.2f \n",nome, nota);
    }
    
}
