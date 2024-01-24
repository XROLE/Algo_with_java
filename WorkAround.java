import java.util.ArrayList;
import java.util.Arrays;



public class WorkAround {
    public static void main(String[] args) {

        ArrayList<String>  stringList = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

        for(String l: stringList){
            if(l.equals("D")){
                System.out.println("The element is found");
                break;
            }
        }
        System.out.println(stringList);
        stringList.remove(2);
        System.out.println(stringList);
    }
}
