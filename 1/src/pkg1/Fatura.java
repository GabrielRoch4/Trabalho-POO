/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1;

/**
 *
 * @author Gabriel
 */
public class Fatura {
    
    // Atributos
    private int numeroItem;
    private String descricao;
    private int quantidadeComprada;
    private double valorUnitario;

    // Getter do número do item
    public int getNumeroItem() {
        return numeroItem;
    }

    // Setter do número do item 
    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }
    
    // Getter da descrição do item
    public String getDescricao() {
        
        String decricaoConcatenada = "Descricao do item " + numeroItem+": "; 
        
        return decricaoConcatenada + descricao;
    }

    // Setter da descrição do item
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    // Getter da quantidade comprada
    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    // Setter da quantidade comprada
    public void setQuantidadeComprada(int quantidadeComprada) {
        
        if(quantidadeComprada<0){
            this.quantidadeComprada = 0;
        }else {
            this.quantidadeComprada = quantidadeComprada;
        }
        
    }
    
    // Getter do valor unitário
    public double getValorUnitario() {
        return valorUnitario;
    }

    // Setter do valor unitário
    public void setValorUnitario(double valorUnitario) {
        
        if(valorUnitario>5){
            this.valorUnitario = 5;
        }else {
            this.valorUnitario = valorUnitario;
        }
        
    }
     
    // Método para calcular o vator total da fatura
    public double valorFatura() {
        
        double valorTotal = valorUnitario * quantidadeComprada;
        
        return valorTotal;
    }
}
