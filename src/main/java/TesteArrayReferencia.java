public class TesteArrayReferencia {

    public static void main(String[] args) {

        Conta[] contas = new Conta[5];

        Conta cc1 = new Conta(22, 33);
        Conta cc2 = new Conta(44, 55);

        contas[0] = cc1;
        contas[1] = cc2;


        System.out.println(contas[0].getNumero());

        Conta ref = (Conta) contas[1];
        System.out.println(ref.getAgencia());
    }
}
