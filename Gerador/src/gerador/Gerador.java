/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerador;

/**
 *
 * @author marti
 */
public class Gerador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int total = 0;
       int indice;
       
       for (indice = 0; indice <= 10; indice++){
           total = (int) (Math.random()*100);
           System.out.println(total);
       }
    }
    
}
