import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEquals {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new Conta(22,33);
        Conta cc2 = new Conta(44,55);

        lista.add(cc);
        lista.add(cc2);

        boolean exiteConta = lista.contains(cc);
        System.out.println(exiteConta);

        System.out.println(cc.equals(cc2));



        for (Conta conta : lista){
            System.out.println(conta);
        }

        System.out.println("");

        Collections.reverse(lista);

        for (Conta conta : lista){
            System.out.println(conta);
        }
    }
}
