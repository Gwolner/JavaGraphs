package graficojava;

import java.util.ArrayList;
import java.util.Collections;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;


public class GraficoPizza implements GraficBehavier {
    
    @Override
    public ChartPanel criarGrafico(ArrayList<Integer> listNumber){
        
        DefaultPieDataset pizza = new DefaultPieDataset();
        
        for(int i=0; i < listNumber.size(); i++){
          pizza.setValue(""+listNumber.get(i), listNumber.get(i));
        }
    
        JFreeChart grafico = ChartFactory.createPieChart("Grafico de pizza", pizza, false, false, false);
        ChartPanel painel = new ChartPanel(grafico);
        //add(painel); 
        
        return painel;        
    }   
}
