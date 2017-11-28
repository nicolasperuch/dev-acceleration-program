package service;

import business.BusinessCredit;

public class  ServiceCredit {

    public enum OpcoesMenu {
        NENHUM_CREDITO(1),
        CREDITO_20_CREDITO(2),
        SALDO_30_CREDITO(3),
        SALDO_40_CREDITO(4),
        OPCAO_INVALIDA(5);

        private final int valor;

        OpcoesMenu(int valorOpcao) {
            this.valor = valorOpcao;
        }
    }

    private BusinessCredit businessCredit;

    public ServiceCredit() {
        this.businessCredit = new BusinessCredit();
    }

    public OpcoesMenu validateCredit(double value) {
        if (businessCredit.isValueBetween0And200(value)) {
            return OpcoesMenu.NENHUM_CREDITO;
        }
        if (businessCredit.isValueBetween201And400(value)) {
            return OpcoesMenu.CREDITO_20_CREDITO;
        }
        if (businessCredit.isValueBetween401And600(value)) {
            return OpcoesMenu.SALDO_30_CREDITO;
        }
        if (businessCredit.isValueBiggerThan600(value)) {
            return OpcoesMenu.SALDO_40_CREDITO;
        }
        return OpcoesMenu.OPCAO_INVALIDA;
    }

}
