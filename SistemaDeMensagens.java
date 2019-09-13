package jogo;

public class SistemaDeMensagens extends Subject {

    private String mensagem;
    
    private static SistemaDeMensagens instanciaUnica = null;
    
    private SistemaDeMensagens(){

    }
    
    public static SistemaDeMensagens getInstancia(){
        if(instanciaUnica == null){
            instanciaUnica = new SistemaDeMensagens();
        }
        return instanciaUnica;
    }

    public String getMsg() {
        return mensagem;
    }

    public void setMsg(String msg) {
        this.mensagem = msg;
        notifica();
    }
}
