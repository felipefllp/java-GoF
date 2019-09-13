package jogo;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class Player {
    
    private InterfaceConversor conv;
    private double dinheiro;

    public Player(InterfaceConversor conv) {
        this.dinheiro = 50.18;
        this.conv = conv;
    }
    
    public void realizaPagamento(double money){
        conv.setMoney(money);
        this.setDinheiro(round(this.getDinheiro()-money, 2));
    }
    
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
    
    

}
