import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[]  args){
        NewCars();
    }



    public static void NewCars() {
        Model sedan = new Model("Седан");
        Model hatchback = new Model("Хэтчбек");
        Model crossover = new Model("Кроссовер");

        Сars allCarsFirst = new Сars();
        allCarsFirst.add(sedan);
        allCarsFirst.add(hatchback);
        allCarsFirst.add(crossover);
        allCarsFirst.add(crossover);
        allCarsFirst.add(sedan);
        allCarsFirst.add(crossover);
        allCarsFirst.add(hatchback);


        System.out.println("Количество машин модели " + sedan + " " + allCarsFirst.getCount(sedan));
        System.out.println("Количество машин модели " + hatchback + " " + allCarsFirst.getCount(hatchback));
        System.out.println("Количество машин модели " + crossover + " " + allCarsFirst.getCount(crossover));
        System.out.println("Общее количество моделей " + allCarsFirst.size());


        Сars allCarsSecond = new Сars();
        allCarsSecond.add(sedan);
        allCarsSecond.add(hatchback);
        allCarsSecond.add(crossover);
        allCarsSecond.add(crossover);
        allCarsSecond.add(sedan);
        allCarsSecond.add(crossover);
        allCarsSecond.add(hatchback);

        allCarsSecond.addAll(allCarsFirst);
        System.out.println("--------------------------------------------------------");

        System.out.println("Количество машин модели " + sedan + " " + allCarsSecond.getCount(sedan));
        System.out.println("Количество машин модели " + hatchback + " " + allCarsSecond.getCount(hatchback));
        System.out.println("Количество машин модели " + crossover + " " + allCarsSecond.getCount(crossover));


        Map<Model, Integer> test = new HashMap<>();
        allCarsSecond.toMap(test);
        System.out.println("--------------------------------------------------------");
        System.out.println(test);
    }
}
