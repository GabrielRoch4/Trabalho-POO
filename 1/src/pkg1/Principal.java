/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1;

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
        Fatura obj1 = new Fatura();
        
        // Setando valores do obj1
        obj1.setNumeroItem(1);
        obj1.setDescricao("Bala Halls Melancia");
        obj1.setQuantidadeComprada(3);
        obj1.setValorUnitario(1.5);
        
        // Imprimindo os valores
        System.out.println("Numero item: "+obj1.getNumeroItem());
        System.out.println(obj1.getDescricao());
        System.out.println("Quantidade comprada: "+obj1.getQuantidadeComprada());
        System.out.println("Valor unitario: R$"+obj1.getValorUnitario());
        System.out.println("Valor da fatura: R$"+obj1.valorFatura());
        System.out.println("\n");
        
        // Objeto 2
        Fatura obj2 = new Fatura();
        
        // Setando valores do obj2
        obj2.setNumeroItem(2);
        obj2.setDescricao("Pizza Moda");
        obj2.setQuantidadeComprada(1);
        obj2.setValorUnitario(90);
        
        // Imprimindo os valores
        System.out.println("Numero item: "+obj2.getNumeroItem());
        System.out.println(obj2.getDescricao());
        System.out.println("Quantidade comprada: "+obj2.getQuantidadeComprada());
        System.out.println("Valor unitario: R$"+obj2.getValorUnitario());
        System.out.println("Valor da fatura: R$"+obj2.valorFatura());
        System.out.println("\n");
        
        // Objeto 3
        Fatura obj3 = new Fatura();
        
        // Setando valores do obj3
        obj3.setNumeroItem(3);
        obj3.setDescricao("Kit kat");
        obj3.setQuantidadeComprada(-1);
        obj3.setValorUnitario(5);
        
        // Imprimindo os valores
        System.out.println("Numero item: "+obj3.getNumeroItem());
        System.out.println(obj3.getDescricao());
        System.out.println("Quantidade comprada: "+obj3.getQuantidadeComprada());
        System.out.println("Valor unitario: R$"+obj3.getValorUnitario());
        System.out.println("Valor da fatura: R$"+obj3.valorFatura());
        System.out.println("\n");
        
    }
    
}
