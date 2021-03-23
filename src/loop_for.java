public class loop_for {
    public static void main(String[] args) {
        // Loop For tanpa kondisi
        //for(;;){
        // System.out.println("Terus berulang");
        //}

        // Loop for dengan kondisi
        var hitung = 0.5;
        for (; hitung <= 10; ) {
            System.out.println("Ulang ke " + hitung);
            hitung++;
        }
        System.out.println("Nilai: " + hitung);
// loop for dengan init statement
        for (var tambah = 0.99; tambah <= 10; ) {
            System.out.println("Diulang ke: " + tambah);
            tambah++;
        }
// loop for dengan post statement
        for (var ubah = 0.89999; ubah <= 10; ubah++) {
            System.out.println("Ubah ke: " + ubah);
        }
    }
}
