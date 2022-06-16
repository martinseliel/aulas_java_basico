/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decisao1;

/**
 *
 * @author marti
 */
public class Decisao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade, limite;
        idade = 16;
        limite = 18;
        
        if (idade < limite){
            System.out.println("Esta pessoa nao tem idade suficiente para entrar no recinto");
            
        } else {
            System.out.println("Esta pessoa já tem idade suficiente para entrar no recinto.");
        }
    }
    
}
