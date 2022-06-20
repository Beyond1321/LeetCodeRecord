package easy;

import java.util.Arrays;
import java.util.Comparator;

public class HeightChecker1051 {
//    public int heightChecker(int[] heights) {
//        int [] temp =heights.clone();
//        Arrays.sort(heights);
//        int cnt=0;
//        for(int i=0;i<heights.length;i++){
//            if(temp[i]!=heights[i])cnt++;
//        }
//        return cnt;
//    }

    public static int heightChecker(int[] heights) {
        int m = Arrays.stream(heights).max().getAsInt();
        int[] cnt = new int[m + 1];
        for (int h : heights) {
            ++cnt[h];
        }

        int idx = 0, ans = 0;
        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= cnt[i]; ++j) {
                if (heights[idx] != i) {
                    ++ans;
                }
                ++idx;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{1,1,4,2,1,3}));
    }

}
