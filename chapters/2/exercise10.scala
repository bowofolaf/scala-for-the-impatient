// 10. Write a function that computes x^n, where n is an integer. Use the following
// recursive definition
// xn = y2 if n is even and positive, where y = x ^ n / 2.
// xn = x * x ^ n - 1 if n is odd and positive.
// x0 = 1
// xn = 1 / x ^ -n if n is negative.
// Don't use a return statement.
def exponent(x:Double, n: Int): Double = {    
    if(n == 0) 1
    // negative
    else if(n < 0) 1/(exponent(x, -n))
    // even
    else if(n % 2 == 0) {
        val y = exponent(x, n / 2);
        y*y;
    }
    // odd
    else x * exponent(x, n - 1) // odd
}

