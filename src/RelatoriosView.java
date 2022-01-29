import javax.swing.*; //pacote grafico: Joption, Jframe...
import java.awt.*; //pacote para usar o container
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.text.DecimalFormat;




public class RelatoriosView extends JFrame {

public static Container ctnApp, ctnGastos, ctnVendas, ctnLucro; //copntainers

//declaração de objetos
public static JLabel lblTitulo1, lblBanner, lblGastos, lblVendas, lblLucro; 
public static ImageIcon imgApp;

//declaraçao das fontes
public static Font fntTitulos = new Font("impact", Font.BOLD, 32);
public static Font fntcombus = new Font ("Monospaced", Font.BOLD, 25);
public static Font fntPreenche = new Font("Monospaced Bold", Font.BOLD, 35);

public static DecimalFormat fmtmoeda=new DecimalFormat("0.00");

    public RelatoriosView (){   
        
        ctnApp = new Container();
        ctnApp.setLayout(new GridLayout(1,3));
        this.add(ctnApp); //add Container no JFrame
        ctnApp.setVisible(true); 
        
//GASTOS NORTH
        ctnGastos = new Container();
        ctnGastos.setLayout(null);
        ctnApp.add("1",ctnGastos);
        
        lblGastos = new JLabel("GASTOS");
        lblGastos.setFont(fntPreenche);
        lblGastos.setForeground(new Color(255,102,20));
        lblGastos.setBounds(100,15,466,100);
        ctnGastos.add(lblGastos);
        
        
//VENDAS CENTER
        ctnVendas = new Container();
        ctnVendas.setLayout(null);
        ctnApp.add("2", ctnVendas);
        
        lblVendas = new JLabel("VENDAS");
        lblVendas.setFont(fntPreenche);
        lblVendas.setForeground(new Color(255,102,20));
        lblVendas.setBounds(160,15,466,100);
        ctnVendas.add(lblVendas);
        
          
//LUCRO SOUTH
        ctnLucro = new Container();
        ctnLucro.setLayout(null);
        ctnApp.add("3",ctnLucro);

        lblLucro = new JLabel("LUCRO");
        lblLucro.setFont(fntPreenche);
        lblLucro.setForeground(new Color(255,102,20));
        lblLucro.setBounds(160,15,466,100);
        ctnLucro.add(lblLucro);
        
        
        
        
        //CONFIG DA JANELA
        this.setLocation(340, 80);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1400,700);
        this.setVisible(true);
        
        
    }
        
        public void carregarRelatorio(){ //AINDA TEM QUE SABER COMO FAZ.. É MAIS OU MENOS ASSIM
        float litros;
        

        try{
        
            litros = VendasView.litros();
            

               
                
            
            
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        
        

        }
}
