import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

// класс для тестирования функциональности класса drugstore
public class DrugStoreTest {
    private DrugStore drugStore; // объект аптеке для тестирования

    // метод который выполняется перед каждым тестом
    @BeforeEach
    public void setUp() {
        // инициализируем объект drugstore и заполняем его данными
        drugStore = new DrugStore("Быстров");
        List<String> drugs = List.of("Парацетамол", "Аспирин", "Анальгин");
        List<Double> prices = List.of(100.0, 50.0, 30.0);
        drugStore.Initialize(drugs, prices); // инициализация данных для аптеки
    }

    // тест метода store_info
    @Test
    public void testStoreInfo() {
        // ожидаемое значение для информации об аптеке
        String expectedInfo = "~~~Аптека Быстров~~~\nЛекарства:\n"
                + " - Парацетамол: 100.0 руб.\n"
                + " - Аспирин: 50.0 руб.\n"
                + " - Анальгин: 30.0 руб.\n";
        // проверка правильности возвращаемой информации
        assertEquals(expectedInfo, drugStore.store_info());
    }

    // тест метода expensive_drug
    @Test
    public void testExpensiveDrug() {
        double expectedMaxPrice = 100.0; // ожидаемое значение для самой дорогой цены
        // проверка правильности возвращаемой цены
        assertEquals(expectedMaxPrice, drugStore.expensive_drug());
    }

    // тест метода total_cost
    @Test
    public void testTotalCost() {
        double expectedTotalCost = 100.0 + 50.0 + 30.0; // ожидаемая стоимость всех лекарств
        // проверка правильности общей стоимости
        assertEquals(expectedTotalCost, drugStore.total_cost());
    }
    }
