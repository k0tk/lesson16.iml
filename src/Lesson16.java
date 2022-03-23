import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lesson16 {
    public static void main(String[] args) throws IOException {
        List<String> names = new ArrayList<>(); //замена массива без определенной размерности || в скобки можно вводить размерность (оптимизация)
        names.add("Pavel");
        names.add("Masha");
        names.add("Ivan");
        ((ArrayList<String>) names).trimToSize();

        for (String name : names) {
            System.out.println(name);
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        boolean result = names.remove("Masha");
        if (result = true ){
            System.out.println("Object deleted");
        }else{
            System.out.println("Object not deleted");
        }

        String userName = "Masha";
        System.out.println(names.contains(userName));

        System.out.println(names.get(0));
        System.out.println(names);

        List<Integer> numbers = Arrays.asList(1, 2, 5, 100, 3);
        numbers.set(1,20);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int n = iterator.next();
            if (n % 2 == 0) {
                iterator.remove();
            }
            System.out.println(iterator.next());
        }
//        for (int number : numbers) {
//            if (number % 2 == 0) {
//                numbers.remove(number);
//
//
//            }
//        }
//      System.out.println(numbers);
//
        numbers.forEach(x -> System.out.println(x * 2));
//

        numbers.add(5);
        numbers.remove(4);
        System.out.println(numbers);
        numbers.contains(3);
        numbers.set(3,70);

    }



}