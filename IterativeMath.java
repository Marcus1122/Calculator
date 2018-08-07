package cs1302.calc;

/* Implement the Math interface using iteration here. For each method, replace
 * the throw statement with your implementation.
 */

/**
 * This class is used to perform the operations of the
 * calculator through iteration.
 *
 * @author Marcus Howard
 * @author Michael Earl
 */
public class IterativeMath implements Math {

    /**
    * This increments the number.
    *
    * @param n the number being incremented
    */
    public int inc(int n) {
        return n + 1;
    } // inc

    /**
    * This decrements the number.
    *
    * @param n the number being decremented
    */
    public int dec(int n) {
        return n - 1;
    } // dec

    /**
    * This performs the addition operation iteratively.
    *
    * @param lhs the number to the left of the addition symbol
    * @param rhs the number to the right of the addition symbol
    */
    public int add(int lhs, int rhs) {
        while(rhs != 0){
	    lhs = inc(lhs);
	    rhs = dec(rhs);
	} // while
	return lhs;
    } // add

    /**
    * This performs the subtraction operation iteratively.
    *
    * @param lhs the number to the left of the subtraction symbol
    * @param rhs the number to the right of the subtracttion symbol
    */
    public int sub(int lhs, int rhs) {
        if(rhs > lhs){
	    return 0;
	} // if
	while(rhs != 0){
	    lhs = dec(lhs);
	    rhs = dec(rhs);
	} // while
	return lhs;
    } // sub

    /**
    * This performs the multiplication operation iteratively.
    *
    * @param lhs the number to the left of the multiplication symbol
    * @param rhs the number to the right of the multiplication symbol
    */
    public int mul(int lhs, int rhs) {
        int sum = lhs;
	if(rhs == 0){
	    return 0;
	} // if
	while(rhs > 1){
	    sum = add(sum,lhs);
	    rhs = dec(rhs);
	} // while
	return sum;
    } // mul

    /**
    * This performs the division operation iteratively.
    *
    * @param lhs the number to the left of the division symbol
    * @param rhs the number to the right of the division symbol
    */
    public int div(int lhs, int rhs) {
        int count = 0;
	while(lhs >= rhs){
	    lhs = sub(lhs,rhs);
	    count = inc(count);
	} // while
	return count;
    } // div

    /**
    * This performs the factorial operation iteratively.
    *
    * @param n the number whose factorial is being calculated
    */
    public int fac(int n) {
        int count = 1;
	while(n > 0){
	    count = count * n;
	    n = n - 1;
	} // while
	return count;
    } // fac

    /**
    * This performs exponentiation iteratively.
    *
    * @param lhs the number being exponentiated
    * @param rhs the exponent
    */
    public int pow(int lhs, int rhs) {
        int count = 1;
	while(rhs > 0){
	    count = mul(count,lhs);
	    rhs = dec(rhs);
	} // while
	return count;
    } // pow

} // IterativeMath
