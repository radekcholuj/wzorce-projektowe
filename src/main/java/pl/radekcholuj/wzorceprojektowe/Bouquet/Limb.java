package pl.radekcholuj.wzorceprojektowe.Bouquet;

public class Limb extends BouquetDecorator{
    public Limb(FlowerBouquet flowerBouquet) {

        super(flowerBouquet);
    }

    public String addons(){

        return super.addons() + addonsLimb();
    }

    public String addonsLimb() {

        return " with Limb";
    }
}
