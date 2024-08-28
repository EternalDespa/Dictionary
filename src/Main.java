import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    static boolean flag = true;
    public static void main(String[] args) {
        WorkWithFile.fillHashFromFile();
        start();
    }
    public static void start(){
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
                if (flag)
                    functional.find(scan.next(), flag);
                break;
            case 4:
                System.out.println("Введите ключ");
                String key = scan.next();
                System.out.println("Введите слово");
                var word = scan.next();
                if (flag)
                    functional.addWords(key, word);
                else {
                    if (word == "[0-9]+") // ПЕРЕДЕЛАТЬ ПРОВЕРКУ, ЧТО СЛОВО СОДЕРЖИТ В СЕБЕ ТОЛЬКО ЦИФРЫ
                        functional.addNumbers(key, Integer.parseInt(word));
                    else
                        System.out.println("Разрешено вводить только пять цифр111");

                }
                break;
            case 5:
                WorkWithFile.SaveChanges();
            case 6:
                flag = !flag;
                if (flag)
                    System.out.println("Выбран словарь для слов");
                else System.out.println("Выбран словарь для чисел");
                break;
            default:
                System.out.println("Введите корректное значение");
        }
        start();
    }


}