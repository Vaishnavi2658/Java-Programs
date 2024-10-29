import java.util.*;

public class Subset2 {

    void findSubsets(int index, int[] nums, List<Integer> list, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(list));
        
        for (int i = index; i < nums.length; i++) {
          
            if (i != index && nums[i] == nums[i - 1]) continue;
            
       
            list.add(nums[i]);
            
        
            findSubsets(i + 1, nums, list, ans);
            
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Subset2 s = new Subset2();
        int[] nums = {1, 2, 2, 2, 3, 3};

        
        Arrays.sort(nums);
        
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        
      
        s.findSubsets(0, nums, list, ans);
        
      
        System.out.println(ans);
    }
}
