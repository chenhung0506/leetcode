import java.util.ArrayList;
import java.util.List;

public class NonDuplicateCombinations {
    public static void main(String[] args) {
        int numDice = 5; // 五顆骰子
        int faces = 6;   // 每顆骰子有六面
        List<List<Integer>> combinations = new ArrayList<>();

        // 使用遞迴產生非重複組合
        generateCombinations(numDice, faces, 1, new ArrayList<>(), combinations);

        // 輸出所有組合
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
        System.out.println("總組合數: " + combinations.size());

    }

    // 遞迴函式
    private static void generateCombinations(int numDice, int faces, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == numDice) { // 組合完成
            result.add(new ArrayList<>(current));
            return;
        }

        // 從 start 開始確保非重複
        for (int i = start; i <= faces; i++) {
            current.add(i);
            generateCombinations(numDice, faces, i, current, result); // 下一層遞迴
            current.remove(current.size() - 1); // 回溯
        }
    }
}