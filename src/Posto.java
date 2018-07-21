public class Posto {
    private double precoGasolina = 4.17;

    private double precoAlcool = 3.99;

    private double precoDiesel = 3.67;

    public double colocarCombustivel(Gasolina gasolina, double qtd){
        gasolina.abastecer(qtd);
        return qtd * precoGasolina;
    }

    public double colocarCombustivel(Alcool alcool, double qtd){
        alcool.abastecer(qtd);
        return qtd * precoAlcool;
    }

    public double colocarCombustivel(Diesel diesel, double qtd){
        diesel.abastecer(qtd);
        return qtd * precoDiesel;
    }
}
