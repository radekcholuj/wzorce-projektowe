package pl.radekcholuj.wzorceprojektowe;

public class Management {
    private static Management management;

    private Management(){}

    public static Management getInstanse() {
        if(management == null){
            management = new Management();
        }
        return management;
    }
}
