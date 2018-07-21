public abstract class Automovel {
    private static int qtdAutomovel;
    private String cor;
    private String modelo;
    protected double tanque;
    protected double velocidadeAtual;
    protected double velocidadeMaxima;

    public Automovel(String cor, String modelo, double velocidadeAtual, double velocidadeMaxima){
        this.cor = cor;
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMaxima = velocidadeMaxima;
        Automovel.qtdAutomovel++;
    }
    public Automovel(){
        Automovel.qtdAutomovel++;
    }

    public double getTanque() {
        return tanque;
    }

    public static int getQtdAutomovel(){
        return Automovel.qtdAutomovel - 1;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void ligar(){
        System.out.println("Automovel ligado!");
    }

    public abstract void acelera(double velocidade);
}
