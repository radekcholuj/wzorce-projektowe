package pl.radekcholuj.wzorceprojektowe;

import org.junit.jupiter.api.Test;
import pl.radekcholuj.wzorceprojektowe.Management;

import static org.junit.jupiter.api.Assertions.assertSame;

public class ManagementTest {

    @Test
    public void checkIsSame(){
        Management management1 = Management.getInstanse();
        Management management2 = Management.getInstanse();

        assertSame(management1, management2);
    }
}
