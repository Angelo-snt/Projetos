// AQUI CRIAR OS METODOS A LOGICA POR TRAS DO RELATORIO


public class Relatorio {
 
    String Relatorio;
    private float Tanque, capacidade, extrato;
    float VDucha;
    public Relatorio(){
       // int valor = VendasView.getvalor();
        capacidade=-20000;
    }//FECHA CONSTRUTOR  
 public void abastecer (float tmpValor){
        this.extrato += tmpValor;
        this.Relatorio += "abastecimento de -------- R$ " + Control.fmtMoeda.format(tmpValor) + "\n";
    }
 public void adicional (float tmpValor){
     
 }
        //METODO ABASTECER
            boolean abastecer2(float tmpLitros) {
                if (capacidade - tmpLitros < capacidade){
                    return false;
                }else {

                Relatorio += "Abastecimento de : " + tmpLitros + " Litros\n";
                Tanque-=tmpLitros;
        return true;
        }
            }//fehcha abastecer
            
                public String verRelatorio() {
        return Relatorio;

    }


    }
                

