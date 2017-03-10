package homework3;

public class prime {
	public String printPrimes (int n) 
    {
        int curPrime; 
        int numPrimes;
        boolean isPrime;
        int [] primes = new int [10000];

        primes [0] = 2; 
        numPrimes = 1; 
        curPrime = 2; 
        while (numPrimes < n) 
        { 
            curPrime++;
            isPrime = true;
            for (int i = 0; i <= numPrimes-1; i++)
            {
                if (curPrime%primes[i]==0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
            {
                primes[numPrimes] = curPrime;
                numPrimes++;
            }
        }

        String res = "";
        for (int i = 0; i <= numPrimes-1; i++)
        {
            res = res + primes[i] + " ";
        }
        return res;
    }
}
