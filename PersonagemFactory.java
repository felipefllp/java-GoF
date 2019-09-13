package jogo;

public class PersonagemFactory {
    
    public Personagem criaPersonagem(String raca, Espec espec){
        Personagem p = new Personagem();
        
        if(raca.equals("Elfo")){
            p = new PersElfo(espec);
        }else if(raca.equals("Humano")){
            p = new PersHumano(espec);
        }else if(raca.equals("Anão")){
            p = new PersAnao(espec);
        }
        return p;
    }
}
