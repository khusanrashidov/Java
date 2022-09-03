public class FoorLoops {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("I love animals.");
        }
        for(int j = 0; j < 9; j++)
        {
            System.out.println(j);
        }
        int grades[] = {100, 88, 75, 95, 62};
        for(int k = 0; k < grades.length; k++)
        {
            System.out.println(grades[k]);
        }
        //below code means no sense
        for(int h = 10; h <= 10; h--)
        {
            System.out.println("I love animals.");
        }
    }
}