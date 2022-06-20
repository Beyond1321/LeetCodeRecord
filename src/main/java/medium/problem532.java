package medium;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class problem532 {
    public int findPairs(int[] nums, int k) {
        int cnt = 0;
        if(k==0){
            HashMap<Integer,Integer> temp = new HashMap<>();
            for(int i:nums){
                if(temp.containsKey(i)){
                    temp.put(i,temp.get(i)+1);
                }else{
                    temp.put(i,0);
                }
            }
            for (Integer value : temp.values()) {
                if(value>0)cnt++;
            }
        }
        else{
            if (nums.length == 1) return 0;
            Arrays.sort(nums);

            List<Integer> lst = new ArrayList<>();
            for(int i:nums){
                if(lst.isEmpty()||lst.get(lst.size()-1)!=i)lst.add(i);
            }
            int size = lst.size();
            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {
                    if(lst.get(j)-lst.get(i)>k)break;
                    if(lst.get(j) - lst.get(i) == k){
                        cnt++;
                        break;
                    }
                }
            }
//            TreeSet<Integer> set = new TreeSet<>();
//            for (int i : nums) {
//                set.add(i);
//            }
//            List<Integer> lst = new ArrayList<>(set);
//            int size = lst.size();
//            for (int i = 0; i < size; i++) {
//                for (int j = i + 1; j < size; j++) {
//                    if(lst.get(j)-lst.get(i)>k)break;
//                    if(lst.get(j) - lst.get(i) == k){
//                        cnt++;
//                        break;
//                    }
//                }
//            }
        }
        return cnt;
    }

    @Test
    public void test() {
//        findPairs(new int[]{1, 3, 1, 3, 5, 4}, 0);
        List<Integer> temp = Arrays.stream(new int[]{1, 3, 1, 3, 5, 4}).boxed().collect(Collectors.toList());
        Map<Integer,Integer> mp = new HashMap<>();
        
    }

}
