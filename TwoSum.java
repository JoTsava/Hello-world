//GitHub prototype 
import java.util.HashMap;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> hmap = new HashMap<>(); // Hashmap instance will store indices of each element
        for (int i = 0; i < nums.length; i++) { // Iterasting through the loop Temporary value to test criteria
            if (hmap.containsKey(target - nums[i])) { // if the complement exists return indices of two numbers that add to target
                return new int[] { hmap.get(target - nums[i]), i };
            }hmap.put(nums[i], i); // Sets current element and its index into the hashmap
        }return null; // reurn null if no solution exist
      public static void main(Strign args[]){//Testing
        int nums[] = [1, 3, 18, 5, 0]; int target = 2;
        TwoSum two = new TwoSum(); two.twoSum(nums, target);}
	}
}
