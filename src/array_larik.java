public class array_larik {
    public static void main(String[] args) {
        String[] array_String = new String[4];
        array_String[0] = "pear";
        array_String[1] = "apel";
        array_String[2] = "kiwi";
        array_String[3] = "sawo";

        System.out.println(array_String[3]);

        int[] array_int = new int[]{
                23, 45, 89, 90, 34, 57
        };

        long[] array_long ={
                45, 87, 12, 36, 87, 98
        };
        System.out.println(array_long.length);

        // Array bersarang(Array di dalam Array)
        String[][] anggota ={
                {"toyota", "honda", "suzuki"},
                {"ducati", "yamaha", "kawasaki"},
                {"nissan", "renault", "datsun", "ford", "bmw", "wuling"}
        };
        System.out.println(anggota[2][4]);
    }
}
