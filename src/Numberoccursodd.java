import java.util.*;

public class Numberoccursodd {
    public static void Numberoccurinoddplace(int[] inputArray) {
        int count = 0;
        Arrays.sort(inputArray);
        List<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
       // boolean b = Collections.addAll(inputArray);
        for (int i = 0; i < inputArray.length; i++) {
            if (arr1.contains(inputArray[i])) {
                count++;

            }
            result.add(count);
        }

        for(Integer n:result){
            System.out.println(n);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String[] inputStringArray = inputString.split(",");

        int[] inputIntArray = Arrays.stream(inputStringArray).mapToInt(Integer::parseInt).toArray();
        Numberoccurinoddplace(inputIntArray);

    }
}
