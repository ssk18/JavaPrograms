public class SumOfNumbers {

    public static void main(String[] args){

        int count = 0;
        int sum = 0;

        for(int i = 1; i <= 1000; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                count++;
                sum += i;
                System.out.println(i + " is divisible by 3 and 5");

                if(count == 5){
                    System.out.println("exiting for loop");
                    break;
                }
            }
        }
        System.out.println("sum is " + sum);
    }

}
