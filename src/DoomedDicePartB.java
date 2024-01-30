import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DoomedDicePartB {
    public static HashSet<Integer> undoomDice(int[] dieA, int[] dieB){

        HashSet<Integer> idle = ProbabilitySet(dieA, dieB);

//        Die A cannot have more than 4 Spots on a face.
//        Die A may have multiple faces with the same number of spots.
//        No New_Die A[x] > 4
//        Therefore considering all the faces of dice A having 4 Spots.
        int[] newDieA = {4, 4, 4, 4, 4, 4};

//        Die B can have as many spots on a face as necessary i.e. even more than 6.
//        Die B satisfies the condition therefore dieB is used as it is.

        HashSet<Integer> result = ProbabilitySet(newDieA, dieB);
        boolean status = idle.equals(result);
        int i = 0;
        while(!status){
            newDieA[i] = i+1;
            result = ProbabilitySet(newDieA, dieB);
            status = idle.equals(result);
            i++;
        }
        System.out.println("New Die A = "+Arrays.toString(newDieA));
        System.out.println("New Die B = "+Arrays.toString(dieB));
        return result;
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
