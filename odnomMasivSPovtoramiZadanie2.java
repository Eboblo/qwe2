import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int arraySize = 20;
        List<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            array.add(random.nextInt(10) + 1); 
        }
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();
        for (Integer num : array) {
            if (!seen.add(num) && !duplicates.contains(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("Дополнительный массив из повторяющихся элементов исходного массива:");
        for (Integer num : duplicates) {
            System.out.print(num + " ");
        }
    }
}