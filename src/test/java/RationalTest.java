import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
//    @Test
//    public void testAdd() {
//        Rational x = new Rational();
//        x.numerator = 1;
//        x.denominator = 2;
//        Rational y = new Rational();
//        y.numerator = 1;
//        y.denominator = 4;
//        x.add(y);
//        Assert.assertEquals(3, x.numerator);
//    }
    @Test
    public void testAdd(){
        Rational r = new Rational();
        r.numerator = 1;
        r.denominator = 2;
        Rational s = new Rational();
        s.numerator = 1;
        s.denominator = 2;
        r.add(s);
        Assert.assertEquals(1, r.numerator);
        Assert.assertEquals(1, r.denominator);
    }

    @Test
    public void testSubtract(){
        Rational r = new Rational();
        r.numerator = 1;
        r.denominator = 2;
        Rational s = new Rational();
        s.numerator = 1;
        s.denominator = 4;
        r.subtract(s);
        Assert.assertEquals(1, r.numerator);
        Assert.assertEquals(4, r.denominator);
    }

    @Test
    public void testMultiply(){
        Rational r = new Rational();
        r.numerator = 1;
        r.denominator = 2;
        Rational s = new Rational();
        s.numerator = 1;
        s.denominator = 2;
        r.multiply(s);
        Assert.assertEquals(1, r.numerator);
        Assert.assertEquals(4, r.denominator);
    }

    @Test
    public void testDivide(){
        Rational r = new Rational();
        r.numerator = 1;
        r.denominator = 2;
        Rational s = new Rational();
        s.numerator = 1;
        s.denominator = 2;
        r.divide(s);
        Assert.assertEquals(1, r.numerator);
        Assert.assertEquals(1, r.denominator);
    }

    @Test
    public void testEqual1(){
        Rational r = new Rational();
        r.numerator = 1;
        r.denominator = 2;
        Rational s = new Rational();
        s.numerator = 1;
        s.denominator = 2;
        Assert.assertTrue(r.equals(s));
    }

    @Test
    public void testEqual2(){
        Rational r = new Rational();
        r.numerator = 1;
        r.denominator = 2;
        Assert.assertTrue(r.equals("2/4"));
    }

    @Test
    public void testCompareTo1(){
        Rational r = new Rational();
        r.numerator = 1;
        r.denominator = 2;
        Rational s = new Rational();
        s.numerator = 1;
        s.denominator = 3;
        long result = r.compareTo(s);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testCompareTo2(){
        Rational r = new Rational();
        r.numerator = 1;
        r.denominator = 2;
        long result = r.compareTo("1/2");
        Assert.assertEquals(0, result);
    }

}
