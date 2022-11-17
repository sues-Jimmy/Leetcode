import java.util.ArrayList;
import java.util.List;

/**
 * @author Alan
 * @date 2022/11/16 21:51
 **/
public class leetcode_77 {
    private List<List<Integer>> result = new ArrayList<>();
    private ArrayList<Integer> path = new ArrayList<>();


    public List<List<Integer>> combine(int n, int k) {
        backtracking(n, k, 1);
        return result;
    }

    public void backtracking(int n, int k, int startindex) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startindex; i <= k; i++) {
            path.add(i);
            backtracking(n, k, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
