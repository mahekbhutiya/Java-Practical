public class intvalue {
        public static void main(String[] args) {
        
        int intValue = 50;       // starting value
        
        long longValue = intValue;   // int → long
        float floatValue = longValue; // long → float
        double doubleValue = floatValue; // float → double

        System.out.println("int value: " + intValue);
        System.out.println("long value: " + longValue);
        System.out.println("float value: " + floatValue);
        System.out.println("double value: " + doubleValue);
    }
}

