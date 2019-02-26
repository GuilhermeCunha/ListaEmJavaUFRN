package exercicio3;

/**
 *
 * @author aluno
 */
public class Exercicio3 {

    public static void main(String[] args) {
        int n=30;
        int somaimpares = 0;
        float multpares = 1;
        while(n!=0){
            if(n%2!=0) somaimpares+= n;
            if(n%2==0) multpares*=n;
            n--;
        }
        
        System.out.println("Soma dos impares: " + somaimpares);
        System.out.println("Multiplicação dos pares: " + multpares);
    }
    
}
