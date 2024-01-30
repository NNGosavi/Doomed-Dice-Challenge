import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DoomedDicePartA2 {
    public static void PossibleCombinations(int[] dieA, int[] dieB){

//        Calculate and display the distribution of all possible combinations that can be
//        obtained when rolling both Die A and Die B together. Show the math along with
//        the code!
        String[][] possibleCombinations = new String[dieA.length][dieB.length];

        /*
        the combinations would be as follows:
        Die A Value + Die B Value = Sum
        1 + 1 = 2
        1 + 2 = 3
        1 + 3 = 4
        .
        .
        .
        6 + 4 = 10
        6 + 5 = 11
        6 + 6 = 12
        */

        System.out.println("(Value On Die A) + (Value On Die B) = Sum");
        int count = 1;
        for (int i = 0; i < dieA.length; i++) {
            for (int j = 0; j < dieB.length; j++) {
                int sum = dieA[i] + dieB[j];
                possibleCombinations[i][j] = dieA[i] + " + " + dieB[j] + " = " + sum;
                System.out.println(count++ +") "+possibleCombinations[i][j]);
            }
        }
    }

    public static HashSet<Integer> ProbabilitySet(int[] dieA, int[] dieB){
        Map<Integer, Integer> probabilityPossibleSumsMap = new HashMap<>();

        for (int i = 0; i < dieA.length; i++) {
            for (int j = 0; j < dieB.length; j++) {
                int sum1 = dieA[i] + dieB[j];
                if (probabilityPossibleSumsMap.containsKey(sum1)) {
                    probabilityPossibleSumsMap.put(sum1, probabilityPossibleSumsMap.get(sum1) + 1);
                } else {
                    probabilityPossibleSumsMap.put(sum1, 1);
                }
            }
        }
        return new HashSet<>(probabilityPossibleSumsMap.values());
    }
}
