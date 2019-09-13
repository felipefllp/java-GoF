package jogo;

public class EspecArqueiro extends Espec {
    
    private String nome;
    
    private int modForca;
    private int modDestreza;
    private int modInteligencia;
    private int modConstituicao;
    private int modCarisma;
    
    private String ataqueFraco;
    private String ataqueForte;
    private String ataqueEspecial;

    public EspecArqueiro() {
        this.nome = "Arqueiro";
        
        this.modForca = 2;
        this.modDestreza = 6;
        this.modInteligencia = 1;
        this.modConstituicao = 0;
        this.modCarisma = 0;
        
        this.ataqueFraco = "Dispara uma flecha no inimigo";
        this.ataqueForte = "Dispara duas flechas no inimigo";
        this.ataqueEspecial = "Dispara chuva de flechas no campo de batalha (57 flechas)";
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
