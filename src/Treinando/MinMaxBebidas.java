package Treinando;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMaxBebidas {
    public static void main(String[] args) {

        Bebida b1 = new Bebida( "Whisky Johnnie Walker", 1750, 149.90, true);
        Bebida b2 = new Bebida( "Coquetel alcoólico Lemon Ice", 300, 2.55, true);
        Bebida b3 = new Bebida( "Guarana antarctica", 350, 2.45, false);
        Bebida b4 = new Bebida( "Fanta uva", 350, 2.28, false);
        Bebida b5 = new Bebida("Fanta laranja", 350, 2.40, false);
        Bebida b6 = new Bebida( "Pepsi", 350, 1.89, false);
        Bebida b7 = new Bebida( "Cerveja Amstel", 473, 3.49, true);
        Bebida b8 = new Bebida( "Hocus Pocus Orange Sunshine", 500, 32.90, true);
        Bebida b9 = new Bebida("Suco Del Valle de Uva", 900, 6.99, false);
        Bebida b10 = new Bebida("Suco Laranja Natural", 1500, 14.99, false);

        List<Bebida> bebida = Arrays.asList(b1,b2,b3,b4,b5,b6,b7,b8,b9,b10);

        Comparator<Bebida> maisCara = (bebida1 ,bebida2) -> {
            if (bebida1.preco > bebida2.preco) return 1;
            if(bebida1.preco < bebida2.preco) return -1;
            return 0;
        };

        System.out.println(bebida.stream().max(maisCara).get());
        System.out.println(bebida.stream().min(maisCara).get());
    }
}
