public class data_nonPrimitif {
    public static void main(String[] args) {
        Integer ini_integer = 100;
        Long ini_long = 10000L;

        Byte ini_byte = null;
        System.out.println(ini_byte);
        ini_byte = 100;
        System.out.println(ini_byte);

// konversi primitif ke non primitif
        int itu_int = 100;
        Integer itu_Integer = itu_int;
        System.out.println(itu_Integer);

        // konversi non primitif ke primitif: sesama integer
        int akuInt = itu_Integer;
        System.out.println(akuInt);

        // konversi non primitif ke primitif: tidak compatible
        short short_umur = itu_Integer.shortValue();
        System.out.println(short_umur);
        byte byte_umur = itu_Integer.byteValue();
        System.out.println(short_umur);
    }
}