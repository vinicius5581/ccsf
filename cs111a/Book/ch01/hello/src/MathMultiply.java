/**
 * Created by vinicius on 3/4/16.
 */
import java.math.*;

public class MathMultiply {
    BigInteger oneHundred = new BigInteger("100");
    BigInteger fiftyMillion = new BigInteger("50000000");
    //System.out.println(oneHundred.multiply(fiftyMillion));
    // Prints 5000000000

    //The BigDecimal type carries out  oating-point computations without roundoff errors. For example,
    BigDecimal price = new BigDecimal("4.35");
    BigDecimal quantity = new BigDecimal("100");
    BigDecimal total = price.multiply(quantity);
    //System.out.println(total); // Prints 435.0
}
