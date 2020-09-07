public class TesteArrayFormaLiteral {
    public static void main(String[] args) {

        Conta cc1 = new Conta(11, 112);
        Conta cc2 = new Conta(77, 223);

        Conta contas[] = {cc1, cc2};
        System.out.println(contas.length);

    }
}
