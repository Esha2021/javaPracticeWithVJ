import java.util.*;

public class FindUniqueNumbers {
    public static void sortingUnique(List<Integer> arr, Set<Integer> uniquenumbers) {

        for (int i = 0; i < arr.size(); i++) {
            uniquenumbers.add(arr.get(i));
        }
       // Collections.sort(uniquenumbers);
        System.out.println(uniquenumbers);
        System.out.println(uniquenumbers.size());
    }

    public static void main(String[] args) {
        Set<Integer> uniquenumbers = new HashSet<>();

        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int number = sc.nextInt();
            arr.add(number);
        }
        System.out.println("uniques element in the sorted");
        sortingUnique(arr, uniquenumbers);

    }
}
//            if(!uniquenumbers.contains(arr.get(i))){
//                uniquenumbers.add(arr.get(i));
//            }
//int[] array1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 4};
// sortingUnique(array1, uniquenumbers);
//     Scanner sc = new Scanner(System.in);
//        String inputString = sc.nextLine();
//        String[] inputStringArray = inputString.split(", ");
//        int[] inputIntArray = Arrays.stream(inputStringArray).mapToInt(element -> Integer.parseInt(element)).toArray();

