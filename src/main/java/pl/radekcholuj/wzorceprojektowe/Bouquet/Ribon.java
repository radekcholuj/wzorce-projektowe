package pl.radekcholuj.wzorceprojektowe.Bouquet;

public class Ribon extends BouquetDecorator{
    public Ribon(FlowerBouquet flowerBouquet) {
        super(flowerBouquet);
    }

    public String addonsRibon() {
        return " with ribon";
    }

    public String addons() {
        return super.addons() + addonsRibon();
    }
}
