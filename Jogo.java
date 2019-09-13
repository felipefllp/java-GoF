
package jogo;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Jogo {

    public static void main(String[] args) {
        
        DinheiroServidor ds = DinheiroServidor.getInstancia();
        Conversor conversor = new Conversor(ds);
        Player player = new Player(conversor);
        
        
        Object  opt = "";
        Object  optespec = "";
        
        Object[] playerraca = { "Humano", "Elfo", "Anão" };

        Object[] playerespec = { "Guerreiro", "Arqueiro", "Mago" };
        
        Object[] lojaespec = { "Comprar: Paladino - R$15.35", "Comprar: Druida - R$13.45", "Comprar: Feiticeiro - R$11.74", "Voltar" };
        
        Object[] opcoes = { "Jogar", "Loja", "Sair" };
        
        
        //opcoes = Arrays.copyOf(opcoes, opcoes.length + 1);
        //opcoes[opcoes.length - 1] = "asd";
        
        while(!opt.equals("Jogar")){
            
            opt = JOptionPane.showInputDialog(null,"Opcões:\n\n","Menu Principal",JOptionPane.PLAIN_MESSAGE,null,opcoes,"Jogar");

            if(opt.equals("Sair")){
                
                System.exit(0);
                
            }else if(opt.equals("Loja")){

                while(!opt.equals("Voltar")){
                    opt = JOptionPane.showInputDialog(null,"Dinheiro: R$"+ player.getDinheiro() +"\n\nOpcões:\n\n","Loja",JOptionPane.PLAIN_MESSAGE,null,lojaespec,lojaespec[0]);

                    if(!opt.equals("Voltar")){
                        Object[] lojaespecnew = new Object[lojaespec.length-1];

                        int j = 0;
                        for(int i = 0 ; i < lojaespec.length ; i++){
                            if(!opt.equals(lojaespec[i])){
                                lojaespecnew[j] = lojaespec[i];
                                j++;
                            }
                        }
                        lojaespec = Arrays.copyOf(lojaespecnew, lojaespecnew.length);

                        String newespec = opt.toString();
                        
                        String moneys = newespec.split(" ")[3];
                        moneys = moneys.substring(2);
                        double money = Double.parseDouble(moneys);
                        
                        newespec = newespec.split(" ")[1];
                        
                        player.realizaPagamento(money);
                        
                        JOptionPane.showMessageDialog(null,"Parabéns! Você agora possui a especialização: "+newespec, "Sucesso", JOptionPane.INFORMATION_MESSAGE);

                        playerespec = Arrays.copyOf(playerespec, playerespec.length + 1);
                        playerespec[playerespec.length - 1] = newespec;
                    }
                }
            }
        }
        if(opt.equals("Jogar")){
            EspecFactory fabricae = new EspecFactory();
            PersonagemFactory fabricap = new PersonagemFactory();
            
            opt = JOptionPane.showInputDialog(null,"Escolha a raça do personagem:\n\n","Escolha de raça",JOptionPane.PLAIN_MESSAGE,null,playerraca,playerraca[0]);
            optespec = JOptionPane.showInputDialog(null,"Escolha a especialização do personagem:\n\n","Escolha de especialização",JOptionPane.PLAIN_MESSAGE,null,playerespec,playerespec[0]);
            
            Espec e1 = fabricae.criaEspec(optespec.toString());
            Personagem p1 = fabricap.criaPersonagem(opt.toString(),e1);


            personagemDetalhes(p1);
        }
    }
    
    public static void personagemDetalhes(Personagem p){

        JOptionPane.showMessageDialog(null,"O personagem escolhido é da raça "+p.getRaca()+" e especialidade "+p.getEspec().getNome()+".\n\nSeus atributos são:\nForça: "+p.getForca()+"\nDestreza: "+p.getDestreza()+"\nInteligência: "+p.getInteligencia()+"\nConstituição: "+p.getConstituicao()+"\nCarisma: "+p.getCarisma()+"\n\nSuas habilidades são:\nAtaque Fraco:\n-"+p.getEspec().getAtaqueFraco()+"\n\nAtaque Forte:\n-"+p.getEspec().getAtaqueForte()+"\n\nAtaque Especial:\n-"+p.getEspec().getAtaqueEspecial(), "Detalhes do personagem", JOptionPane.INFORMATION_MESSAGE);
        
        
        String input;
        System.out.println("=========================================");
        System.out.println("=========================================\n\n");
        System.out.println("             Iniciando o Jogo\n\n");
        System.out.println("Você encontrou um inimigo, o que deseja fazer?\n\n");
        
        System.out.print("1 - Ataque Fraco\n2 - Ataque Forte\n3 - Ataque Especial\n");
        input = System.console().readLine();
        System.out.print("");
        
        while((Integer.parseInt(input) < 1)||(Integer.parseInt(input) > 3)){
            System.out.print("\nComando inválido!\n\n1 - Ataque Fraco\n2 - Ataque Forte\n3 - Ataque Especial\n");
            input = System.console().readLine();
            System.out.print("");
        }
        
        if(Integer.parseInt(input) == 1){
            p.getEspec().ataqueFraco();
        }else if(Integer.parseInt(input) == 2){
            p.getEspec().ataqueForte();
        }else if(Integer.parseInt(input) == 3){
            p.getEspec().ataqueEspecial();
        }
        
        System.out.print("\n\nO inimigo sofreu dano, mas continua vivo, o que deseja fazer?\n\n");
        
        System.out.print("1 - Ataque Fraco\n2 - Ataque Forte\n3 - Ataque Especial\n");
        input = System.console().readLine();
        System.out.print("");
        
        while((Integer.parseInt(input) < 1)||(Integer.parseInt(input) > 3)){
            System.out.print("\nComando inválido!\n\n1 - Ataque Fraco\n2 - Ataque Forte\n3 - Ataque Especial\n");
            input = System.console().readLine();
            System.out.print("");
        }
        
        if(Integer.parseInt(input) == 1){
            p.getEspec().ataqueFraco();
        }else if(Integer.parseInt(input) == 2){
            p.getEspec().ataqueForte();
        }else if(Integer.parseInt(input) == 3){
            p.getEspec().ataqueEspecial();
        }
        
        System.out.print("\n\nO inimigo foi derrotado, vitória!\n");
        
    }
}












