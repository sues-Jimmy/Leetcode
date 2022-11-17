import java.util.ArrayList;
import java.util.List;

class leetcode_17 {
    //111
    List<String> result = new ArrayList<>();
    StringBuffer stringBuffer = new StringBuffer();
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return result;
        }
        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtracking(numString,0,digits);
        return result;
    }

    void backtracking(String[] numString ,int num,String digits){
        if(num == digits.length()){
            result.add(stringBuffer.toString());
            return;
        }
        String s = numString[Integer.parseInt(String.valueOf(digits.charAt(num)))];
        for (int i = 0; i < s.length(); i++) {
            stringBuffer.append(s.charAt(i));
            backtracking(numString ,num + 1,digits);
            stringBuffer.deleteCharAt(stringBuffer.length()-1);
        }
    }
}