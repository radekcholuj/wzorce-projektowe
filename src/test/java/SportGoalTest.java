import org.junit.Test;
import pl.radekcholuj.wzorceprojektowe.SportGoal;

import static org.junit.jupiter.api.Assertions.assertSame;

public class SportGoalTest {

    @Test

    public void checkIsSame(){
        SportGoal Sport_Goal = SportGoal.getInstance();
        SportGoal Sport_Goal1 = Sport_Goal.getInstance();


        assertSame(Sport_Goal, Sport_Goal1);
    }
}
