package com.mycompany.filajava1;
import javax.swing.JOptionPane;


/**
 *
 * @author EmuladorJonas
 * "- Seucessos... Salvem o criador!!!"
 */
public class Filajava1 {

    public static void main(String[] args){
        
        int escolha = 0;
        int i = 1;
        
        Carro resp = new Carro();
        Carro resp2 = new Carro();
        
        Fila fila = new Fila();
        
        Fila lavados = new Fila();
        
        do
        {
            
            String e = JOptionPane.showInputDialog("Fila de carros!!! O que deseja fazer? \n-----\n 1: Adicionar carro para lavar \n 2: Adicionar carro já lavado \n 3: Mostrar carros já lavados \n-----\n Para sair press qualquer outra tecla!!!");
            escolha = Integer.parseInt(e);
            
            
            if(escolha ==1)
            { 
                if(i<4)
                {
                    
                    Carro Lavar= new Carro();
                    
                    Lavar.ID = JOptionPane.showInputDialog("Qual o numero do carro?");
                    Integer.parseInt(Lavar.ID);

                    Lavar.Marca = JOptionPane.showInputDialog("Qual a marca do carro?");

                    Lavar.Placa = JOptionPane.showInputDialog("Qual a placa do carro?");

                    Lavar.Dono = JOptionPane.showInputDialog("Quem é o dono do carro?");

                    fila.insere(Lavar);
                    fila.imprimir(Lavar);
                    
                    i++;
                    
                }else
                {
                    JOptionPane.showMessageDialog(null, "A FILA ESTÁ CHEIA 3 CARROS EM LAVAGEM!!!");
                }             
            }
            
            if(escolha ==2)
            {
                if(fila.fila_vazia())
                {
                    JOptionPane.showMessageDialog(null, "ERRO!!! A FILA DE CARROS PARA LAVAR ESTÁ VAZIA!!!");
                }else
                {
                    resp = fila.remove();
                    lavados.insere(resp);

                    i--;
                }                
            }
            
            if(escolha ==3)
            {
                System.out.println("---------CARROS LAVADOS---------");
                
                while(!lavados.fila_vazia())
                {
                    resp2 = lavados.remove();
                    lavados.imprimirLa(resp2);
                }
            }
          
            
        }while(escolha == 1 || escolha == 2 || escolha == 3);
        
        
    }
}
