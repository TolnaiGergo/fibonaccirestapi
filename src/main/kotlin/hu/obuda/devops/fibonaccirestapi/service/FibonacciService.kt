package hu.obuda.devops.fibonaccirestapi.service

import org.springframework.stereotype.Service

@Service
class FibonacciService {
    fun fibonacci(n: Int): Int {
        if ((n==1) || (n==2))
            return 1
        else {
            var prev = 1;
            var result = 1;

            for (i in 3..n) {
                var temp = result;
                result = prev + result;
                prev = temp;
            }
            return result;
        }
    }
}