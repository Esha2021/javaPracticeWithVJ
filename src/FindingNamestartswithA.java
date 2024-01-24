import java.util.ArrayList;
import java.util.List;

public class FindingNamestartswithA {
    public static void main(String[] args) {
        List<String> name=new ArrayList<String>();
        name.add("Rajan");
        name.add("Akhila");
        name.add("Aswini");
        name.add("Malkhar");
        name.add("Esha");
      double count=0;
        for(int i=0;i<name.size();i++){
            char a = 'A';
            if((name.get(i).charAt(0)== a) ||(name.get(i).charAt(0)=='a')){
               count++;
           }
            //System.out.println(count);
        }
        double percentage=count/name.size();
        System.out.println(percentage);
    }
}
