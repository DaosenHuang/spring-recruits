import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Stream;
class NaturalSupplier implements Supplier<Integer> {
    int n=0;
    public Integer get() {
        n++;
        return n;
    }
}

public class Test {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.generate(new NaturalSupplier());
        stream.limit(20).map(n -> Math.pow(n,2))
                .forEach(System.out::println);

    }


    /**
     * 反转字符串顺序
     * 例如 "I love you!" ---> "you! love I"
     */
    public static String reverse(String s) {
        String[] ss = s.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i=ss.length-1; i>=0; i--) {
            sb.append(ss[i]).append(" ");
        }
        return sb.toString().trim();
    }

    /**
     * 输入一个数组
     */
    public static void inputMatrix() {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();   //定义矩阵的行数
        int n=scan.nextInt();  //矩阵的列数
        int[][] matrix=new int[m][n]; //m行n列
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                int num=scan.nextInt();
                matrix[i][j] = num;
            }
        }

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (j==n-1) {
                    System.out.println(matrix[i][j]+",");
                    continue;
                }
                System.out.print(matrix[i][j]+",");
            }
        }
    }

    /**
     * 最长无重复字母字串
     */
    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int[] dp = new int[s.length()];
        // dp[i] 表示以第i个字符结尾的无重复子串
        Map<Character, Integer> map = new HashMap<>();
        dp[0] = 1;
        for (int i=1; i<s.length(); i++) {
            char ch =chars[i];
            if (!map.containsKey(ch)) {
                dp[i] = dp[i-1] + 1;
            }
            int d = i - map.get(ch);  //与上一次出现位置的距离

            if (d > dp[i-1]) {
                dp[i] = dp[i-1] + 1;
            }
            else {
                dp[i] = d;
            }
            map.put(ch, i);
        }
        int max = 0;
        for (int i=0; i<dp.length; i++) {
          max = Math.max(max, dp[i]);
        }
        return max;


    }

}
