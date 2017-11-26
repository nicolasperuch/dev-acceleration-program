package Service;

public class  ServiceCredit {

    public enum OpcoesMenu {
        NENHUM_CREDITO(1), CREDITO_20_CREDITO(2), SALDO_30_CREDITO(3), SALDO_40_CREDITO(4);

        private final int valor;

        OpcoesMenu(int valorOpcao) {

            this.valor = valorOpcao;
        }
    }

    public OpcoesMenu validateCredit(double value) {
        if (value >= 0 && value <= 200) {
            return OpcoesMenu.NENHUM_CREDITO;
        }
        if (value >= 200 && value <= 400) {
            return OpcoesMenu.CREDITO_20_CREDITO;
        }
        if (value > 400 && value <= 600) {
            return OpcoesMenu.SALDO_30_CREDITO;
        }
        if (value > 600) {
            return OpcoesMenu.SALDO_40_CREDITO;
        }
        return null;
    }

    public double calculateCredit(double value, int percentage) {
        double aux;
        aux =  (value * percentage)/100;
        return aux;
    }
}
