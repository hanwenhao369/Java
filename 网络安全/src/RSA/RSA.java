package RSA;
import java.math.*;
import java.util.*;
public class RSA {
    public static void main(String[] args) {
        Random rnd = new Random(new Date().getTime());
        System.out.println(BigInteger.probablePrime(1024, rnd));
    }
}