/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficojava;

/**
 *
 * @author Wolf
 */
public class TesteGrafico {
    
    public static void main(String[] args){
        
        //Instanciando classe Grafico com 15 itens
        Grafico graf = new Grafico(15);
        
        //Atribuindo comportamento de Pizza ao gráfico
        graf.setGraficBehavier(new GraficoPizza());
        
        //Setando 50 itens
        graf.setQuantNumber(50);
        
        //Atribuindo comportamento de Barra ao gráfico
        graf.setGraficBehavier(new GraficoDeBarra());
        
        
    }
}
