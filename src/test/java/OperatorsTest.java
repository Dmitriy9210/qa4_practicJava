public class OperatorsTest {

    public static void main(String[] args) {
        int i = -79;
        short s_max = 32767;
        short s_min = -32768;
        long l = 13L;
        byte b_byte;
        boolean bool_true = true;
        boolean bool_false = false;
        double d_double = 125.7;
        float f = 34.5F;

        System.out.println(i <<6);
        System.out.println(i = ~i);

        String name = "qqqq";
        // Следующее вернётся верно, поскольку тип String
        boolean result = name instanceof String;
        System.out.println( result );

        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " + (a++));
        System.out.println("b--   = " + (b--));
        // Проверьте разницу в d++ и ++d
        System.out.println("d++   = " + (d++));
        System.out.println("++d   = " + (++d));

        System.out.println("Переполнение в максимальную сторону: " + (s_max += 3));
        System.out.println("Переполнение в минимальную сторону: " + (s_min -= 3));

        System.out.println(i += 1);
        System.out.println(i += 3);
        System.out.println(i /= 2);
        System.out.println(i *= 2);

        System.out.println("int + long: " + (i + l));
        System.out.println("float + double: " + (f + d_double));
        System.out.println("float + long: " + (f + l));


//        Операторы сравнения

        int a1 = 10;
        int b1 = 20;
        System.out.println("a == b = " + (a1 == b1));
        System.out.println("a != b = " + (a1 != b1));
        System.out.println("a > b = " + (a1 > b1));
        System.out.println("a < b = " + (a1 < b1));
        System.out.println("b >= a = " + (b1 >= a1));
        System.out.println("b <= a = " + (b1 <= a1));

        System.out.println("bool_false && bool_true: " + (bool_false && bool_true));
        System.out.println("bool_false || bool_true: " + (bool_false || bool_true));
        System.out.println("!bool_false && bool_true: " + (!bool_false && bool_true));


//    Операторы присваивания
        int a2 = 10;
        int b2 = 20;
        int c2 = 0;

        c2 = a2 + b2;
        System.out.println("c = a + b = " + c2);

        c2 += a2;
        System.out.println("c += a  = " + c2);

        c2 -= a2;
        System.out.println("c -= a = " + c2);

        c2 *= a2;
        System.out.println("c *= a = " + c2);

        a2 = 10;
        c2 = 15;
        c2 /= a2;
        System.out.println("c /= a = " + c2);

        a2 = 10;
        c2 = 15;
        c2 %= a2;
        System.out.println("c %= a  = " + c2);

        c2 <<= 2;
        System.out.println("c <<= 2 = " + c2);

        c2 >>= 2;
        System.out.println("c >>= 2 = " + c2);

        c2 >>= 2;
        System.out.println("c >>= a = " + c2);

        c2 &= a2;
        System.out.println("c &= 2  = " + c2);

        c2 ^= a2;
        System.out.println("c ^= a   = " + c2);

        c2 |= a2;
        System.out.println("c |= a   = " + c2);
    }
}

