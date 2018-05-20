public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(sumDigits(66666));
    }

    public static int sumDigits(int number) {

        if(number < 0){
            return -1;
        }

        int sum = 0;
        while(number > 0){
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;

    }
}

