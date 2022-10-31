public class Activity2 {
    public static void  main(String[] args) {
        int[] numbers= {10, 77, 10, 54, -11, 10};
        int actualsum=0;
        int expected_sum= 30;

        for(int i=0;i<=5;i++){
            if(numbers[i]==10){
                actualsum=actualsum+numbers[i];
            }
            if(expected_sum==actualsum) {
                  System.out.println("the actual sum of the array when the values are 10 is : " + actualsum);
                  System.out.println("actual sum is equal to the expected_sum");
                  break;
            }


        }
    }
}
