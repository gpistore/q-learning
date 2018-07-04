package main;

import qlearning.QLearning;

public class Main {

    public static void main(String[] args) {
        qlearning.QLearning QL = new QLearning();
        QL.init();
        int max_tent = 50;
        GUI.tela tela = new GUI.tela();
        int time = 50;
        for(int i=0;i<max_tent;i++) {
            tela.desenhar();
            QL.atual = QL.inicial;
            do{
                int dir = QL.getdirecao(QL.atual);
                tela.pintar(QL.atual,0);
                QL.doAcao(QL.atual, dir);
                tela.pintar(QL.atual,1);

                if(i>25){
                   time=500;
                }
                try {
                    Thread.currentThread().sleep(time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }while (QL.eterminal() == false);
            QL.escreveQ();
        }





    }

}

