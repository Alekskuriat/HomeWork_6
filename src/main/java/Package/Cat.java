package Package;

public class Cat extends Animal{

    protected int maxRunningDistance = 200;

    public Cat(String name, String color, int age, boolean abilitySwim) {
        super(name, color, age, abilitySwim);

    }

   public void run(int run){
        run(run, maxRunningDistance);
   }

    public void sail(int sail){
        sail();
    }
}
