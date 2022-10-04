public class Main {
    public static void main(String[] args) {
        System.out.println("1 task: ");
        for (int a=6; a>0 ; a--)
        {
            for (int j=1; j<=a; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("2 task: ");
        for (int b=6; b>0; b--)
        {
            for (int c=6; c>=b; c--)
            {
                System.out.print("*");
            }
            for (int d=1; d<b; d++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
