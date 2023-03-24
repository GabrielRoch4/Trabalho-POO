/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2;

/**
 *
 * @author Gabriel
 */
public class Empregado {

    // Atributos
    private String primeiroNome;   
    private String sobrenome;   
    private double salarioMensal;
    
    // Setter do priemeiro nome
    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    // Setter do sobrenoeme
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    // Setter do salário mensal
    public void setSalarioMensal(double salarioMensal) {
        
        // Setando 1302 para o salario que seja menor que 1302
        if(salarioMensal < 1302.0){
            this.salarioMensal = 1302.0;
        }else {
            this.salarioMensal = salarioMensal;
        }
        
    }
    
    // Método para exibir informações
    public void mostarInformacoes() {
        
        System.out.println(primeiroNome + " " + sobrenome + ": R$" + (salarioMensal * 12) +
                           "\nSalario mensal com aumento: R$" + (salarioMensal + (salarioMensal * 0.1)) + "\n");       
    }
    
}
