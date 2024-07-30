import java.util.HashMap;

public class SampleTwoSum {
  public static void main(String[] args) {
      System.out.println("Test de la fonction calculTowSum via array simple\n");

      int[] result1 = calculTowSum(new int[]{2, 7, 11, 15}, 9);
      System.out.println((result1 != null && result1[0] == 0 && result1[1] == 1) ? "Test 1 réussi" : "Test 1 raté");

      int[] result2 = calculTowSum(new int[]{15, 12, 9, 1, 5, 3}, 8);
      System.out.println((result2 != null && result2[0] == 4 && result2[1] == 5) ? "Test 2 réussi" : "Test 2 raté");

      int[] result3 = calculTowSum(new int[]{10, 6, 8, 11, 2}, 10);
      System.out.println((result3 != null && result3[0] == 2 && result3[1] == 4) ? "Test 3 réussi" : "Test 3 raté");

      System.out.println("Test de la fonction calculTowSum via HashMap\n");

      int[] result4 = calculTowSumHashMap(new int[]{2, 7, 11, 15}, 9);
      System.out.println((result4 != null && result4[0] == 0 && result4[1] == 1) ? "Test 4 réussi" : "Test 4 raté");

      int[] result5 = calculTowSum(new int[]{15, 12, 9, 1, 5, 3}, 8);
      System.out.println((result2 != null && result5[0] == 4 && result5[1] == 5) ? "Test 5 réussi" : "Test 5 raté");

      int[] result6 = calculTowSum(new int[]{10, 6, 8, 11, 2}, 10);
      System.out.println((result3 != null && result6[0] == 2 && result6[1] == 4) ? "Test 6 réussi" : "Test 6 raté");
  }

  public static int[] calculTowSum(int[] nums, int target) {
      for (int i = 0; i < nums.length; i++) {
          for (int j = i + 1; j < nums.length; j++) {
              if (nums[i] + nums[j] == target) {
                  return new int[] { i, j };
              }
          }
      }

      return null;
  }

  public static int[] calculTowSumHashMap(int[] nums, int target) {
    HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

    for (int i = 0; i < nums.length; i++) {
      int difference = target - nums[i];
      if (hash.containsKey(difference)) {
        return new int[] { hash.get(difference), i };
      }
      hash.put(nums[i], i);
    }

    return null;
  }
}
