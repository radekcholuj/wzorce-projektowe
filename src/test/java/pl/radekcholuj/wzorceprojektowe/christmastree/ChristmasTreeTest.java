package pl.radekcholuj.wzorceprojektowe.christmastree;

import org.junit.jupiter.api.Test;
import pl.radekcholuj.wzorceprojektowe.christmastree.BubbleLights;
import pl.radekcholuj.wzorceprojektowe.christmastree.ChristmasTree;
import pl.radekcholuj.wzorceprojektowe.christmastree.ChristmasTreeImpl;
import pl.radekcholuj.wzorceprojektowe.christmastree.Garland;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChristmasTreeTest {

    @Test
    public void christmasTreeWithGarland(){
        // given
        ChristmasTreeImpl christmasTreeImpl = new ChristmasTreeImpl();

        // when
        ChristmasTree tree = new Garland(christmasTreeImpl);

        assertEquals(tree.decorate(),
                "Christmas tree with Garland");
    }

    @Test
    public void christmasTreeWithGarlandWithGarlandWithBubbleLights(){
        // when
        ChristmasTree tree = new BubbleLights(
                new Garland(new Garland(new ChristmasTreeImpl())));

        // then
        assertEquals(tree.decorate(),
                "Christmas tree with Garland with Garland with Bubble Lights");
    }
}
