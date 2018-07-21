public class Carro extends Automovel implements Alcool {
    private boolean conversivel;

    @Override
    public void acelera(double velocidade) {
        double novaVelocidade = this.velocidadeAtual + velocidade;
        if (conversivel){
            novaVelocidade = novaVelocidade + (novaVelocidade * 0.12);
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

    public boolean getConversivel() {
        return conversivel;
    }

    public void setConversivel(boolean conversivel) {
        this.conversivel = conversivel;
    }

    @Override
    public void abastecer(double qtd) {
        this.tanque = qtd;
    }
}
