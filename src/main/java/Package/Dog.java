package Package;

public class Dog extends  Animal {

    protected int maxRunningDistance = 500;
    protected int maxSailingDistance = 10;

    public Dog(String name, String color, int age, boolean abilitySwim) {
        super(name, color, age, abilitySwim);
    }

    public void run(int run){
        run(run, maxRunningDistance);
    }

    public void sail(int sail){
        sail(sail, maxSailingDistance);
    }

}
