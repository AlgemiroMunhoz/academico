package poo.coleccion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import poo.ex_heranca.heranca.Autor;

public class MinhaColecaoSet {
    public static void main(String[] args){

        Set<String> grupo1, grupo2;
        grupo1 = new HashSet<String>();
        grupo2 = new HashSet<String>();

        String s1, s2, s3, s4, s5, s6;
        s1 = "Manuel";
        s2 = "Carol";
        s3 = "Bruna";
        s4 = "Bruno";
        s5 = "Carolina";
        s6 = "Beto";

        grupo1.add(s1);
        grupo1.add(s2);
        grupo1.add(s3);
        grupo1.add(s4);
        grupo1.add(s5);
        grupo1.add(s1);

        grupo1.add(s1);
        grupo1.add(s2);
        grupo1.add(s3);
        grupo1.add(s4);
        grupo1.add(s5);
        grupo1.add(s6);

        System.out.println("####### grupo1 ########");
        for(String s :grupo1){
            System.out.println(s + "\t\t");
        }

        System.out.println("####### grupo1 ########");
        for(String s :grupo2){
            System.out.println(s + "\t\t");
        }

        if(grupo1.size() == 0){
        }
    }
}
