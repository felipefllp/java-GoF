package jogo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DinheiroServidor {

    private double dinheiro;
    private static DinheiroServidor instanciaUnica = null;
    private SistemaDeMensagens sistmsg;
    
    private DinheiroServidor(){
        this.dinheiro = 150.54;
        this.sistmsg = SistemaDeMensagens.getInstancia();
        
        Admin admin1 = new Admin("Felipe", sistmsg);
        sistmsg.register(admin1);
    }
    
    public static DinheiroServidor getInstancia(){
        if(instanciaUnica == null){
            instanciaUnica = new DinheiroServidor();
        }
        return instanciaUnica;
    }

    public double getDinheiro(){
        return this.dinheiro;
    }

    public void addDinheiro(double money){
        sistmsg.setMsg("Dinheiro recebido: $"+money);
        
        this.dinheiro = dinheiro + money;
        this.dinheiro = round(this.dinheiro,2);
        
        sistmsg.setMsg("Novo saldo: $"+this.dinheiro);
    }
    
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
}
