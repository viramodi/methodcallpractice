package Methodcall;

public class cardetails {
    static void cardetails(String carname){
        System.out.println(carname);
    }
    static void cardetails(int carnumber){
        System.out.println(carnumber);
    }

    public static void main(String[] args) {
        cardetails("Suzuki");
        cardetails(2525);
    }
}
