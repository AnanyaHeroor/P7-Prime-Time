/**
 * For the first challenge, Jeff has designed a race: the contestants must race
across a pond filled with piranhas, and then eat an entire goose liver. When they finish the liver,
they are given a random number between 1 and 100,000, and they must compute the sum of the
digits of that number. The contestant to finish the race last loses, and is kicked off of the show.
 * @author Ananya Heroor
 */
public class Challenge1{
    public static void main (String[] args){
        int i = 0;
        for (i=1; i<=100000; i++){
            System.out.println("The sum of the digits of " + i+ " is: " + computeDigitSum(i));
        }
    }
    public static int computeDigitSum (int n){
            if (n<10){
                return n;
            } else{
              return (n%10 + computeDigitSum(n/10));  
            }
        }
    }