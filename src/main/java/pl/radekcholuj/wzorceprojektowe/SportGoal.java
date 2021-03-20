package pl.radekcholuj.wzorceprojektowe;

public class SportGoal {
    private static SportGoal Sport_Goal;

    public static SportGoal getInstance(){
        if(Sport_Goal == null){
            Sport_Goal = new SportGoal();
        }
        return Sport_Goal;
    }
}
