package laba;

/**
 * Created by blashpemy on 20.02.2016.
 */
public class laba {
    public static void main(String[] args) {
        int a = 3, b = 3, n = 8, m = 8;
        int C=5322%3;
        double s = 0;
        System.out.println("a=" + a + " n=" + n + "   b=" + b + " m=" + m);

        if ((a <= n) && (b <= m))

            if ((-C >= a) && (-C <= m)) System.out.println("Ділення на 0");

            else

            {

                for (int i = a; i <= n; i++)

                    for (int j = b; j <= m; j++)

                        s += i % j / (i + C);


                System.out.println("s = " + s);

            }

        else

            System.out.print("Помилка в умові");

    }
}




