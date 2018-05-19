public class SumOddRange {


        public static void main(String[] args) {
            System.out.println(isOdd(7));
            System.out.println(sumOdd(7, 69));
        }

        public static boolean isOdd(int number){
            if(number<=0)
            {
                return false;

            }
            if(number%2!=0)
            {
                return true;

            }
            return false;
        }

        public static int sumOdd(int start,int end){
            int sum=0;

            if(start>end || start<=0 || end<=0 )return -1;
            {
                for(int i=start;i<=end;i++)
                {
                    if(isOdd(i) )
                    {
                        sum+=i;
                    }
                }
                return sum;

            }

        }

}
