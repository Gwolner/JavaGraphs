package graficojava;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class GraficoDeBarra implements GraficBehavier{
    
     
    public ChartPanel criarGrafico(ArrayList<Integer> listNumber){
        
        DefaultCategoryDataset barra = new DefaultCategoryDataset();
        
        for(int i=0; i < listNumber.size(); i++){
          barra.setValue(listNumber.get(i),""+listNumber.get(i),"");
        }
        
        JFreeChart grafico = ChartFactory.createBarChart("Gráfico de Barra","B","C",barra, PlotOrientation.VERTICAL, false, false, false);
        ChartPanel painel = new ChartPanel(grafico);
        //add(painel);
    
        return painel; 
    }
}
