public class OperacaoSaque extends Operacao{

    public OperacaoSaque(double valor) {
        super('s', valor);
    }

    public String toString(){
        String saqueStr = "Tipo\n" + this.getTipo() + "Valor\n" + this.getValor() + "Data\n" + this.getData();

        return saqueStr;
    }

    public double calculaTaxa() {
        return 0.05;
    }
}