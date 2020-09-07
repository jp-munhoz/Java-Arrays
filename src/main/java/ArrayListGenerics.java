import java.util.ArrayList;

public class ArrayListGenerics {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new Conta(11,22);
        lista.add(cc);
        Conta ref = lista.get(0);

        Conta cc2 = new Conta(33,44);
        lista.add(cc2);



        //Iteracao pelo array
        for (int i = 0; i < lista.size(); i++){
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("");

        //Iteracao simplificada pelo array
        for (Object oRef : lista){
            System.out.println(oRef);
        }




    }
}
