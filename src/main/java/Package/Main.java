package Package;

public class Main {

    public static void main(String[] args) {

        Cat catTomas = new Cat("Томас", "Серый", 3, false);
        Dog dogFrank = new Dog("Фрэнк", "Коричневый", 7, true);
        Cat catRob = new Cat("Роб", "Белый", 1, false);
        Dog dogAlf = new Dog("Альфред", "Светло - желтый", 11, true);
        Dog dogAlex = new Dog("Алекс", "Черный", 3, true);
        Cat catFil = new Cat("Фил", "Светло - коричневый", 4, false);
        Dog dogReeks = new Dog("Рекс", "Оранжевый", 8, true);
        Dog dogBob = new Dog("Боб", "Бежевый", 5, true);

        System.out.println("Список животных:");
        for (int i = 0; i < Animal.arrayList.size(); i++) {
            System.out.println((i + 1) + "." + Animal.arrayList.get(i).toString());
        }
        System.out.println();

        catTomas.run(123);
        catTomas.sail();
        dogFrank.run(300);
        dogFrank.sail(6);
        dogAlf.run(760);
        dogAlf.sail(9);
        catRob.run(50);
        catRob.sail(15);
        dogAlex.run();
        catFil.run();
        dogReeks.sail(3);
        dogAlex.sail(15);
        dogBob.run(678);
        dogBob.sail();

        animalCounting();
    }

    private static void animalCounting() {
        int countCats = 0;
        int countDogs = 0;

        for (int i = 0; i < Animal.arrayList.size(); i++) {
            if (Animal.arrayList.get(i).getClass() == Cat.class){
                countCats++;
            }
            if (Animal.arrayList.get(i).getClass() == Dog.class){
                countDogs++;
            }
        }
        System.out.println("\nКоличество котов: " + countCats);
        System.out.println("Количество собак: " + countDogs);
        System.out.println("Всего животных: " + Animal.arrayList.size());
    }

}
