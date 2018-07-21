public class TestaClasseAbstractInterface {
    public static void main(String[] args) {
        Posto postoShell = new Posto();
        Jipe jipe = new Jipe();
        jipe.setCor("Preta");
        jipe.setModelo("RAV4");
        jipe.setVelocidadeAtual(0);
        jipe.setVelocidadeMaxima(200);
        jipe.setTracionado(true);
        jipe.acelera(100);
        double valorJipe = postoShell.colocarCombustivel(jipe, 100);

        Caminhonete caminhonete = new Caminhonete();
        caminhonete.setCor("Branca");
        caminhonete.setModelo("Strada");
        caminhonete.setVelocidadeAtual(0);
        caminhonete.setVelocidadeMaxima(270);
        caminhonete.setCarga(500);
        caminhonete.acelera(100);
        double valorCaminhonete = postoShell.colocarCombustivel(caminhonete, 100);

        Carro carro = new Carro();
        carro.setCor("Prata");
        carro.setModelo("Ka");
        carro.setVelocidadeAtual(0);
        carro.setVelocidadeMaxima(230);
        carro.setConversivel(false);
        carro.acelera(100);
        double valorCarro = postoShell.colocarCombustivel(carro, 100);

        System.out.println("Velocidade jipe: " + jipe.getVelocidadeAtual());
        System.out.println("Valor gasto de diesel no jipe: " + valorJipe);
        System.out.println("Velocidade caminhonete: " + caminhonete.getVelocidadeAtual());
        System.out.println("Valor gasto de gasolina na caminhonete: " + valorCaminhonete);
        System.out.println("Velocidade carro: " + carro.getVelocidadeAtual());
        System.out.println("Valor gasto de Alcool no carro: " + valorCarro);
    }
}
