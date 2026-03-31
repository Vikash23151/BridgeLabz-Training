class HeightOfPlayers {
    //method to assign height to players
    public static void assignHeights(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Math.random()*(max - min + 1) + min.
            arr[i] = (int)(Math.random() * 101) + 150;
        }
    }
    // method to find the sum of heights
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int height : arr) {
            sum += height;
        }
        return sum;
    }
    // method to find mean of heights of players
    public static double findMean(int[] arr) {
        int sum = findSum(arr);
        return (double) sum / arr.length;
    }
    // method to find shortest player
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    // method to find tallest player
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        assignHeights(heights);
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        System.out.println("Total Sum of Heights: " + sum + " cm");
        System.out.printf("Mean Height: %.2f cm%n", mean);
        System.out.println("Shortest Player: " + shortest + " cm");
        System.out.println("Tallest Player: " + tallest + " cm");
    }
}