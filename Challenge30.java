/**
 * For this challenge, each contestant will be suspended over a pit of crocodiles
while blinded-folded. Jeff will throw baseballs at them, which they must bat away with a rubber
chicken. If they get hit with a baseball, they will be given a random number between 2 and
100,000, and will need to compute the prime factorization of that number (i.e., write that number
as a product of primes). The first person to get a factorization incorrect loses.
 * @author Ananya Heroor
 */
public class Challenge30{
    public static void main (String [] args){
        int i = 0;
        for (i=1; i<=100000; i++){
            System.out.println("The factorization of " + i + " is: " + factor(i));
        }
    }
    public static boolean isPrime (int n){
        int i = 0;
        if ((n==1) || (n==2)){
            return true;
        }
        for (i=2; i<=n-1; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static String factor (int n){
        int i = 0;
        for (i=2; i<n; i++){
            if (n%i==0 && isPrime(i)){
                return i + "*" + factor(n/i);
            }
        }
        return n + "";
    }
}

