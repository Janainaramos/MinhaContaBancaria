package contabancaria;

public class ContaBancaria {
    String descricao;
    double saldo = 8000;
    public void soma100Reais() {
        saldo += 100;
    }

    public void diminui100Reais() {
        saldo -= 100;
    }

    public void sacarDinehiro(double saque) {
        saldo -= saque;
    }

    public void depositoDinheiro(double deposito) {
        saldo += deposito;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "descricao='" + descricao + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
