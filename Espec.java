package jogo;

public abstract class Espec {
    
    final void ataqueFraco() {
        preparaAtaque();
        executaAtaqueFraco();
    }
    final void ataqueForte() {
        preparaAtaque();
        executaAtaqueForte();
    }
    final void ataqueEspecial() {
        preparaAtaque();
        executaAtaqueEspecial();
    }
    
    final void preparaAtaque() {
        System.out.println("Se prepara para atacar!");
    }
 
    abstract void executaAtaqueFraco();
    abstract void executaAtaqueForte();
    abstract void executaAtaqueEspecial();
    
    abstract String getNome();
    
    abstract int getModForca();
    abstract int getModDestreza();
    abstract int getModInteligencia();
    abstract int getModConstituicao();
    abstract int getModCarisma();
    
    abstract String getAtaqueFraco();
    abstract String getAtaqueForte();
    abstract String getAtaqueEspecial();
}