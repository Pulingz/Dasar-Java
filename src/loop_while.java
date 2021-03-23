public class loop_while {
    public static void main(String[] args) {
        // WHILE LOOP
        var hitung = 1;
        while (hitung <= 11) {
            System.out.println("Ulang ke - " + hitung);
            hitung++;
        }

        // DO WHILE LOOP
        var hi_tung = 99;
        do {
            System.out.println("Diulang ke - " + hi_tung);
            hi_tung++;
        } while (hitung <= 11);

        // BREAK & CONTINUE
        var hitu_ng = 1;
        while(true){
            System.out.println("ULANG: "+hitu_ng);
            hitu_ng++;

            if(hitu_ng > 10)
                break;
        }
        System.out.println("Stop Ulang");

        for(int ganjil =0; ganjil <=11; ganjil++){
            if(ganjil % 2 == 0){ // tampilkan ganjil
                continue;
            }
            System.out.println("Ganjil berulang: "+ganjil);
        }

        for(int genap =0; genap <=11; genap++){
            if(genap % 2 != 0){ // tampilkan genap
                continue;
            }
            System.out.println("Genap berulang: "+genap);
        }

        for(int prima =0; prima <=11; prima++){
            if(prima != 2 && prima % 2 == 0){ // tampilkan prima
                continue;
            }
            System.out.println("PRIMA berulang: "+prima);
        }
    }
}
