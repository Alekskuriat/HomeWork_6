package Package;

import java.text.MessageFormat;
import java.util.ArrayList;

public abstract class Animal {

    protected String name;
    private final String color;
    protected int age;
    protected boolean abilitySwim;
    protected static ArrayList<Animal> arrayList = new ArrayList<>();

    public Animal(String name, String color, int age, boolean abilitySwim) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.abilitySwim = abilitySwim;
        arrayList.add(this);
    }

    @Override
    public String toString() {
       return MessageFormat.format("Имя: {0}, цвет: {1}, возраст: {2}", name, color, age);
    }

    public void run(){
        System.out.println(name + " бежит");
    }

    public void run(int run, int max){
        if (run < max) System.out.println(MessageFormat.format("{0} пробежал {1} м.", name, run));
        else System.out.println(name + " не может так далеко убежать");
    }

    public void sail() {
        if (!abilitySwim)  System.out.println(name + " не умеет плавать");
        else System.out.println(name + " плывет");
    }

    public void sail(int sail, int max) {
        if (sail < max) System.out.println(MessageFormat.format("{0} проплыл {1} м.", name, sail));
        else System.out.println(name + " не может так далеко уплыть");
    }


}
