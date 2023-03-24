/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4;

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
        Data fimDoMundo = new Data();
        
        // Setando a data
        fimDoMundo.setDia(12);
        fimDoMundo.setMes(12);
        fimDoMundo.setAno(2012);
        
        // Printando na tela
        fimDoMundo.mostrarData();
        fimDoMundo.proximoDia();
        
        // Objeto 2
        Data obj2 = new Data();
        
        // Setando a data
        obj2.setDia(22);
        obj2.setMes(2);
        obj2.setAno(2022);
        
        // Printando na tela
        obj2.mostrarData();
        obj2.proximoDia();
        
        // Objeto 3
        Data obj3 = new Data();
        
        // Setando a data
        obj3.setDia(31);
        obj3.setMes(12);
        obj3.setAno(2014);
        
        // Printando na tela
        obj3.mostrarData();
        obj3.proximoDia();
        
    }
    
}
