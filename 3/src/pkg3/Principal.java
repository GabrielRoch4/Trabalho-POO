/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3;

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
        
        // Obj1
        Complexo obj1 = new Complexo();
        
        // Setando os números
        obj1.setNumeroReal1(4);
        obj1.setNumeroImaginario1(-4);
        obj1.setNumeroReal2(-2);
        obj1.setNumeroImaginario2(-5);
        
        // Printando o formato da soma e o Resultado
        System.out.println(obj1.somaComplexo());
        
        // Obj 2
        Complexo obj2 = new Complexo();
        
        // Setando os números
        obj2.setNumeroReal1(2);
        obj2.setNumeroImaginario1(-5);
        obj2.setNumeroReal2(-2);
        obj2.setNumeroImaginario2(-5);
        
        // Printando o formato da soma e o Resultado
        System.out.println(obj2.somaComplexo());
        
        // Objeto 3
        Complexo obj3 = new Complexo();
        
        // Setando os números
        obj3.setNumeroReal1(2);
        obj3.setNumeroImaginario1(3);
        obj3.setNumeroReal2(-1);
        obj3.setNumeroImaginario2(6);
        
        // Printando o formato da soma e o Resultado
        System.out.println(obj3.somaComplexo());
        
    }
    
}
