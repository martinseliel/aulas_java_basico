/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipo;

/**
 *
 * @author marti
 */
public class TesteTipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //convertendo inteiro para String
        
        /*int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);*/
        
       //convertendo string para inteiro.
       
        String valor = "30.5";
        float idade = Float.parseFloat(valor);
        System.out.printf("%3f \n", idade);
    }
    
}
