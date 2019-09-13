package jogo;

public class Conversor implements InterfaceConversor{

    DinheiroServidor ds;

    public Conversor(DinheiroServidor ds){
        this.ds = ds;
    }

    public void setMoney(double money){
        ds.addDinheiro(RtoD(money));
    }

    public double RtoD(double money){
        return money * 0.27;
    }
}
