public class method {
    public static void main(String[] args) { // main method
        Hai_dunia(); // method = function

        Nama_Nya("Conan", "Edogawa"); // Method Parameter: No Limit
        Nama_Nya("Eren", "Yeager");

        var x = 50;
        var y = 35;
        var a = tambah(x, y); // Method Return Value
        System.out.println(a);

        System.out.println(plus_minus(100, "+", 200));// Method: more than 1 Return
        System.out.println(plus_minus(200, "-", 100));
        System.out.println(plus_minus(5, "salah", 6));

        // Method: Variable Argument
        int[] values = {87, 56, 67, 90, 100, 34}; // Limited
        selamat("Kindaichi", values);

        Ucapan("monkart", 89, 78, 23, 90, 45, 78, 99, 87); // UNLIMITED

        // Method: Overloading
        hai();
        hai("Digimon");
        hai("Digimon", "Universe");

        // Method: Recursif
        System.out.println(faktorial(9));
        System.out.println(1*2*3*4*5*6*7*8*9);
        System.out.println(Faktorial_Recursif(9));

        // KELEMAHAN RECURSIF
        // ERROR StackOverFlow
        loop (6600);
    }

    static void Hai_dunia() {
        for (var z = 0; z < 5; z++) {
            System.out.println("Hai Semesta " + z);
        }
    }

    static void Nama_Nya(String awal, String akhir) {
        System.out.println("Nama Lengkap: " + awal + " " + akhir);
    }

    static int tambah(int angka1, int angka2) {
        var jumlah = angka1 + angka2;
        return jumlah;
    }

    static int plus_minus(int no1, String opr, int no2) {
        switch (opr) {
            case "+":
                return no1 + no2;
            case "-":
                return no1 - no2;
            default:
                return 0;
        }
    }

    static void selamat(String siswa, int[] values){
        int totals = 0;
        for (var nilai: values){
            totals += nilai;
        }

        var hasil = totals / values.length;

        if(hasil >= 75){
            System.out.println("Selamat " + siswa + ", Kamu Sukses " + hasil);
        } else{
            System.out.println("Maaf " + siswa + ", Belum Sukses " + hasil);
        }
    }

    static void Ucapan(String siswa, int... values){
        int totals = 0;
        for (var nilai: values){
            totals += nilai;
        }

        var hasil = totals / values.length;

        if(hasil >= 75){
            System.out.println("Selamat " + siswa + ", Kamu Sukses " + hasil);
        } else{
            System.out.println("Maaf " + siswa + ", Belum Sukses " + hasil);
        }
    }

    static void hai(){
        System.out.println("Halo");
    }

    static void hai(String awalan){
        System.out.println("Hai " + awalan);
    }

    static void hai(String awalan, String akhiran){
        System.out.println("Hay " + awalan + " " + akhiran);
    }

    static int faktorial(int nomor){
        var hasilnya = 1;
        for(var n =1; n <= nomor; n++){
            hasilnya *= n;
        }
        return hasilnya;
    }

    static int Faktorial_Recursif(int nilai){
        if (nilai == 1){
            return 1;
        }
        else{
            return nilai * Faktorial_Recursif(nilai - 1);
        }
    }

    static void loop(int tumpuk){
        if (tumpuk == 0){
            System.out.println("FINISH");
        }
        else {
            System.out.println("Loop- " + tumpuk);
            loop(tumpuk - 1);
        }
    }

}
