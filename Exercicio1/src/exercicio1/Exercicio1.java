package exercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class Exercicio1 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Escreva dois numeros para consultar qual o maior:");
        
        MaiorNumero numeros = new MaiorNumero();
        
        JOptionPane.showMessageDialog(null, numeros.consultaValor(Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro valor?")), Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo valor?"))));
    }
    
}
