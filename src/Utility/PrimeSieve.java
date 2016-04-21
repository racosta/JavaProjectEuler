package Utility;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by SG0210832 on 4/14/2016.
 */
public class PrimeSieve {
    public static ArrayList<Long> primeSieve(long N) {
        ArrayList<Long> primes = new ArrayList<Long>();
        HashMap<Long, Boolean> sieve = new HashMap<Long, Boolean>();
        long num;
        long start_ndx = 0;

        if (N < 2) {
            return primes;
        }
        primes.add((long) 2);
        long max_ndx = (N-1)/2;
        for (long ndx = 0; 2 * ndx * ndx < N; ++ndx) {
            if (!sieve.containsKey(ndx)) {
                num = 2*ndx + 3;
                start_ndx = ndx;
                primes.add(num);
                for (Long s: sieve.keySet()) {
                    if (s <= start_ndx) {
                        sieve.remove(s);
                    }
                    break;
                }
                for (long index = ndx + num; index < max_ndx; index += num) {
                    sieve.put(index, false);
                }
            }
        }
        for (long ndx = start_ndx + 1; ndx < max_ndx; ndx++) {
            if (!sieve.containsKey(ndx)) {
                primes.add(2*ndx + 3);
            }
        }
        return primes;
    }
}
