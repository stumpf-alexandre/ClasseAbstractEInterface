public class Caminhonete extends Automovel implements Gasolina {
    private double carga;

    @Override
    public void acelera(double velocidade) {
        double novaVelocidade = this.velocidadeAtual + velocidade;
        if (carga > 0){
            novaVelocidade = novaVelocidade /2;
        }
        if (verificaVelocidadeMaxima(velocidade)){
            this.velocidadeAtual = novaVelocidade;
        }
        else {
            this.velocidadeAtual = velocidadeMaxima;
        }
    }

    protected boolean verificaVelocidadeMaxima(double velocidade){
        return velocidade < velocidadeMaxima;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public void abastecer(double qtd) {
        this.tanque = qtd;
    }
}
