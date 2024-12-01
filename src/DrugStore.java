import java.util.ArrayList;
import java.util.List;

class DrugStore {
    private String name_store; // название аптеки
    private List<String> name_drug; // названия лекарств
    private List<Double> drug_price; // стоимость лекарств

    //конструктор
    public DrugStore(String name_store) {
        this.name_store = name_store;
        this.name_drug = new ArrayList<>();
        this.drug_price = new ArrayList<>();
    }
    // инициализация всех полей
    public void Initialize(List<String> names, List<Double> prices) {
        this.name_drug = names;
        this.drug_price = prices;
    }

    // получаем полную инфомрацию об аптеке
    public String store_info() {
        String info = "~~~Аптека " + name_store + "~~~" + "\nЛекарства:\n";
        for (int i = 0; i < name_drug.size(); i++) { // Итерируем по спискам лекарств и их цен
            info += " - " + name_drug.get(i) + ": " + drug_price.get(i) + " руб.\n"; // Добавляем информацию о каждом аптечном препарате
        }
        return info; // Возвращаем полную информацию
    }

    // стоимость самого доргого лекарства
    public double expensive_drug() {
        double max_price = 0;
        for (double price : drug_price) {
            if (price > max_price) {
                max_price = price;
            }
        }
        return max_price;
    }

    // стоимость всех лекарств
    public double total_cost() {
        double totalCost = 0;
        for (double price: drug_price) {
            totalCost += price;
        }
        return totalCost;
    }

}
