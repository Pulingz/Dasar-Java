public class data_2boleean {
    public static void main(String[] args) {
        // absen:
        var budi = 70;
        var toni = 80;

        // Nilai
        var Budi_ = 95;
        var Toni_ = 85;

        var Lulus_Absen_budi = budi >= 75;
        var Lulus_Nilai_budi = Budi_ >= 80;

        var Lulus_Absen_toni = toni >= 75;
        var Lusus_Nilai_toni = Toni_ >= 80;

        var BUDI_ = Lulus_Absen_budi && Lulus_Nilai_budi;
        var TONI_ = Lulus_Absen_toni || Lusus_Nilai_toni;

        System.out.println(BUDI_);
        System.out.println(TONI_);

        // Statement: kumpulan expression
        // Block: kumpulan Statement

        if (budi >= 75 && Budi_ >= 80) {
            System.out.println("Budi Lulus");
        } else {
            System.out.println("Budi Gagal");
        }

        // Ternary Operator
        String ucap = toni >= 75 && Toni_ >= 80 ? "Selamat, Kamu lulus" : "Ulang lagi";
        System.out.println(ucap);

        // if-else if -else
        var Nilai = 80.09;
        var Absen = 80;

        if (Nilai >= 80.1 && Absen >= 80.1) {
            System.out.println("Nilai A");
        } else if (Nilai >= 70.1 && Absen >= 70.1) {
            System.out.println("Nilai B");
        } else if (Nilai >= 60.1 && Absen >= 60.1) {
            System.out.println("Nilai C");
        } else if (Nilai >= 50.1 && Nilai >= 50.1) {
            System.out.println("Nilai D");
        } else {
            System.out.println("Nilai E");
        }

        // Switch
        var angka = "B";
        switch (angka) {
            case "A":
                System.out.println("Istimewa");
                break;
            case "B": // case B & C sama (digabung)
            case "C":
                System.out.println("Lulus");
                break;
            case "D":
                System.out.println("Tidak Lulus");
                break;
            default:
                System.out.println("Data Salah");
        }

        // Switch-Lambda
        switch (angka){
            case "A" -> System.out.println("Istimewa Sekali");
            case "B", "C" -> System.out.println("Yes, Lulus");
            case "D" -> System.out.println("Gagal Lagi");
            default -> {
                System.out.println("Datanya salah, ulang");
            }
        }

        // Switch-Yield
        String katakan = switch(angka){
            case "A":
                yield "Wow, Istimewa";
            case "B", "C":
                yield "Lulus dengan baik";
            case "D":
                yield "Gagal";
            default:
                yield "Coba pindah jurusan";
        };
        System.out.println(katakan);
    }
}
