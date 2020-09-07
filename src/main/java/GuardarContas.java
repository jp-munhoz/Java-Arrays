public class GuardarContas {
    private Conta[] referencias;
    private int posicao;

    public GuardarContas(){
        this.referencias = new Conta[10];
    }

    public void adiciona(Conta ref) {
        referencias[this.posicao] = ref;
        this.posicao++;
    }

    public int getQuantidadeDeContas() {
        return this.posicao;
    }

    public Conta getReferencia(int pos) {
        return this.referencias[pos];
    }
}
