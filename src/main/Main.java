package main;

import qlearning.QLearning;

public class Main {

    public static void main(String[] args) {
        qlearning.QLearning QL = new QLearning();
        QL.init();



        GUI.tela tela = new GUI.tela();
        try {
            tela.desenhar();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static boolean estadofinal(int estado){
        if (estado == 50) {
            return true;
        }else{
            return false;
        }
    }



}

