package jogo;

public class PersHumano extends Personagem {
    
    public PersHumano(Espec espec){
        setEspec(espec);
        setRaca("Humano");
        
        setForca(14 + espec.getModForca());
        setDestreza(12 + espec.getModDestreza());
        setInteligencia(13 + espec.getModInteligencia());
        setConstituicao(13 + espec.getModConstituicao());
        setCarisma(13 + espec.getModCarisma());
    }
}
