package jogo;

public class EspecDruida extends Espec {
    
    private String nome;
    
    private int modForca;
    private int modDestreza;
    private int modInteligencia;
    private int modConstituicao;
    private int modCarisma;
    
    private String ataqueFraco;
    private String ataqueForte;
    private String ataqueEspecial;

    public EspecDruida() {
        this.nome = "Druida";
        
        this.modForca = 0;
        this.modDestreza = 3;
        this.modInteligencia = 5;
        this.modConstituicao = 0;
        this.modCarisma = 2;
        
        this.ataqueFraco = "Dispara raio lunar no inimigo";
        this.ataqueForte = "Invoca raio solar no inimigo";
        this.ataqueEspecial = "Bate com o cajado no chão e causa um clarão que cura aliados e fere inimigos";
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
