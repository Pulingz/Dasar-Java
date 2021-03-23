public class Data_Number {
    public static void main(String[] args) {
        // angka integer
        byte ini_byte = 100;
        short ini_short = 1000;
        int ini_int = 1000000;
        int itu_int = 1_000_000;
        long ini_long = 1000000000;
        long ini_Long2 = 1000000000L;
        long itu_long = 1_000_000_000_000L;

        // angka desimal
        float itu_float = 10.343412F;
        float ini_float = 1_000_000_000.235874328F;
        double ini_double = 12.34909;

        // angka literals
        int desimalInt = 26;
        int hexaInt = 0xA132B;
        int binInt = 0b010101010;

        // konversi tipe data: otomatis
        byte saya_byte = 10;
        short saya_short = saya_byte;
        int aku_Int = saya_short;
        long aku_long = aku_Int;
        float nah_float = aku_long;
        double nih_double = nah_float;

        // Hasil konversi otomatis
        System.out.println(saya_byte);
        System.out.println(saya_short);
        System.out.println(aku_Int);
        System.out.println(aku_long);
        System.out.println(nah_float);
        System.out.println(nih_double);

        // konversi tipe data: manual
        double z_double = 1_000_000_000_000_000.523158156347874356;
        float a_float = (float) z_double;
        long b_long = (long) a_float;
        int c_int = (int) b_long;
        short d_short = (short) c_int;
        byte e_byte = (byte) d_short;

        // Test Hasil
        System.out.println(z_double + " konversi manual");
        System.out.println(a_float);
        System.out.println(b_long);
        System.out.println(c_int);
        System.out.println(d_short);
        System.out.println(e_byte);


        // konversi tipe data: dipaksakan
        double b_double = 1_000_000_000.342335799;
        short coba_short =(short) b_double;
        System.out.println(coba_short);

    }
}
