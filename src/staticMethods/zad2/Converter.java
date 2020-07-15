package staticMethods.zad2;

public class Converter {

    private static final double CUP = 250;
    private static final double TABLE_SPOON = 15;
    private static final double TEA_SPOON = 5;

        public static double cup(double qty) {
            return qty * CUP;
        }

        public static double tableSpoon(double qty) {
            return qty * TABLE_SPOON;
        }

        public static double teaSpoon(double qty) {
            return qty * TEA_SPOON;
        }
}
