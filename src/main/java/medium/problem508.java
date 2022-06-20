package medium;

import java.util.*;


public class problem508 {
    Map<Integer,Integer> map = new HashMap<>();
    int max=0;

    public int[] findFrequentTreeSum(TreeNode root) {
        dfs(root);
        List<Integer> lst = new ArrayList<>();
        for(Integer key:map.keySet()){
            if(map.get(key)==max){
                lst.add(key);
            }
        }
        Integer[] res=lst.toArray(new Integer[0]);
        return Arrays.stream(res).mapToInt(Integer::valueOf).toArray();
    }

    public int dfs(TreeNode root){
        int num=0;
        if(root.left!=null)num+=dfs(root.left);
        if(root.right!=null)num+=dfs(root.right);
        num+=root.val;
        int cnt=map.getOrDefault(num,0);
        if(cnt+1>max)max=cnt+1;
        map.put(num,cnt+1);
        return cnt;
    }
}
