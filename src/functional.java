import java.util.HashMap;

public class functional {
    static HashMap<String, String> words = new HashMap<>();
    static HashMap<String, Integer> numbers = new HashMap<>();
    public static void showAll()//Доделать, чтобы отображалось без фигурных скобок
    {
        System.out.println("Первый словарь:");
        System.out.println(words.toString());
        System.out.println("Второй словарь:");
        System.out.println(numbers.toString());
    }

    public static void Delete(String key){
        words.remove(key);
        System.out.println("Запись успешно удалена");
    }

    public static void find (String key, boolean flag){
        if (flag) {
            if (words.get(key) != null)
                System.out.println(words.get(key));
            else System.out.println("Ничего не найдено");
        }
        else {
            if (numbers.get(key) != null)
                System.out.println(numbers.get(key));
            else System.out.println("Ничего не найдено");
        }
    }

    public static void addWords(String key, String string){
        if (string.length() == 4 && string.matches("^[a-zA-Z]*$")) {  //проверка на условие
            words.put(key, string);
            System.out.println("Успешно");
        }
        else System.out.println("Слово должно состоять из 4-х букв латинской раскладки");
    }

    public static void addNumbers(String key, int digits){
        int numberOfDigits =String.valueOf(digits).length();
        if (numberOfDigits == 5) {  //проверка на условие
            numbers.put(key, digits);
            System.out.println("Успешно");
        }
        else System.out.println("Разрешенно вводить только пять цифр");
    }



}
