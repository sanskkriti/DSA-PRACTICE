import java.util.*;
class gcd {
  public static void main (String Args[])
  {
Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int result = Math.min(a,b);

   while (result > 0) { // Keep checking until GCD found
            if (a % result == 0 && b % result == 0) {
                break; // Found GCD
            }
            result--; // Try next smaller number
        }

System.out.println(result);
  }
}
