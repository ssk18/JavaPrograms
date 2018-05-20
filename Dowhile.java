public class Dowhile {

    public static void main(String[] args){
        System.out.println(evenNumber(1));

    }

    public static boolean evenNumber(int number){
        int count =+ number;
        double remainder = number%2;
        while(number >= 1 && remainder == 0){
            System.out.println("Number is even " + number);
            count += number;
            return true;
        }
        return false;

    }
}
