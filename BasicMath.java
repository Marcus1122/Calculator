package cs1302.calc;

/**
 * Provides a basic implementation of the operations defined in the Math
 * interface. This implementation assumes that the inputs to each method are
 * non-negative integers.
 *
 * @author Michael E. Cotterell
 */
public class BasicMath implements Math {
    
    /**
    * This performs the addition operation.
    *
    * @param lhs the number to the left of the addition symbol
    * @param rhs the number to the right of the addition symbol
    */
    public int add(int lhs, int rhs) {
        return lhs + rhs;
    } // add

    /**
    * This performs the subtraction operation.
    *
    * @param lhs the number to the left of the subtraction symbol
    * @param rhs the number to the right of the subtraction symbol
    */
    public int sub(int lhs, int rhs) {
        if (lhs - rhs < 0) return 0;
        return lhs - rhs;
    } // sub

    /**
    * This performs the multiplication operation.
    *
    * @param lhs the number to the left of the multiplication symbol
    * @param rhs the number to the right of the multiplication symbol
    */
    public int mul(int lhs, int rhs) {
        return lhs * rhs;
    } // mul

    /**
    * This performs the division operation.
    *
    * @param lhs the number to the left of the division symbol
    * @param rhs the number to the right of the division symbol
    */
    public int div(int lhs, int rhs) throws ArithmeticException {
        return lhs / rhs;
    } // div

    /**
    * This performs the factorial operation.
    *
    * @param num the number whose factorial is taken
    */
    public int fac(int num) {
        // THE NARWHAL BACONS!
        int product = 1;              // products start with one
        int n       = ++num;          // increment, like a boss
        while (n --> 2) product *= n; // while n approaches 2, multiply
        return product;               // wait, "-->",  WAT!?
    } // fac

    /**
    * This performs the exponentiation operation.
    *
    * @param lhs the number being exponentiated
    * @param rhs the exponent
    */
    public int pow(int lhs, int rhs) {
        return (int) java.lang.Math.pow(lhs, rhs);
    } // pow

} // BasicMath
