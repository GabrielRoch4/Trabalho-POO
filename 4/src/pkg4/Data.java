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
public class Data {
 
    // Atributos
    private int dia;
    private int mes;
    private int ano;

    // Getter do dia
    public int getDia() {
        return dia;
    }

    // Setter do dia
    public void setDia(int dia) {
        
        if(dia>0 && dia<=31){
            this.dia = dia;
        }else {
            this.dia = 0;
        }
        
    }

    // Getter do mês
    public int getMes() {
        return mes;
    }

    // Setter do mês
    public void setMes(int mes) {
        
        if(mes>0 && mes<=12){
            this.mes = mes;
        }else {
            this.mes = 0;
        }
        
    }

    // Getter do ano
    public int getAno() {
        return ano;
    }

    // Setter do ano
    public void setAno(int ano) {
        
        if(ano > 1999 && ano < 2026){
            this.ano = ano;
        }else {
            this.ano = 0;
        }
        
    }
    
    // Método para mostar a data na tela
    public void mostrarData(){
        
        String data;
        
        /* Condições para mostrar ou não a data concatenada com "0" antes 
        do dia ou mês menor que 10 */
        if(dia<10 && mes<10){
            
            data = "0"+dia+"/"+"0"+mes+"/"+ano;
            System.out.println("Data atual: "+data);
            
        }else if(dia>10 && mes<10){
            
            data = dia+"/"+"0"+mes+"/"+ano;
            System.out.println("Data atual: "+data);
            
        }else if(dia<10 && mes>10){
            
            data = "0"+dia+"/"+mes+"/"+ano;
            System.out.println("Data atual: "+data);
                    
        }else if(dia > 10 && mes > 10){
            
            data = dia+"/"+mes+"/"+ano;
            System.out.println("Data atual: "+data);
            
        }
            
    }
    
    // Método para mostrar na tela o próximo dia de uma data aleatória
    public void proximoDia(){
        
        // Condições para encontrar o próximo dia
        if(dia < 31){
            dia++;
        }else if(dia == 31 && mes < 12){
            dia = 1;
            mes++;
        }else if(dia == 31 && mes == 12){
            dia = 1;
            mes = 1;
            ano++;
        }
        
        /* Condições para mostrar ou não a data concatenada com "0" antes 
        do dia ou mês menor que 10 */
        if(dia<10 && mes<10){
            
            System.out.println("Proxima data: "+"0"+dia+"/"+"0"+mes+"/"+ano+"\n");
            
        }else if(dia>10 && mes<10){
            
            System.out.println("Proxima data: "+dia+"/"+"0"+mes+"/"+ano+"\n");
            
        }else if(dia<10 && mes>10){
            
            System.out.println("Proxima data: "+"0"+dia+"/"+mes+"/"+ano+"\n");
                    
        }else if(dia > 10 && mes > 10){
            
            System.out.println("Proxima data: "+dia+"/"+mes+"/"+ano+"\n");
            
        }
        
    }
    
}
