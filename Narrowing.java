public class Narrowing {
        public static void main(String[] args) {
        
        double doubleValue = 98.76;      // starting decimal value

        float floatValue = (float) doubleValue;   // double → float
        long longValue = (long) floatValue;       // float → long
        int intValue = (int) longValue;           // long → int
        short shortValue = (short) intValue;      // int → short
        byte byteValue = (byte) shortValue;       // short → byte

        System.out.println("double value: " + doubleValue);
        System.out.println("float value: " + floatValue);
        System.out.println("long value: " + longValue);
        System.out.println("int value: " + intValue);
        System.out.println("short value: " + shortValue);
        System.out.println("byte value: " + byteValue);
    }
}


