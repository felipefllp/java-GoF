package jogo;

public class PersElfo extends Personagem {
    
    public PersElfo(Espec espec){
        setEspec(espec);
        setRaca("Elfo");
        
        setForca(12 + espec.getModForca());
        setDestreza(14 + espec.getModDestreza());
        setInteligencia(13 + espec.getModInteligencia());
        setConstituicao(13 + espec.getModConstituicao());
        setCarisma(12 + espec.getModCarisma());
    }
}
