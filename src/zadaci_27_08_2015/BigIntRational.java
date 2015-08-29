package zadaci_27_08_2015;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntRational extends Number implements Comparable<BigIntRational>{
	
	// Data fields for numerator and denominator
	private BigInteger numerator = BigInteger.ZERO;
	private BigInteger denominator = BigInteger.ONE;
	
	public BigIntRational() {
		this.numerator = BigInteger.ZERO;
		this.denominator = BigInteger.ONE;
	}
	public BigIntRational(BigInteger numerator,  BigInteger denominator){
		BigInteger gcd = numerator.gcd(denominator);
		this.numerator = ((denominator.compareTo(BigInteger.ZERO) == 1) ? BigInteger.ONE
				: new BigInteger("-1")).multiply(numerator).divide(gcd);
		this.denominator = denominator.abs().divide(gcd);
	}
	/** Return numerator */
	public BigInteger getNumerator() {
		return numerator;
	}

	/** Return denominator */
	public BigInteger getDenominator() {
		return denominator;
	}

	/** Add a rational number to this rational */
	public BigIntRational add(BigIntRational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator()).add(
				denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new BigIntRational(n, d);
	}

	/** Subtract a rational number from this rational */
	public BigIntRational subtract(BigIntRational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator())
				.subtract(denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new BigIntRational(n, d);
	}

	/** Multiply a rational number by this rational */
	public BigIntRational multiply(BigIntRational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getNumerator());
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new BigIntRational(n, d);
	}

	/** Divide a rational number by this rational */
	public BigIntRational divide(BigIntRational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator());
		BigInteger d = denominator.multiply(secondRational.numerator);
		return new BigIntRational(n, d);
	}

	@Override
	public String toString() {
		if (denominator.compareTo(BigInteger.ONE) == 0)
			return numerator + "";
		else
			return numerator + "/" + denominator;
	}

	@Override
	// Override the equals method in the Object class
	public boolean equals(Object other) {
		if ((this.subtract((BigIntRational)(other))).getNumerator().compareTo(BigInteger.ZERO) == 0)
			return true;
		else
			return false;
	}

	@Override
	// Implement the abstract intValue method in Number
	public int intValue() {

		return (int) doubleValue();
	}

	@Override
	// Implement the abstract floatValue method in Number
	public float floatValue() {
		return (float) doubleValue();
	}

	@Override
	// Implement the doubleValue method in Number
	public double doubleValue() {
		BigDecimal bd = new BigDecimal(this.numerator);
		BigDecimal bdDoubleValue = bd.divide(new BigDecimal(denominator));
		return bdDoubleValue.doubleValue();
	}

	@Override
	// Implement the abstract longValue method in Number
	public long longValue() {
		return (long) doubleValue();
	}

	
	// Implement the compareTo method in Comparable
	public int compareTo(BigIntRational o) {
		if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) == 1)
			return 1;
		else if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) == -1)
			return -1;
		else
			return 0;
	}

}
