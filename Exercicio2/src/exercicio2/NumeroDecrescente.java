/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author aluno
 */
public class NumeroDecrescente {
    public int decrescer(int n){
        System.out.println(n);
        if(n==0) return 0;
        return decrescer(n-1);
    }
}
