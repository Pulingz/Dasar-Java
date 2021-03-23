public class scoop {
    public static void main(String[] args) {
        Halo("Pikachu"); // Scope: cakupan variable
        Halo(" ");
    }
        static void Halo(String nama){
            String hai = "Halo " + nama;
            if(!nama.isBlank()){
                String hay = "Hi " + nama;
                System.out.println(hay);
            }
            System.out.println(hai);
            // System.out.println(hay); diluar scope
        }

}
