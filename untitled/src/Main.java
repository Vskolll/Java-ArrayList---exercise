import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // 1. Створюємо новий список, додаємо кілька назв риб і виводимо колекцію 🐟
        ArrayList<String> fishList = new ArrayList<>();
        fishList.add("Лосось");
        fishList.add("Форель");
        fishList.add("Окунь");
        fishList.add("Сом");
        fishList.add("Макрель");
        System.out.println("Список риб: " + fishList);

        // 2. Проходимо по всіх елементах у списку 🔄
        System.out.println("Ітерація по списку:");
        for (String fish : fishList) {
            System.out.println(fish);
        }

        // 3. Вставляємо елемент у список на перше місце ✨
        fishList.add(0, "Щука");
        System.out.println("Після додавання щуки на перше місце: " + fishList);

        // 4. Витягуємо елемент за заданим індексом зі списку 📍
        String retrievedFish = fishList.get(2); // Отримуємо рибу за індексом 2
        System.out.println("Витягнена риба за індексом 2: " + retrievedFish);

        // 5. Оновлюємо конкретний елемент у списку 🔄
        fishList.set(3, "Меч-риба"); // Змінюємо рибу за індексом 3
        System.out.println("Після оновлення риби за індексом 3: " + fishList);

        // 6. Видаляємо третій елемент зі списку ❌
        fishList.remove(2); // Видаляємо рибу за індексом 2
        System.out.println("Після видалення третього елемента: " + fishList);

        // 7. Шукаємо елемент у списку 🔍
        boolean containsBass = fishList.contains("Окунь");
        System.out.println("Чи містить список окуня? " + containsBass);

        // 8. Сортуємо даний список 📊
        Collections.sort(fishList);
        System.out.println("Відсортований список риб: " + fishList);

        // 9. Копіюємо один список в інший 📑
        ArrayList<String> copyFishList = new ArrayList<>(fishList);
        System.out.println("Скопійований список риб: " + copyFishList);

        // 10. Змінюємо порядок елементів у списку 🔄
        Collections.reverse(fishList);
        System.out.println("Змінений список риб: " + fishList);

        // 11. Порівнюємо два списки ⚖️
        boolean areListsEqual = fishList.equals(copyFishList);
        System.out.println("Чи рівні оригінальний і скопійований списки? " + areListsEqual);

        // 12. Очищаємо список 🧹
        fishList.clear();
        System.out.println("Після очищення списку, список риб: " + fishList);

        // 13. Перевіряємо, чи пустий список чи ні 🧐
        boolean isEmpty = fishList.isEmpty();
        System.out.println("Чи пустий список риб? " + isEmpty);

        // 14. Збільшуємо розмір списку 📈
        for (int i = 0; i < 10; i++) {
            fishList.add("Риба " + (i + 1)); // Додаємо фіктивні елементи для збільшення розміру
        }
        System.out.println("Після збільшення розміру, список риб: " + fishList);

        // 15. Зменшуємо ємність списку до поточного розміру 📏
        ArrayList<String> trimmedFishList = new ArrayList<>(fishList);
        System.out.println("Зменшений список риб: " + trimmedFishList);
    }
}
