/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

/**
 *
 * @author marti
 */
public class Aluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int nota1 = 4;
     int nota2 = 5;
     
     int resultado = (nota1 + nota2)/2;
     
     if (resultado >= 5){
         System.out.println("Aluno Aprovado");
         }else {
         System.out.println("Aluno Reprovado");
         // Se o resultado for maior ou igual a 5 exibe Aluno  Aprovado, senao exibe aluno Reprovado.
     }
    }
    
}
