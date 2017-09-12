def exponent(x:Double, n: Int): Double = {
    // positive
    if(n ==0) 1
    else if(n > 0) {
        // even
        if(n % 2 == 0) {
            val y = exponent(x,n/2);
            y*y;
        } else x * exponent(x, n-1) // odd
    } else 1/(exponent(x, -n)) // negative
}

