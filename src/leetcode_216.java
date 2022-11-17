import java.util.ArrayList;
import java.util.List;

/**
 * @author Alan
 * @date 2022/11/16 22:05
 **/
public class leetcode_216 {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(k, n, 1);
        return result;
    }

    void backtracking(int length, int sum, int startindex) {
        if (path.size() == length) {
            if (countsum(path) == sum) {
                result.add(new ArrayList<>(path));
            } else return;
        }
        for (int i = startindex; i <= 9; i++) {
            path.add(i);
            backtracking(length, sum, i + 1);
            path.remove(path.size() - 1);
        }

    }

    Integer countsum(List<Integer> path) {
        Integer sum = 0;
        for (Integer integer : path) {
            sum += integer;
        }
        return sum;
    }


}
