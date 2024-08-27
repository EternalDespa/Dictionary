import java.util.HashMap;

public class functional {
    static HashMap<String, String> words = new HashMap<>();
    public static void showAll()
    {
        System.out.println(words.toString());
    }

    public static void Delete(String key){
        words.remove(key);
        System.out.println("Запись успешно удалена");
    }

    public static void Find(String key){
        if(words.get(key)!=null)
            System.out.println(words.get(key));
        else System.out.println("Ничего не найдено");
    }
    public static void Add(String key, String string){
        words.put(key, string);
        System.out.println("Успешно");
    }
}
