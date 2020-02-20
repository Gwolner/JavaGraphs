package graficojava;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFrame;
import org.jfree.chart.ChartPanel;

public class Grafico extends JFrame {
    
    ChartPanel painel;
    int quantNumber;
    ArrayList<Integer> listNumber;
    GraficBehavier graficBehavier;
    
    public Grafico(int quantNumber){
        listNumber = new ArrayList<Integer>();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Grafico Pizza");
        setSize(950,700);
        setLocationRelativeTo(null);
    }

    public int getQuantNumber() {
        return quantNumber;
    }

    public void setQuantNumber(int quantNumber) {
        this.quantNumber = quantNumber;
        for(int i=1; i <= this.quantNumber;i++){
            this.listNumber.add(i);
        }
        Collections.shuffle(this.listNumber);
        Collections.shuffle(this.listNumber);
    }    
    
    public GraficBehavier getGraficBehavier() {
        return this.graficBehavier;
    }

    public void setGraficBehavier(GraficBehavier graficBehavier) {
 
        if(painel != null){
            remove(painel);
        }
        removeAll();
        this.graficBehavier = graficBehavier;             
        painel = graficBehavier.criarGrafico(this.listNumber);
        add(painel);
        setVisible(true);//Tem de ser antes do setVisible() senão o gráfico não aparece!  
    }
    
    
    
    
}
