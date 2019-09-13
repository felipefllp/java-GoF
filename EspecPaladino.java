package jogo;

public class EspecPaladino extends Espec {
    
    private String nome;
    
    private int modForca;
    private int modDestreza;
    private int modInteligencia;
    private int modConstituicao;
    private int modCarisma;
    
    private String ataqueFraco;
    private String ataqueForte;
    private String ataqueEspecial;

    public EspecPaladino() {
        this.nome = "Paladino";
        
        this.modForca = 3;
        this.modDestreza = 0;
        this.modInteligencia = 4;
        this.modConstituicao = 2;
        this.modCarisma = 5;
        
        this.ataqueFraco = "Bate com o escudo no inimigo";
        this.ataqueForte = "Executa corte com a espada";
        this.ataqueEspecial = "Invoca luz vingadora sagrada em vários inimigos";
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
