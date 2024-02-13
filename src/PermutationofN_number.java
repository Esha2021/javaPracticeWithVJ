import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationofN_number {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3};
        List <List<Integer>> result=new ArrayList<>();
        permutation(array1,0,result);
        for(List<Integer> n:result){
            System.out.println(n);
        }

    }
    public static void permutation(int[] arr,int start,List<List<Integer>> permuted){
        List<Integer> permuting=new ArrayList<>();

        if(arr.length-1==start) {
            for (int n : arr) {
                permuting.add(n);
            }
            if (!permuted.contains(permuting)) {
                permuted.add(permuting);
            }
        }else {

            for (int i = start; i < arr.length; i++) {
                exchangeposition(arr, start,i);
                permutation(arr, start + 1, permuted);
                exchangeposition(arr, start,i);
            }
        }
    }
    public static void exchangeposition(int[] arr ,int i,int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}


   //     d permutation(int[] arr, int first, List<List<Integer>> perlist1) {
//        if (arr.length == first) {
//            List<Integer> permutedlist = new ArrayList<>();
//            for (int n : arr) {
//                permutedlist.add(n);
//            }
//            if (!(perlist1.contains(permutedlist))) {
//                perlist1.add(permutedlist);
//
//            }
//        }
//      //  for (int j = 0; j < arr.length; j++) {
//            for (int i = first; i <=arr.length; i++) {
//                exchangeposition(arr, first, i);
//                permutation(arr, first + 1, perlist1);
//                exchangeposition(arr, first, i);
//
//
//
//
//
//
//
//
//
//
//
//
//        per
//        for (List<Integer> permuted : permutationresult) {
//            System.out.println(permuted);
//        }
//    }
