/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

/**
 *
 * @author aluno
 */
public class ComparaNumero {
    public void compara(int a, int b){
        if(a==b){
            System.out.println("A e B são iguais");
        }else{
            if(a>b){
                System.out.println("A:" + a + ">" + "B:" + b);
            }else{
                System.out.println("B:" + b + ">" + "A:" + a);
            }
        }
    }
}
