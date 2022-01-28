
import javax.swing.*; //pacote grafico: Joption, Jframe...
import java.awt.*; //pacote para usar o container
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class VendasView extends JFrame implements ActionListener {

    public static Container ctnApp; //copntainer principal

//declaração de objetos
    public static JLabel lblTitulo1, lblPreco, lblBanner;
    public static JButton btnEtanol, btnGasComum, btnGasAdtv, btnDiesel, btnOk;
    public static JTextField ValorCombus;
    public static ImageIcon imgApp;
    public static int abastvalor;

    public int valordigi;

//declaraçao das fontes
    public static Font fntTitulos = new Font("impact", Font.BOLD, 32);
    public static Font fntcombus = new Font("Monospaced", Font.BOLD, 25);
    public static Font fntPreenche = new Font("Monospaced", Font.BOLD, 35);

    public static DecimalFormat fmtmoeda = new DecimalFormat("0.00");

    public VendasView() {
        ctnApp = new Container();
        ctnApp.setLayout(null);
        this.add(ctnApp); //add Container no JFrame

        imgApp = new ImageIcon("img/banner.png");
        lblBanner = new JLabel(imgApp);
        lblBanner.setBounds(0, 0, 1400, 110);
        ctnApp.add(lblBanner);

        lblTitulo1 = new JLabel("SELECIONE O COMBUSTÍVEL E O VALOR DESEJADO:");
        lblTitulo1.setFont(fntTitulos);
        lblTitulo1.setForeground(new Color(0, 0, 50));
        lblTitulo1.setBounds(370, 120, 1400, 100);
        ctnApp.add(lblTitulo1);
//ETANOL 
        btnEtanol = new JButton("Etanol");
        btnEtanol.addActionListener(this);
        btnEtanol.setFont(fntcombus);
        btnEtanol.setForeground(new Color(47, 79, 79));
        btnEtanol.setBounds(440, 300, 320, 30);
        ctnApp.add(btnEtanol);

        lblPreco = new JLabel("R$ 2,39");
        lblPreco.setFont(fntTitulos);
        lblPreco.setForeground(new Color(255, 102, 0));
        lblPreco.setBounds(880, 300, 120, 30);
        ctnApp.add(lblPreco);

//GASOLINA COMUM
        btnGasComum = new JButton("Gasolina Comum");
        btnGasComum.addActionListener(this);
        btnGasComum.setFont(fntcombus);
        btnGasComum.setForeground(new Color(47, 79, 79));
        btnGasComum.setBounds(440, 340, 320, 30);
        ctnApp.add(btnGasComum);

        lblPreco = new JLabel("R$ 4,19");
        lblPreco.setFont(fntTitulos);
        lblPreco.setForeground(new Color(255, 102, 0));
        lblPreco.setBounds(880, 340, 120, 30);
        ctnApp.add(lblPreco);

//GASOLINA ADTV
        btnGasAdtv = new JButton("Gasolina Aditivada");
        btnGasAdtv.addActionListener(this);
        btnGasAdtv.setFont(fntcombus);
        btnGasAdtv.setForeground(new Color(47, 79, 79));
        btnGasAdtv.setBounds(440, 380, 320, 30);
        ctnApp.add(btnGasAdtv);

        lblPreco = new JLabel("R$ 4,39");
        lblPreco.setFont(fntTitulos);
        lblPreco.setForeground(new Color(255, 102, 0));
        lblPreco.setBounds(880, 380, 120, 30);
        ctnApp.add(lblPreco);

//DIESEL
        btnDiesel = new JButton("Diesel");
        btnDiesel.addActionListener(this);
        btnDiesel.setFont(fntcombus);
        btnDiesel.setForeground(new Color(47, 79, 79));
        btnDiesel.setBounds(440, 420, 320, 30);
        ctnApp.add(btnDiesel);

        lblPreco = new JLabel("R$ 3,29");
        lblPreco.setFont(fntTitulos);
        lblPreco.setForeground(new Color(255, 102, 0));
        lblPreco.setBounds(880, 420, 120, 30);
        ctnApp.add(lblPreco);

        /* ONDE PREENCHE VALOR PARA ABASTECER
        ValorCombus = new JTextField();
        ValorCombus.setFont(fntcombus);
        ValorCombus.setBounds(530, 520, 200, 45);
        ctnApp.add(ValorCombus);

        /*BOTAO OK
        btnOk = new JButton("OK");
        btnOk.addActionListener(this);
        btnOk.setFont(fntcombus);
        btnOk.setForeground(new Color(0, 0, 0));
        btnOk.setBackground(new Color(255, 102, 31));
        btnOk.setBounds(780, 520, 90, 45);
        ctnApp.add(btnOk);
         */
        //CONFIGURAÇOES DA JANELA
        this.setLocation(340, 80);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1320, 630);
        this.setVisible(true);
        ctnApp.setBackground(new Color(153, 153, 153));

    } //construtor

    public void actionPerformed(ActionEvent evt) {

        //método getSource recebe o nome do botao 'clicado'
        //AQUI AÇÕES PARA OS BOTOES  
        if (evt.getSource() == btnEtanol) {
            btetanol();
            VendasAdicionalView objapp = new VendasAdicionalView();

        } else if (evt.getSource() == btnGasComum) {
            btgas();
            VendasAdicionalView objapp = new VendasAdicionalView();

        } else if (evt.getSource() == btnGasAdtv) {
            btgasadtv();
            VendasAdicionalView objapp = new VendasAdicionalView();

        } else if (evt.getSource() == btnDiesel) {
            btdies();
            VendasAdicionalView objapp = new VendasAdicionalView();

        }
    }

    public static float btetanol() {
        float litrosE;
        float valor = Float.parseFloat(
            JOptionPane.showInputDialog(
                "Entre com o valor que deseja abastecere: "));
                
        Control.objRelatorio.abastecer(valor);
        litrosE = (float) ((valor) / 2.39);       //VALOR DO LT DO ETANOL
            JOptionPane.showMessageDialog(null,
                "Seu abastecimento de " + Control.fmtMoeda.format(valor) + " reais"
                + " \n Gerou " + Control.fmtMoeda.format(litrosE) + " Litros",
                "Abastecimento", JOptionPane.WARNING_MESSAGE);

        return litrosE;

    }

    public static float btgas() {
        float litrosGC;
        float valor = Float.parseFloat(
            JOptionPane.showInputDialog(
                "Entre com o valor que deseja abastecer: "));

        Control.objRelatorio.abastecer(valor);
        litrosGC = (float) ((valor) / 4.19);       //VALOR DO LT DA GASOLINA COMUM
            JOptionPane.showMessageDialog(null,
                "Seu abastecimento de " + Control.fmtMoeda.format(valor) + " reais"
                + " \n Gerou " + Control.fmtMoeda.format(litrosGC) + " Litros",
                "Abastecimento", JOptionPane.WARNING_MESSAGE);

        return litrosGC;
    }

    public static float btgasadtv() {
        float litrosGAD;
        float valor = Float.parseFloat(
            JOptionPane.showInputDialog(
                "Entre com o valor que deseja abastecer: "));

        Control.objRelatorio.abastecer(valor);
        litrosGAD = (float) ((valor) / 4.39);       //VALOR DO LT DA GASOLINA ADITIVADA
            JOptionPane.showMessageDialog(null,
                "Seu abastecimento de " + Control.fmtMoeda.format(valor) + " reais"
                + " \n Gerou " + Control.fmtMoeda.format(litrosGAD) + " Litros",
                "Abastecimento", JOptionPane.WARNING_MESSAGE);

        return litrosGAD;
    }

    public static float btdies() {
        float litrosdies;
        float valor = Float.parseFloat(
            JOptionPane.showInputDialog(
                "Entre com o valor que deseja abastecer: "));

        Control.objRelatorio.abastecer(valor);
        litrosdies = (float) ((valor) / 3.29);       //VALOR DO LT DA GASOLINA ADITIVADA
            JOptionPane.showMessageDialog(null,
                "Seu abastecimento de " + Control.fmtMoeda.format(valor) + " reais"
                + " \n Gerou " + Control.fmtMoeda.format(litrosdies) + " Litros",
                "Abastecimento", JOptionPane.WARNING_MESSAGE);

        return litrosdies;
    }

    public static float litros() {
        float litros;
        litros = btetanol() + btgas() + btgasadtv() + btdies();

        return litros;
    }

    public float getlitros() {
        return VendasView.litros();
    }

}
