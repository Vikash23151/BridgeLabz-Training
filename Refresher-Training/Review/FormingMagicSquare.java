/*
    problem statement:
    You will be given a 3x3 s matrix  of integers in the inclusive range [1,9]. 
    We can convert any digit a to any other digit b in the range [1,9] at cost of |a-b|. 
    Given s, convert it into a magic square at minimal cost. Print this cost on a new line.
*/
import java.util.*;

public class FormingMagicSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> s = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                row.add(sc.nextInt());
            }
            s.add(row);
        }
        int result = formingMagicSquare(s);
        System.out.println(result);
        sc.close();
    }

    public static int formingMagicSquare(List<List<Integer>> s) {
        // 8 possible magic squares that can be created under the constraints
        int[][][] magicSquares = {
            {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2}
            },
            {
                {6, 1, 8},
                {7, 5, 3},
                {2, 9, 4}
            },
            {
                {4, 9, 2},
                {3, 5, 7},
                {8, 1, 6}
            },
            {
                {2, 9, 4},
                {7, 5, 3},
                {6, 1, 8}
            },
            {
                {8, 3, 4},
                {1, 5, 9},
                {6, 7, 2}
            },
            {
                {4, 3, 8},
                {9, 5, 1},
                {2, 7, 6}
            },
            {
                {6, 7, 2},
                {1, 5, 9},
                {8, 3, 4}
            },
            {
                {2, 7, 6},
                {9, 5, 1},
                {4, 3, 8}
            }
        };

        int minCost = Integer.MAX_VALUE;
        for (int[][] sq : magicSquares) {
            int cost = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    cost += Math.abs(sq[i][j] - s.get(i).get(j));
                }
            }
            minCost = Math.min(minCost, cost);
        }
        return minCost;
    }
}