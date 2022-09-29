package LP.listaLinear;

import java.security.Principal;

import javax.print.attribute.standard.RequestingUserName;

public class ListalLinear {

    public static class Lista {
        public No inicio;
        public int tam;
    }
    
    //linear class - Classe linear
    public static class No {
        public int info;
        public No prox;
    }

    public static void main(String[] args) {
        Lista l = iniciarLista();
        l = addInicio(l, val:10);
        l = addInicio(l, val:5);
        l = addInicio(l, val:1);
            
        printLista(l);
    }
    
    //---------------------------------------

    public static Lista iniciarLista() {
    
        Lista l = new lista();
        l.inicio = null;
        t.tam = 0;
        return l;
    }
    
    //---------------------------------------

    public static Lista addInicio (Lista l, int val) {
        No n1 = new No();
        n1.info = val;
        n1.prox = l.inicio;
        l.inicio = n1;
        return l; 
    }

    // percorre a lista
    public static void printLista (Lista l) {
        System.out.println(" L --> ");
        No aux = l.inicio;
        while (aux != null) {;
            System.out.println(aux.info + " --> ");
            aux = aux.prox;
        }
    }
    

    System.out.println("Null");

    //------------------------------

    public static Lista addFim(lista l, int val){
        No novo = new No();
        novo.prox = null;
        if (l.inicio == null) {
            l.inicio = novo;
            l.tam =++
        return l;
        }

        No aux = l.inicio;
        while (aux != null) {
            aux = aux.prox;
        }
        aux.prox = novo;
        return l;

    }        
}

