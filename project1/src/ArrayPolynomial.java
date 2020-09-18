// ********************************************************
//ArrayPolynomial that implements the ADT Polynomial.
// By: Mati N.
// Date: 09/14/2020
// *********************************************************
public class ArrayPolynomial implements Polynomial {
	// instance variables/data fields
	// declare array of size 100

	private double[] ArrayPolynomial = new double[100];
	private int degree;

	public ArrayPolynomial() { // default Constructor
		degree = 0;
		for (int i = 0; i < 100; i++) {
			ArrayPolynomial[i] = 0;
		}
	}

	// set degree to 0
	// set array to array of 0's
	public int degree() {
		// Determines the degree of a polynomial.
		// Precondition: None.
		// Postcondition: Returns the degree of a polynomial
		// Throws: None.

		return degree;
	}

	public double getCoefficient(int power) throws ExponentOutOfRangeException {
		// Gets the coefficient of the x to the power term.
		// Precondition: power is the power of the term wanted.
		// Postcondition: If power is not out of range, the
		// coefficient of the x to the power term is returned.
		// Throws: ExponentOutOfRangeException if exponent is out of range.

		if (power < ArrayPolynomial.length) {
			return ArrayPolynomial[power];
		} else if (power > ArrayPolynomial.length) {
			throw new ExponentOutOfRangeException("ExponentOutOfRangeException");
		}
		return ArrayPolynomial[power];

	}

	public void setCoefficient(double newCoefficient, int power) throws ExponentOutOfRangeException {
		// Replaces the coefficient of the x to the power term with
		// newCoefficient.
		// Precondition: power indicates which term the coefficient
		// should be replaced.
		// Postcondition: If power is not of out range, the coefficient
		// of the x to the power term will be set to newCoefficent.
		// Throws: ExponentOutOfRangeException if exponent is out of range.
		if (power < ArrayPolynomial.length) {
			ArrayPolynomial[power] = newCoefficient;
			int i = 99;
			while (ArrayPolynomial[i] == 0 && i >= 0) {
				i--;
			}
			degree = i;
		} else {
			throw new ExponentOutOfRangeException("ExponentOutOfRangeException");
		}
	}

	public Polynomial add(Polynomial p) {
		// Adds polynomial p to this polynomial without modifying this
		// polynomial and returns the result.
		// Precondition: None.
		// Postcondition: The returned polynomial is the sum of this
		// and p. Both this and p are unchanged.
		Polynomial q = new ArrayPolynomial();
		for (int i = 0; i < this.ArrayPolynomial.length; i++) {
			for (int j = 0; j < 100; j++) {
				
			if (this.ArrayPolynomial[i] != 0) {
				this.ArrayPolynomial[i] += this.ArrayPolynomial[i];
			}
		}
		
		}
		return q;
	}

	public Polynomial mult(Polynomial p) throws ExponentOutOfRangeException {
		// Multiplies polynomial p to this polynomial without modifying this
		// polynomial and returns the result.
		// Precondition: None.
		// Postcondition: The returned polynomial is the product of this
		// and p. Both this and p are unchanged.
		// Throws: ExponentOutOfRangeException if exponent is out of range.
		Polynomial q = new ArrayPolynomial();
		for (int i = 0; i < 100; i++) {
			q.setCoefficient(p.getCoefficient(i) * ArrayPolynomial[i], i);
		}
		return q;
	}

	public void mult(double scalar) {
		// Multiplies a scalar to this polynomial.
		// Precondition: None.
		// Postcondition: All the coefficients in this polynomial is
		// multiplied by scalar.
		// Throws: None.
	}

	public double evaluate(double x) {
		// Evaluates the polynomial at x.
		// Precondition: None.
		// Postcondition: None.
		// Throws: None.
		return 0.0;
	}

	public void displayPolynomial() {
		// Display the polynomial.
		// Precondition: None.
		// Postcondition: None.
		// Throws: None.
	}

} // end Polynomial