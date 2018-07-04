package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;

public class tela extends JFrame {
    JFrame Janela = new JFrame();
    JPanel painel;
    JPanel[] panelArray = new javax.swing.JPanel[50];
    Color azulescuro =  new Color(0, 0, 150);
    Color azul =        new Color(0, 0, 255);
    Color azulclaro =   new Color(100, 100, 255);
    Color verde =       new Color(0, 255, 0);
    Color preto=        new Color(0, 0, 0);




    public tela() {
        super("Agente Marte");
        Janela.setMinimumSize(new Dimension(1000,500));
        Janela.setMaximumSize(new Dimension(1000,500));
        Janela.setResizable(false);
        Janela.setTitle("Mapa");
        Janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initcelulas(){

        JPanel cel1 = new  JPanel();JPanel cel2 = new  JPanel(); JPanel cel3 = new  JPanel(); JPanel cel4 = new  JPanel(); JPanel cel5 = new  JPanel();JPanel cel6 = new  JPanel(); JPanel cel7 = new  JPanel();JPanel cel8 = new  JPanel();JPanel cel9 = new  JPanel();JPanel cel10 = new  JPanel();
        JPanel cel11 = new  JPanel(); JPanel cel12 = new  JPanel(); JPanel cel13 = new  JPanel(); JPanel cel14 = new  JPanel(); JPanel cel15 = new  JPanel(); JPanel cel16 = new  JPanel(); JPanel cel17 = new  JPanel(); JPanel cel18 = new  JPanel(); JPanel cel19 = new  JPanel(); JPanel cel20 = new  JPanel();
        JPanel cel21 = new  JPanel(); JPanel cel22 = new  JPanel(); JPanel cel23 = new  JPanel(); JPanel cel24 = new  JPanel(); JPanel cel25 = new  JPanel(); JPanel cel26 = new  JPanel(); JPanel cel27 = new  JPanel(); JPanel cel28 = new  JPanel(); JPanel cel29 = new  JPanel(); JPanel cel30 = new  JPanel();
        JPanel cel31 = new  JPanel(); JPanel cel32 = new  JPanel(); JPanel cel33 = new  JPanel(); JPanel cel34 = new  JPanel(); JPanel cel35 = new  JPanel(); JPanel cel36 = new  JPanel(); JPanel cel37 = new  JPanel(); JPanel cel38 = new  JPanel(); JPanel cel39 = new  JPanel(); JPanel cel40 = new  JPanel();
        JPanel cel41 = new  JPanel(); JPanel cel42 = new  JPanel(); JPanel cel43 = new  JPanel(); JPanel cel44 = new  JPanel(); JPanel cel45 = new  JPanel(); JPanel cel46 = new  JPanel(); JPanel cel47 = new  JPanel(); JPanel cel48 = new  JPanel(); JPanel cel49 = new  JPanel(); JPanel cel50 = new  JPanel();

        cel1.setBackground(azulescuro); cel2.setBackground(azulescuro); cel3.setBackground(azulescuro); cel4.setBackground(azulescuro); cel5.setBackground(preto); cel6.setBackground(preto); cel7.setBackground(azulescuro); cel8.setBackground(azulescuro); cel9.setBackground(azulescuro); cel10.setBackground(azulescuro);
        cel11.setBackground(azul); cel12.setBackground(preto); cel13.setBackground(preto); cel14.setBackground(azul); cel15.setBackground(preto); cel16.setBackground(preto); cel17.setBackground(azul); cel18.setBackground(preto); cel19.setBackground(azul); cel20.setBackground(azul);
        cel21.setBackground(azulclaro); cel22.setBackground(azulclaro); cel23.setBackground(azulclaro); cel24.setBackground(azulclaro); cel25.setBackground(azulclaro); cel26.setBackground(azulclaro); cel27.setBackground(azulclaro); cel28.setBackground(azulclaro); cel29.setBackground(azulclaro); cel30.setBackground(azulclaro);
        cel31.setBackground(azul); cel32.setBackground(azul); cel33.setBackground(azul); cel34.setBackground(preto); cel35.setBackground(azul); cel36.setBackground(azul); cel37.setBackground(azul); cel38.setBackground(preto); cel39.setBackground(azul); cel40.setBackground(azul);
        cel41.setBackground(verde); cel42.setBackground(preto); cel43.setBackground(preto); cel44.setBackground(preto); cel45.setBackground(preto); cel46.setBackground(preto); cel47.setBackground(preto); cel48.setBackground(preto); cel49.setBackground(preto); cel50.setBackground(verde);

        painel.add(cel1); painel.add(cel2); painel.add(cel3); painel.add(cel4); painel.add(cel5); painel.add(cel6); painel.add(cel7); painel.add(cel8); painel.add(cel9); painel.add(cel10);
        painel.add(cel11); painel.add(cel12); painel.add(cel13); painel.add(cel14); painel.add(cel15); painel.add(cel16); painel.add(cel17); painel.add(cel18); painel.add(cel19); painel.add(cel20);
        painel.add(cel21); painel.add(cel22); painel.add(cel23); painel.add(cel24); painel.add(cel25); painel.add(cel26); painel.add(cel27); painel.add(cel28); painel.add(cel29); painel.add(cel30);
        painel.add(cel31); painel.add(cel32); painel.add(cel33); painel.add(cel34); painel.add(cel35); painel.add(cel36); painel.add(cel37); painel.add(cel38); painel.add(cel39); painel.add(cel40);
        painel.add(cel41); painel.add(cel42); painel.add(cel43); painel.add(cel44); painel.add(cel45); painel.add(cel46); painel.add(cel47); painel.add(cel48); painel.add(cel49); painel.add(cel50);


        panelArray[0] = cel41;
        panelArray[1] = cel31;
        panelArray[2] = cel21;
        panelArray[3] = cel11;
        panelArray[4] = cel1;
        panelArray[5] = cel2;
        panelArray[6] = cel12;
        panelArray[7] = cel22;
        panelArray[8] = cel32;
        panelArray[9] = cel42;
        panelArray[10] = cel43;
        panelArray[11] = cel33;
        panelArray[12] = cel23;
        panelArray[13] = cel13;
        panelArray[14] = cel3;
        panelArray[15] = cel4;
        panelArray[16] = cel14;
        panelArray[17] = cel24;
        panelArray[18] = cel34;
        panelArray[19] = cel44;
        panelArray[20] = cel45;
        panelArray[21] = cel35;
        panelArray[22] = cel25;
        panelArray[23] = cel15;
        panelArray[24] = cel5;
        panelArray[25] = cel6;
        panelArray[26] = cel16;
        panelArray[27] = cel26;
        panelArray[28] = cel36;
        panelArray[29] = cel46;
        panelArray[30] = cel47;
        panelArray[31] = cel37;
        panelArray[32] = cel27;
        panelArray[33] = cel17;
        panelArray[34] = cel7;
        panelArray[35] = cel8;
        panelArray[36] = cel18;
        panelArray[37] = cel28;
        panelArray[38] = cel38;
        panelArray[39] = cel48;
        panelArray[40] = cel49;
        panelArray[41] = cel39;
        panelArray[42] = cel29;
        panelArray[43] = cel19;
        panelArray[44] = cel9;
        panelArray[45] = cel10;
        panelArray[46] = cel20;
        panelArray[47] = cel30;
        panelArray[48] = cel40;
        panelArray[49] = cel50;
    }

    public void pintar(int pos,int color){
        if(color == 0){
            panelArray[pos].setBackground(Color.gray);
        }else{
            panelArray[pos].setBackground(Color.red);
        }

    }

    public void desenhar(){
        painel = new JPanel();
        initcelulas();
        painel.setLayout(new GridLayout(5,10));
    Janela.add(painel, BorderLayout.CENTER);
        Janela.pack();
        Janela.setVisible(true);
    }
}
