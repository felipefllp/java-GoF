package jogo;

public class EspecFactory {
    
    public Espec criaEspec(String espec){
        Espec e = null;
        
        if(espec.equals("Arqueiro")){
            e = new EspecArqueiro();
        }else if(espec.equals("Guerreiro")){
            e = new EspecGuerreiro();
        }else if(espec.equals("Mago")){
            e = new EspecMago();
        }else if(espec.equals("Druida")){
            e = new EspecDruida();
        }else if(espec.equals("Feiticeiro")){
            e = new EspecFeiticeiro();
        }else if(espec.equals("Paladino")){
            e = new EspecPaladino();
        }
        return e;
    }
}
