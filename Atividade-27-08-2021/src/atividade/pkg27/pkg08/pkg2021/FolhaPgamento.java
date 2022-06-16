/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.pkg27.pkg08.pkg2021;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author marti
 */

public class FolhaPgamento {
    
    ArrayList<Funcionario> funcionario = new ArrayList<>();
    Funcionario func;
    Scanner input = new Scanner(System.in);
    int n;
    float salarioBase;
    
    public FolhaPagamento(int n, float salarioBase){
        this.n = n;
        this.salarioBase = salarioBase;
    }
    private Funcionario inputData (int i){
        System.out.println("Informe o nome do funcionario " + i +":");
        String nome =input.nextLine();
        
        System.out.println("Informe as horas trabalhadas do fiuncionario " +i+" : ");
        float hora = input.nextFloat();
        
        while(true){
            System.out.println("Informe o cargo do funcionario " +i+" : ");
            System.out.println(Arrays.toString(Turno.values()));
            String c = input.next();
            
            try{
                turno = Turno.valueOf(t); 
                break;
            }catch(IllegalArgumentException e){
                System.out.println("Turno não existe!");
                
            }
        }
    }
}
