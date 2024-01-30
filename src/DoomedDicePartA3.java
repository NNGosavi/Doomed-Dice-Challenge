import java.util.HashMap;
import java.util.Map;

public class DoomedDicePartA3 {

    public static void ProbabilityOfSum(int[] dieA, int[] dieB){

//        Calculate the Probability of all Possible Sums occurring among the number of
//        combinations.

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

        int sum = dieA[0]+dieB[0];

//        Sum will always be 2 <= Sum >= 12
        while (sum <= 12) {
            System.out.println("P(Sum = " + sum + ") = " + probabilityPossibleSumsMap.get(sum) + "/36");
            sum++;
        }
    }

    public static void ProbabilityOfSum(int[] dieA, int[] dieB, int sum){
        int totalCombinations = dieA.length * dieB.length;
//        Calculate the Probability of all Possible Sums occurring among the number of
//        combinations.

        if(sum < 2 || sum >12){
            System.out.println( "Sum = "+sum +" is not possible to achieve using 2 dices\n" +
                    "Value of Sum should range in between 2 and 12.");
            return;
        }
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

//        Sum will always be 2 <= Sum >= 12
//        while (sum <= 12) {
        System.out.println("P(Sum = " + sum + ") = " + probabilityPossibleSumsMap.get(sum) + "/"+totalCombinations);
//            sum++;
//        }
    }
}
