
import javax.swing.*;
import java.text.*;

public class SistemaView {
    //método construtor
public static DecimalFormat fmtmoeda=new DecimalFormat("0.00");
    public SistemaView() {
        int opc = 0;
        float valor;
        String msg = "";
        msg += "Entre com a opção desejada:\n\n";
        msg += "1 - Vendas\n";
        msg += "2 - Relatórios\n";
        msg += "3 - Sair";

        do {
          
            
            
            try{
            opc = Integer.parseInt(JOptionPane.showInputDialog(msg));

            if (opc == 1) {  //OPC VENDAS
                                VendasView objapp = new VendasView(); //instanciando classe VendasView
                                break;

               
            } else if (opc == 2) {  //OPC RELATORIOS
                                RelatoriosView objrel = new RelatoriosView(); //instanciando classe RelatoriosView
                                //JOptionPane.showMessageDialog(null, Control.objrel.verRelatorio());
                                break;


            } else if (opc == 3) {  //OPC SAIR
break;
            } else {
               JOptionPane.showMessageDialog(null, "Opção inválida" ); 
            }
            }catch (Exception erro){
            JOptionPane.showMessageDialog(null, "ERRO!!!!");}
        } while (opc != 3);
    }//fechando Construtor
}//fechando Classe
