package jogo;

public class Admin implements Observer {

    String nome;
    SistemaDeMensagens sdm;

    public Admin(String nome, SistemaDeMensagens sdm) {
        this.nome = nome;
        this.sdm = sdm;
    }

    public void update() {
        String msg = sdm.getMsg();
        System.out.println("Admin "+this.nome+" recebeu a mensagem: "+msg);
    }
}
