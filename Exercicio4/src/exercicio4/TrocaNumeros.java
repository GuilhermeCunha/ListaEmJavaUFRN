/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author aluno
 */
public class TrocaNumeros {
    public void troca(int a, int b){
        int z;
        z=b;
        b=a;
        a=z;
        System.out.println("a: "+ a +"\nb: " + b);
    }
}
