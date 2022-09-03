public class ArraysIn2D {
    public static void main(String[] args) {
        int[][] lotteryCard = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        /*for simplicity above array is: |1, 2, 3|
                                         |4, 5, 6|
                                         |7, 8, 9|
        */
        int lotteryCard2[][] = new int [3][3]; //[row]x[column]
        lotteryCard2[0][0] = 0;
        lotteryCard2[0][1] = 1;
        lotteryCard2[0][2] = 2;
        lotteryCard2[1][0] = 3;
        lotteryCard2[1][1] = 4;
        lotteryCard2[1][2] = 5;
        lotteryCard2[2][0] = 6;
        lotteryCard2[2][1] = 7;
        lotteryCard2[2][2] = 8;
        System.out.println(lotteryCard[0][0]);
        System.out.println(lotteryCard2[2][2]);
        System.out.println("________________________________________________________________________________");
        int i;
        for (i = 0; i < lotteryCard.length; i++)
        {
            for(int j = 0; j < lotteryCard.length; j++)
            {
                System.out.print(lotteryCard[i][j] + "  ");
            }
            System.out.println();
        }
    }
}