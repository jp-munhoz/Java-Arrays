public class TestaGuardarContas {
    public static void main(String[] args) {
        GuardarContas guardarContas = new GuardarContas();
        Conta cc = new Conta(22,33);
        guardarContas.adiciona(cc);

        Conta cc2 = new Conta(44,99);
        guardarContas.adiciona(cc2);

        int contasGuardadas = guardarContas.getQuantidadeDeContas();
        System.out.println(contasGuardadas);

        Conta ref = guardarContas.getReferencia(0);
        System.out.println(ref.getNumero());
    }
}
