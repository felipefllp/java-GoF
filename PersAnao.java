package jogo;

public class PersAnao extends Personagem {
    
    public PersAnao(Espec espec){
        setEspec(espec);
        setRaca("Anão");
        
        setForca(15 + espec.getModForca());
        setDestreza(11 + espec.getModDestreza());
        setInteligencia(11 + espec.getModInteligencia());
        setConstituicao(15 + espec.getModConstituicao());
        setCarisma(10 + espec.getModCarisma());
    }
}