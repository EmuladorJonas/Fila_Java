
package com.mycompany.filajava1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EmuladorJonas
 * "- Sucessos... Salvem o Criador!"
 */
public class Fila {
    
    List<Carro> carros = new ArrayList<>();
    
    void insere(Carro Lavar){
        this.carros.add(Lavar);
    }
    
    
    Carro remove(){
        return this.carros.remove(0);
    }
    
    
    Carro traz(int x){
        return this.carros.get(x);
    }
    
    boolean fila_vazia(){
        return this.carros.isEmpty();
    }
    
    void libera_fila(){
        this.carros.clear();
    }
    
    void imprimir(Carro carro){
        
            System.out.println("-------------CARRO ADICIONADO A FILA-----------------");
            System.out.println("O numero do carro eh..: "+carro.ID);
            System.out.println("A marca do carro eh..: "+carro.Marca);
            System.out.println("O dono do carro eh..: "+carro.Dono);
            System.out.println("A placa do carro eh..: "+carro.Placa);
            }
    
    void imprimirL(Carro carro){
        
            System.out.println("-------------CARRO REMOVIDO-----------------");
            System.out.println("O numero do carro eh..: "+carro.ID);
            System.out.println("A marca do carro eh..: "+carro.Marca);
            System.out.println("O dono do carro eh..: "+carro.Dono);
            System.out.println("A placa do carro eh..: "+carro.Placa);
            }
    
    void imprimirLa(Carro carro){
        
            System.out.println("----------------------------------------");
            System.out.println("O numero do carro eh..: "+carro.ID);
            System.out.println("A marca do carro eh..: "+carro.Marca);
            System.out.println("O dono do carro eh..: "+carro.Dono);
            System.out.println("A placa do carro eh..: "+carro.Placa);
            }

}
