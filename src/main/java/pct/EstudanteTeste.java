/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author EtecMorato
 */
public class EstudanteTeste {
    
    public static void main(String[] args) {
        //criando instancia do objeto
         Estudante  estaEstudando = new Estudante();
    
         //Contruindo o objeto
         estaEstudando.setNome("Rodrigo");
         estaEstudando.setRa(5);
         estaEstudando.setFrequencia(5); 
         estaEstudando.setprimeiraChamada(2.5); 
         estaEstudando.setsegundaChamada(2.5);
         
         
    estaEstudando.exibirEstudando(); 
    
     
}
    
}