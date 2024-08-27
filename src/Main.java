import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Start();
    }
    public static void Start(){
        System.out.println("1 - показать все пары из списка");
        System.out.println("2 - удалить запись по ключу");
        System.out.println("3 - найти запись по ключу");
        System.out.println("4 - добавить запись");
        System.out.println("5 - сохранить изменения");

        Scanner scan = new Scanner(System.in);
        int action = scan.nextInt();
        switch (action) {
            case 1:
                functional.showAll();
                break;
            case 2:
                System.out.println("Введите ключ");
                functional.Delete(scan.next());
                break;
            case 3:
                System.out.println("Введите ключ");
                functional.Find(scan.next());
                break;
            case 4:
                System.out.println("Введите ключ");
                String key = scan.next();
                System.out.println("Введите слово");
                String word = scan.next();
                functional.Add(key, word);
                break;
            default:
                System.out.println("Введите корректное значение");
        }
        Start();
    }
}