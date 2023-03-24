/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2;

/**
 *
 * @author Gabriel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Objeto 1
        Empregado obj1 = new Empregado();
        
        // Setando valores do objeto 1
        obj1.setPrimeiroNome("Julio");
        obj1.setSobrenome("Silva");
        obj1.setSalarioMensal(1000);
        
        // Exibindo os valores do objeto 1
        obj1.mostarInformacoes();
        
        // Objeto 2
        Empregado obj2 = new Empregado();
        
        // Setando valores do objeto 2
        obj2.setPrimeiroNome("Maria");
        obj2.setSobrenome("Paula");
        obj2.setSalarioMensal(35000);
        
        // Exibindo os valores do objeto 2
        obj2.mostarInformacoes();
        
    }
    
}
