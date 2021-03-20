package pl.radekcholuj.wzorceprojektowe.BouquetTest;

import org.junit.jupiter.api.Test;
import pl.radekcholuj.wzorceprojektowe.Bouquet.FlowerBouquet;
import pl.radekcholuj.wzorceprojektowe.Bouquet.FlowerBouquetImpl;
import pl.radekcholuj.wzorceprojektowe.Bouquet.Limb;
import pl.radekcholuj.wzorceprojektowe.Bouquet.Ribon;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FlowerBouquetTest {
    @Test
    public void isBasicBouquet(){

        //when
        FlowerBouquet bouquet = new FlowerBouquetImpl();

        //then
        assertEquals(bouquet.noAddons(),"basic bouquet");
    }

    @Test
    public void isBouquetWithLimb() {
        //given
        FlowerBouquetImpl flowerBouquetImpl = new FlowerBouquetImpl();

        //when
        FlowerBouquet bouquet = new Limb(flowerBouquetImpl);

        //then
        assertEquals(bouquet.addons(), "nice bouquet with limb");
    }

    @Test
    public void isBouquetWithRibon(){
        //given
        FlowerBouquetImpl flowerBouquetImpl = new FlowerBouquetImpl();

        //when
        FlowerBouquet bouquet = new Ribon(flowerBouquetImpl);

        //then
        assertEquals(bouquet.addons(),"nice bouquet with ribon");
    }

}
