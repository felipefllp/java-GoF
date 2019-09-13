package jogo;

public class EspecFeiticeiro extends Espec {
    
    private String nome;
    
    private int modForca;
    private int modDestreza;
    private int modInteligencia;
    private int modConstituicao;
    private int modCarisma;
    
    private String ataqueFraco;
    private String ataqueForte;
    private String ataqueEspecial;

    public EspecFeiticeiro() {
        this.nome = "Feiticeiro";
        
        this.modForca = 0;
        this.modDestreza = 0;
        this.modInteligencia = 5;
        this.modConstituicao = 3;
        this.modCarisma = 2;
        
        this.ataqueFraco = "Aplica maldição no inimigo";
        this.ataqueForte = "Aplica maldição em vários inimigos";
        this.ataqueEspecial = "Invoca um demônio em chamas que ataca os inimigos";
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
