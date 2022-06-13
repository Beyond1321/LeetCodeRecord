package easy;

import java.util.Arrays;
import java.util.Comparator;

public class HeightChecker1051 {
    public int heightChecker(int[] heights) {
        int [] temp =heights.clone();
        Arrays.sort(heights);
        int cnt=0;
        for(int i=0;i<heights.length;i++){
            if(temp[i]!=heights[i])cnt++;
        }
        return cnt;
    }
}
