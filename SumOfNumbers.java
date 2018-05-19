public class SumOfNumbers {

    public static void main(String[] args){
        isOdd(7);
        sumOdd(3, 1000);
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start % 2 != 0) {
            for (int i ==start;
            i<end ;
            i += 2){
                sum += i;
                break;
            }
        }
    }
    return sum;

}
