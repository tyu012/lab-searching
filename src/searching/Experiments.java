package searching;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Tim Yu
 * @author Vivien Yan
 */
public class Experiments {
  public static void main(String[] args) throws Exception {
    String[] tmp = new String[] {"alpha", "bravo", "charlie", "delta", "echo", "foxtrot", "golf",
        "hotel", "india", "juliett", "kilo", "lima", "mike", "november", "oscar", "papa", "quebec",
        "romeo", "sierra", "tango", "uniform", "victor", "whiskey", "xray", "yankee", "zulu"};
    ArrayList<String> strings = new ArrayList<String>(Arrays.asList(tmp));
    String ex1b = Utils.search(strings, (s) -> s.length() == 6);
    String ex1d = Utils.search(strings, (s) -> s.contains("u"));
    PrintWriter pen = new PrintWriter(System.out, true);
    pen.println(ex1b); 
    pen.println(ex1d);

    for(int s = 1; s <= 32; s++){
      int[] arr = new int[s];
      for(int j = 0; j < s; j++){
        arr[j] = 2*j;
      }
      for(int i = 0; i <= s-1 ; i++){
        if(Utils.binarySearch(arr, 2*i) != i) {
          pen.println("Wrong!");
        }
        try {
          Utils.binarySearch(arr, 2*i+1);
          System.err.println("there's unexpected value in the array");
        } catch (Exception e){
        }
      }
      try{
        Utils.binarySearch(arr, -1);
        System.err.println("there shouldn't be -1!");
      } catch (Exception e){
      }
    }
  }
}
