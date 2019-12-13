public class speedConverter {


        public static void main (String[] args){
            System.out.println (toMilesPerHour(1/2));
            printConversion(25.42);
        }

        public static long toMilesPerHour (double kilometersPerHour){
            // 1 mile per hour is 1.609 kilometers per hour
            // Kilo to miles = kilo / 1.609
            // Miles to kilo = Miles * 1.609

            long rounded;
            if (kilometersPerHour >= 0){
                double calc = kilometersPerHour / 1.609;
                rounded = Math.round(calc);
                return rounded;
            }
            return -1;

        }

        public static void printConversion (double kilometersPerHour){

            // 1 mile per hour is 1.609 kilometers per hour
            // Kilo to miles = kilo / 1.609
            // Miles to kilo = Miles * 1.609

            long rounded;
            if (kilometersPerHour >= 0){
                double calc = kilometersPerHour / 1.609;
                rounded = Math.round(calc);
                System.out.println( kilometersPerHour + " km/h" + " = " + rounded + " mi/h" );

            } else {
                System.out.println("invalid Value");
            }


        }




    }

