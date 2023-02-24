package main;


import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class Main {

    private static List<String> list = new ArrayList<String>();
    static int op = 0;
    public static void main(String[] args) {
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("1 - create, 2 - read, 3 - update, 4 - delete, 9 - quit"));
            switch(op){
                case 1:
                adicionaAluno(JOptionPane.showInputDialog("Nome:"));
                break;
                case 2:
                readAluno();
                break;
                case 3: 
                updateAluno(Integer.parseInt(JOptionPane.showInputDialog("ID:")), JOptionPane.showInputDialog("Nome:"));
                break;
                case 4:
                deleteAluno(Integer.parseInt(JOptionPane.showInputDialog("ID:")));
                break;
                case 9:
                break;
            }
        }while(op != 9);
    }


    public static void adicionaAluno(String nome){
        list.add(nome);
    }

    public void removeAluno(int id){
        list.remove(id);
    }

    public static void readAluno(){
        for(String x:list){
            System.out.println(x);
        }
    }

    public static void updateAluno(int id,String string){
        list.set(id, string);
    }

    public static void deleteAluno(int id){
        list.remove(id);
    }

}
