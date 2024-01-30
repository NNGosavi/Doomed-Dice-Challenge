import java.util.*;

public class DoomDiceChallengeMain {
    public static void main(String[] args) {

//        You are given two six-sided dice, Die A and Die B, each with faces numbered from 1 to 6.
        int[] dieA = {1, 2, 3, 4, 5, 6};
        int[] dieB = {1, 2, 3, 4, 5, 6};
        System.out.println("Solution of Part-A (1)");
        System.out.println("Total number of possible combinations are: ");
        DoomedDicePartA1.PossibleComboCount(dieA, dieB);

        System.out.println();
        System.out.println("Solution of Part-A (2)");
        System.out.println("The distribution of all possible combinations that can be obtained when rolling both Die A and Die B together are as follows: ");
        DoomedDicePartA2.PossibleCombinations(dieA, dieB);

        System.out.println();
        System.out.println("Solution of Part-A (3)");
        System.out.println("The Probability of all Possible Sums occurring among the number of combinations is as follows: ");
        DoomedDicePartA3.ProbabilityOfSum(dieA, dieB);
        System.out.println();
        System.out.println("Solution of Part-B");

        HashSet<Integer> idle = DoomedDicePartB.ProbabilitySet(dieA, dieB);
        HashSet<Integer> result = DoomedDicePartB.undoomDice(dieA, dieB);
        System.out.println();

//        But in order to play your game, the probability of obtaining the Sums must remain the
//        same! Therefore
        System.out.println("The Probability of obtaining the sum remains same." + idle.equals(result));
    }
}
