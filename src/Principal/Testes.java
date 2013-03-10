/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import javax.swing.*;
/**
 *
 * @author Maiko
 */
public class Testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int resposta;
        String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        resposta = JOptionPane.showConfirmDialog(null, "Seu nome é " + nome);
        if(resposta == JOptionPane.YES_OPTION){
         JOptionPane.showMessageDialog(null, "Seu nome é "+ nome);   
        }else{
         JOptionPane.showMessageDialog(null, "Seu nome não é esse ?" + nome);
        }
        System.out.println("Que merda é essa");
            
    }
}
