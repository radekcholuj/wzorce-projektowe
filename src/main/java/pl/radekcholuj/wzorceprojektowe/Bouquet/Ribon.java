package pl.radekcholuj.wzorceprojektowe.Bouquet;

public class Ribon extends BouquetDecorator{
    public Ribon(FlowerBouquet flowerBouquet) {
        super(flowerBouquet);
    }


    public String addons() {
        return super.addons() + addonsRibon();
    }

    public String addonsRibon() {
        return " with ribon";
    }
}
