import java.util.Scanner;

/**
 * Part 1
 * Questions
 *  1. It's a construction problem
 *  2. a)
 */

public class FibonacciSequence {
    public int RecursiveFib(int n) {
        if(n <= 1) {                                            //comparaison (1)
            return n;                                           //retour (1)
        }
        return RecursiveFib(n-1) + RecursiveFib(n-2);     //retour + addition (2)
    }

    /**
     *  2. b) The complexity is O(n*n)
     *  2. c)
     */


    public int IterativeFib(int n) {
        int F0 = 0;                 //affectation (1)
        int F1 = 1;                 //affectation (1)
        for(int i=1; i<=n; i++) {   //comparaison (1)
            int somme = F0 + F1;    //addition + affectation (2)
            F0=F1;                  //affectation (1)
            F1=somme;               //affectation (1)
        }
        return F0;                  //retour (1)
        //complexite : 1+1+(1+2+1+1)*(n)+1 = 5n+3 operations
    }
    /**
     * The complexity is O(n)
     */

        static void Permutations(String unique, char str)
        {
            for (int i = 0; i < unique.length(); i++) {
                str = unique.charAt(i);
                String permute = unique.substring(0, i) +
                        unique.substring(i + 1);
                
                Permutations(permute, str + str);
            }
        }


}
