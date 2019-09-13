package jogo;

public class EspecGuerreiro extends Espec {
    
    private String nome;
    
    private int modForca;
    private int modDestreza;
    private int modInteligencia;
    private int modConstituicao;
    private int modCarisma;
    
    private String ataqueFraco;
    private String ataqueForte;
    private String ataqueEspecial;

    public EspecGuerreiro() {
        this.nome = "Guerreiro";
        
        this.modForca = 3;
        this.modDestreza = 2;
        this.modInteligencia = 0;
        this.modConstituicao = 6;
        this.modCarisma = 0;
        
        this.ataqueFraco = "Executa corte com a espada";
        this.ataqueForte = "Executa ataque no chão que causa terremoto ferindo inimigos";
        this.ataqueEspecial = "Corre girando a espada e atacando todos inimigos no caminho";
    }

    public String getAtaqueFraco() {
        return ataqueFraco;
    }

    public String getAtaqueForte() {
        return ataqueForte;
    }

    public String getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public String getNome() {
        return nome;
    }

    public int getModForca() {
        return modForca;
    }

    public int getModDestreza() {
        return modDestreza;
    }

    public int getModInteligencia() {
        return modInteligencia;
    }

    public int getModConstituicao() {
        return modConstituicao;
    }

    public int getModCarisma() {
        return modCarisma;
    }
    
    void executaAtaqueFraco() {
        System.out.println(this.ataqueFraco);
    }
    
    void executaAtaqueForte() {
        System.out.println(this.ataqueForte);
    }
    
    void executaAtaqueEspecial() {
        System.out.println(this.ataqueEspecial);
    }

}
