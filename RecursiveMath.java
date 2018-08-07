package cs1302.calc;

/* Implement the Math interface using recursion here. For each method, replace
 * the throw statement with your implementation.
 */

/**
 * This class is used to perform the operations of the
 * calculator through recursion.
 *
 * @author Marcus Howard
 * @author Michael Earl
 */
public class RecursiveMath implements Math {

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
    * This performs the addition operation recursively.
    *
    * @param lhs the number to the left of the addition symbol
    * @param rhs the number to the right of the addition symbol
    */
    public int add(int lhs, int rhs) {
	if(rhs == 0){
	    return lhs;
	} // if
	return add(inc(lhs),dec(rhs));
    } // add

    /**
    * This performs the subtraction operation recursively.
    *
    * @param lhs the number to the left of the subtraction symbol
    * @param rhs the number to the right of the subtracttion symbol
    */
    public int sub(int lhs, int rhs) {
        if(rhs == 0){
	    return lhs;
	} // if
	if(rhs > lhs){
	    return 0;
	} // if
	return sub(dec(lhs),dec(rhs));
    } // sub

    /**
    * This performs the multiplication operation recursively.
    *
    * @param lhs the number to the left of the multiplication symbol
    * @param rhs the number to the right of the multiplication symbol
    */
    public int mul(int lhs, int rhs) {
        if(rhs == 0){
	    return 0;
	} // if
	if(rhs == 1){
	    return lhs;
	} // if
	return add(lhs,mul(lhs,dec(rhs)));
    } // mul

    /**
    * This performs the division operation recursively.
    *
    * @param lhs the number to the left of the division symbol
    * @param rhs the number to the right of the division symbol
    */
    public int div(int lhs, int rhs) {
        if(lhs < rhs){
	    return 0;
	} // if
	if(lhs == rhs){
	    return 1;
	} // if
	return inc(div(sub(lhs,rhs),rhs));
    } // div

    /**
    * This performs the factorial operation recursively.
    *
    * @param n the number whose factorial is being calculated
    */
    public int fac(int n) {
        if(n == 0){
	    return 1;
	} // if
	return n * fac(n-1);
    } // fac

    /**
    * This performs exponentiation recursively.
    *
    * @param lhs the number being exponentiated
    * @param rhs the exponent
    */
    public int pow(int lhs, int rhs) {
        if(rhs == 0){
	    return 1;
	} // if
	return mul(lhs,pow(lhs,dec(rhs)));
    } // pow

} // RecursiveMath
