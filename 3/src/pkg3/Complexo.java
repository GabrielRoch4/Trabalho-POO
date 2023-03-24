/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3;

/**
 *
 * @author Gabriel
 */
public class Complexo {
    
    // Atributos
    private int numeroReal1;
    private int numeroReal2;
    private int numeroImaginario1;
    private int numeroImaginario2;

    // Getter do número real 1
    public int getNumeroReal1() {
        return numeroReal1;
    }

    // Setter do número real 1
    public void setNumeroReal1(int numeroReal1) {
        this.numeroReal1 = numeroReal1;
    }

    // Getter do número real 2
    public int getNumeroReal2() {
        return numeroReal2;
    }

    // Setter do número real 2
    public void setNumeroReal2(int numeroReal2) {
        this.numeroReal2 = numeroReal2;
    }

    // Getter do número imaginário 1
    public int getNumeroImaginario1() {
        return numeroImaginario1;
    }

    // Setter do número imaginário 1
    public void setNumeroImaginario1(int numeroImaginario1) {
        this.numeroImaginario1 = numeroImaginario1;
    }

    // Getter do número imaginário 2
    public int getNumeroImaginario2() {
        return numeroImaginario2;
    }

    // Setter do número imaginário 2
    public void setNumeroImaginario2(int numeroImaginario2) {
        this.numeroImaginario2 = numeroImaginario2;
    }
    
    // Método para somar o número complexo
    public String somaComplexo(){
       
       // Primeiro é realizado a soma dos números reais e após a dos imaginários  
       int complexoReal = numeroReal1 + numeroReal2;
       int complexoImaginario = numeroImaginario1 + numeroImaginario2;
       
       // Concatenando os números no formato da soma e com resultado com "i" no final
       String numeroComplexo = "Soma: ("+numeroReal1+numeroImaginario1+"i) + " +"("+ numeroReal2+ numeroImaginario2 +"i) = "+complexoReal+" + "+complexoImaginario+"i"+"\n";
       
       return numeroComplexo;
       
    }
}
