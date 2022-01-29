
import java.text.DecimalFormat;


public class Control {

    public static Relatorio objRelatorio; 
    public static DecimalFormat fmtMoeda;
    public static VendasAdicionalView objVendas;
    public static void main(String[] args) {
        
            fmtMoeda = new DecimalFormat("0.00");
            objRelatorio = new Relatorio();
                SistemaView objTela = new SistemaView();

    }
    
}
