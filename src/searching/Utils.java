package searching;

import java.util.function.Predicate;

/**
 * @author Tim Yu
 * @author Vivien Yan
 */
public class Utils {
  /**
   * Search values for the first value for which pred holds.
   */
  public static <T> T search(Iterable<T> values, Predicate<? super T> pred) throws Exception {
    for (T obj : values) {
      if (pred.test(obj)) {
        return obj;
      }
    }
    throw new Exception("Item not found");
  } // search(Iterable<T>, Predicate<? super T>)

  /**
   * Search for val in values, return the index of an instance of val.
   *
   * @param values A sorted array of integers
   * @param val An integer we're searching for
   * @result index, an integer
   * @throws Exception If there is no i s.t. values[i] == val
   * @pre values is sorted in increasing order. That is, values[i] < values[i+1] for all reasonable
   *      i.
   * @post values[index] == val
   */
  public static int binarySearch(int[] vals, int val) throws Exception {
    int lb = 0;
    int ub = vals.length;

    while (lb < ub) {
      int mid = (lb + ub) / 2;
      if (vals[mid] < val) {
        lb = mid + 1;
      } else if (vals[mid] == val) {
        return mid;
      } else {
        ub = mid;
      }
    }

    throw new Exception("not found");
  }// binarySearch for loop

  public static int binarySearch2(int[] vals, int val) throws Exception {
    // FROM READING:
    /*
    binarySearch(value, values, lb, ub)
      If (lb > ub)
        Report Failure
      mid = midpoint(lb, ub);
      If values[mid] equals value
        return mid;
      Else if values[mid] *lt; value
        return binarySearch(value, values, mid+1, ub);
      Else
        return binarySearch(value, values, lb, mid-1);
     */
    
  }// binarySearch for recursive

}
