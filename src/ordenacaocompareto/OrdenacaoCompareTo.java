package ordenacaocompareto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrdenacaoCompareTo {

    public static void main(String[] args) {

        ArrayList<Produtos> lista1 = new ArrayList<>();

        Produtos produto1 = new Produtos("1", "Arroz", 3.50);
        Produtos produto2 = new Produtos("2", "feijao", 4.50);
        Produtos produto3 = new Produtos("5", "macarrao", 5.50);
        Produtos produto4 = new Produtos("4", "cacau", 10.50);
        Produtos produto5 = new Produtos("0", "mateiga", 40.50);

        lista1.add(produto1);
        lista1.add(produto2);
        lista1.add(produto3);
        lista1.add(produto4);
        lista1.add(produto5);

        Collections.sort(lista1, new produtonomecomparator ());

        for (Produtos lista2 : lista1){
            
            System.out.println (lista2);
        }
        
        /*for (int i = 0; i < lista1.size(); i++) {

            System.out.println(lista1.get(i));
        }*/
    }

}

class produtonomecomparator implements Comparator<Produtos> {

    @Override
    public int compare(Produtos o1, Produtos o2) {

        return o1.getNome().compareTo(o2.getNome());

    }

}
