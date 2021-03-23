public class loop_for_each {
    public static void main(String[] args) {
        // hanya untuk ambil/akses data array tidak untuk yang lain

        // TANPA FOR EACH
        String[] mobil ={
                "toyota", "suzuki", "honda", "ford", "bmw"
        };
        for (int mbl = 0; mbl < mobil.length; mbl++){
            System.out.println(mobil[mbl]);
        }
// FOR EACH
        for(var car: mobil){
            System.out.println(car.toUpperCase());
        }
    }
}
