public class BarkingDog {

    public static void main(String[] args) {
        bark(true, 50);

    }

    public static boolean bark(boolean barking, int hourOfDay) {
        boolean test = false;
        if (hourOfDay >= 0 && hourOfDay <= 23) {
            if ((barking == true && hourOfDay < 8) || (barking == true && hourOfDay > 22)) {
                test = true;
            }
        }
        return test;
    }


}
