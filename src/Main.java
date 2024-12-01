import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // создание аптеки
        DrugStore drugStore = new DrugStore("Быстров");
        List<String> drugs = List.of("Парацетамол", "Аспирин", "Анальгин");
        List<Double> prices = List.of(100.0, 50.0, 30.0);
        drugStore.Initialize(drugs, prices);

        // проверка работоспособности методов
        System.out.println(drugStore.store_info());
        System.out.println("Самое дорогое лекарство стоит: " + drugStore.expensive_drug() + " руб \n");
        System.out.println("Стоимость всех лекарств: " + drugStore.total_cost() + " руб \n");
    }
}