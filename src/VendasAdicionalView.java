
import javax.swing.*; //pacote grafico: Joption, Jframe...
import java.awt.*; //pacote para usar o container
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class VendasAdicionalView extends JFrame implements ActionListener {

    public static Container ctnApp; //copntainer principal

//declaração de objetos
    public static JLabel lblTitulo1, lblPreco, lblBanner;
    public static JButton btnDucha, btnOleo, btnBalance, btnCafe, btnOk, btnProsseg;
    public static JTextField ValorCombus;
    public static ImageIcon imgApp;

//declaraçao das fontes
    public static Font fntTitulos = new Font("impact", Font.BOLD, 32);
    public static Font fntcombus = new Font("Monospaced", Font.BOLD, 25);
    public static Font fntPreenche = new Font("Monospaced", Font.BOLD, 35);

    public VendasAdicionalView() {

        ctnApp = new Container();
        ctnApp.setLayout(null);
        this.add(ctnApp); //add Container no JFrame

        imgApp = new ImageIcon("img/banner.png");
        lblBanner = new JLabel(imgApp);
        lblBanner.setBounds(0, 0, 1400, 110);
        ctnApp.add(lblBanner);

        lblTitulo1 = new JLabel("SERVIÇOS ADICIONAIS");
        lblTitulo1.setFont(fntTitulos);
        lblTitulo1.setForeground(new Color(0, 0, 50));
        lblTitulo1.setBounds(540, 120, 1400, 100);
        ctnApp.add(lblTitulo1);
//DUCHA
        btnDucha = new JButton("Ducha Ecológica");
        btnDucha.addActionListener(this);
        btnDucha.setFont(fntcombus);
        btnDucha.setForeground(new Color(47, 79, 79));
        btnDucha.setBounds(440, 300, 320, 30);
        ctnApp.add(btnDucha);

        lblPreco = new JLabel("R$ 8,00");
        lblPreco.setFont(fntTitulos);
        lblPreco.setForeground(new Color(255, 102, 0));
        lblPreco.setBounds(880, 300, 120, 30);
        ctnApp.add(lblPreco);

//TROCA DE OLEO
        btnOleo = new JButton("Troca de Óleo");
        btnOleo.addActionListener(this);
        btnOleo.setFont(fntcombus);
        btnOleo.setForeground(new Color(47, 79, 79));
        btnOleo.setBounds(440, 340, 320, 30);
        ctnApp.add(btnOleo);

        lblPreco = new JLabel("R$ 50,00");
        lblPreco.setFont(fntTitulos);
        lblPreco.setForeground(new Color(255, 102, 0));
        lblPreco.setBounds(880, 340, 190, 30);
        ctnApp.add(lblPreco);

//Balanceamento
        btnBalance = new JButton("Balanceamento");
        btnBalance.addActionListener(this);
        btnBalance.setFont(fntcombus);
        btnBalance.setForeground(new Color(47, 79, 79));
        btnBalance.setBounds(440, 380, 320, 30);
        ctnApp.add(btnBalance);

        lblPreco = new JLabel("R$ 35,00");
        lblPreco.setFont(fntTitulos);
        lblPreco.setForeground(new Color(255, 102, 0));
        lblPreco.setBounds(880, 380, 190, 30);
        ctnApp.add(lblPreco);

//CAFÉ
        btnCafe = new JButton("Café");
        btnCafe.addActionListener(this);
        btnCafe.setFont(fntcombus);
        btnCafe.setForeground(new Color(47, 79, 79));
        btnCafe.setBounds(440, 420, 320, 30);
        ctnApp.add(btnCafe);

        lblPreco = new JLabel("R$ 2,00");
        lblPreco.setFont(fntTitulos);
        lblPreco.setForeground(new Color(255, 102, 0));
        lblPreco.setBounds(880, 420, 120, 30);
        ctnApp.add(lblPreco);

        //BOTAO OK
        /*
        btnOk = new JButton("ADICIONAR SERVIÇO");
        btnOk.addActionListener(this);
        btnOk.setFont(fntcombus);
        btnOk.setForeground(new Color(0,0,0));
        btnOk.setBackground(new Color (255,102,31));
        btnOk.setBounds(290,520,320,45);
        ctnApp.add(btnOk);
         */
        btnProsseg = new JButton("PROSSEGUIR");
        btnProsseg.addActionListener(this);
        btnProsseg.setFont(fntcombus);
        btnProsseg.setForeground(new Color(0, 0, 0));
        btnProsseg.setBackground(new Color(255, 102, 31));
        btnProsseg.setBounds(450, 520, 320, 45);
        ctnApp.add(btnProsseg);

        //CONFIGURAÇOES DA JANELA
        this.setLocation(340, 80);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1400, 700);
        this.setVisible(true);
        ctnApp.setBackground(new Color(153, 153, 153));

    } //construtor

    public void actionPerformed(ActionEvent evt) {

        //método getSource recebe o nome do botao 'clicado'
        //AQUI AÇÕES PARA OS BOTOES  
        if (evt.getSource() == btnDucha) {
           
            btducha ();
           /* String VDucha = "8";       //DANDO VALOR A DUCHA
            float Vducha = Float.parseFloat(VDucha);

            Control.objRelatorio.abastecer(Vducha);

            JOptionPane.showMessageDialog(null,
                    "O total da sua compra foi " + Control.fmtMoeda.format(Vducha + VendasView.litros()),
                    "Abastecimento", JOptionPane.WARNING_MESSAGE);
            
            */

            VendasAdicionalView objapp = new VendasAdicionalView();
            //   litrosE  litrosGC  litrosGAD  litrosdies
        } else if (evt.getSource() == btnOleo) {
            String VOleo = "50";       //DANDO VALOR 
            float Voleo = Float.parseFloat(VOleo);

            Control.objRelatorio.abastecer(Voleo);

            JOptionPane.showMessageDialog(null,
                    "O total da sua compra foi " + Control.fmtMoeda.format(Voleo + VendasView.litros()),
                    "Abastecimento", JOptionPane.WARNING_MESSAGE);

            //VendasAdicionalView objapp = new VendasAdicionalView();
        } else if (evt.getSource() == btnBalance) {
            String VBalance = "35";       //DANDO VALOR 
            float Vbalance = Float.parseFloat(VBalance);

            Control.objRelatorio.abastecer(Vbalance);

            JOptionPane.showMessageDialog(null,
                    "O total da sua compra foi " + Control.fmtMoeda.format(Vbalance + VendasView.litros()),
                    "Abastecimento", JOptionPane.WARNING_MESSAGE);

            //VendasAdicionalView objapp = new VendasAdicionalView();
        } else if (evt.getSource() == btnCafe) {
            String VCafe = "2";       //DANDO VALOR 
            float Vcafe = Float.parseFloat(VCafe);

            Control.objRelatorio.abastecer(Vcafe);

            JOptionPane.showMessageDialog(null,
                    "O total da sua compra foi " + Control.fmtMoeda.format(Vcafe + VendasView.litros()),
                    "Abastecimento", JOptionPane.WARNING_MESSAGE);

            //VendasAdicionalView objapp = new VendasAdicionalView();
        }
    }
    public static float btducha(){
        String VDucha = "8";       //DANDO VALOR A DUCHA
            float Vducha = Float.parseFloat(VDucha);

            Control.objRelatorio.abastecer(Vducha);

            JOptionPane.showMessageDialog(null,
                    "O total da sua compra foi " + Control.fmtMoeda.format(Vducha + VendasView.litros()),
                    "Ducha", JOptionPane.WARNING_MESSAGE);
            
            return Vducha;
    }
}
