/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficojava;

import java.util.ArrayList;
import org.jfree.chart.ChartPanel;

/**
 *
 * @author Wolf
 */
public interface GraficBehavier {
    
    public ChartPanel criarGrafico(ArrayList<Integer> listNumber);
    
}
