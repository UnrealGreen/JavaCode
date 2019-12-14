public class MegaBytesConverter {
    public static void main (String[] args){
        printMegaBytesAndKiloBytes(2048);

    }
    public static void printMegaBytesAndKiloBytes ( int kiloBytes){
        // 1MB = 1024 KB
        int megaByte;
        int remainingKilo;

        if (kiloBytes < 0 ){
            System.out.println("Invalid Value");
        }
        else if (kiloBytes > 0 && kiloBytes < 1024) {
            megaByte = 0;
            remainingKilo = kiloBytes;

            System.out.println(kiloBytes + " KB = " + megaByte+ " MB and " + remainingKilo + " KB" );

        }
        else{

            megaByte = Math.round(kiloBytes / 1024);
            remainingKilo = kiloBytes%1024;


            System.out.println(kiloBytes + " KB = " + megaByte+ " MB and " + remainingKilo + " KB" );

        }



    }
}
