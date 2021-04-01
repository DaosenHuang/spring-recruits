import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Map<Character, Integer> map=new HashMap<>();
        map.put('C', 12);
        map.put('H', 1);
        map.put('O', 16);
        map.put('N', 14);
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int res = sumValue(input, map);
        System.out.println(res);
        }

        public static int sumValue(String input, Map<Character, Integer> map) {
            int sum = 0;  // 记录总分子质量
            int value = 0;
            int num = 0;
            for (int i=0; i<input.length(); i++) {
                Character cur = input.charAt(i);
                if (map.containsKey(cur)) {
                    if (num != 0) {
                        sum += value * (num-1);
                    }
                    num = 0;
                    value = map.get(cur);
                    sum += value;
                    continue;
                }
                int temp = cur - '0';
                num = num*10 + temp;
                if (i == input.length()-1) {
                    sum += value * (num-1);
                }

            }
            return sum;
        }




    public String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();
        reverse(chars,0,s.length()-1);
        reverse(chars, 0, s.length()-n-1);
        reverse(chars, s.length()-n, s.length()-1);
        return String.valueOf(chars);

    }

    public static void reverse(char[] chars, int start, int end) {
        if (end == start) {
            return ;
        }

        int left=start, right=end;
        while (left <= right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
        }
    }


























    public static int minDrink(int[] n, int m) {
        int left=0;
        int right = m-1;
        int minMax = maxNum(n, left, right);
        while (right<n.length) {
            right++;
            left++;
            int curMax = maxNum(n, left, right);
            if (curMax < minMax) {
                minMax = curMax;
            }
        }
        return minMax;


    }

    public static int maxNum(int[] n, int left, int right) {
        int max = n[left];

        for (int i=left; i<=right; i++) {
            if (n[i] > max) {
                max = n[i];
            }
        }
        return max;
    }

    /**
     * 背包问题
     */
    public static int packageProblem(int[] weights, int[] values, int c) {
        //dp[i][j]  背包容量为j前提下，在前i个物品中挑出的最大物品价值总和
        int num=weights.length; // 输入的物品数量
        int[][] dp=new int[num][c];
        for (int i=0; i<num; i++) { //背包体积为0，最大值都是0
            dp[i][0] = 0;
        }
        for (int j=0; j<c; j++) {
            dp[0][j] = 0;  //物品数位0，背包体积不管多大，总价值都是0
        }

        for (int i=1; i<num; i++) {
            for (int j=1; j<c; j++) {
                if (weights[i] > j) {
                    dp[i][j] = dp[i-1][j];
                }
                dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weights[i]+values[i]]);
            }
        }
        return dp[num-1][c-1];

    }



}






