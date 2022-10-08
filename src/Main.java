public class Main {

    public static void main(String[] args) {
        double[] nums = {-15.3, 5.2, 4.5, -4.5, 4.3, -4.3, 4.5, 5.4, -5.3, 4.3, -4.4, 1.2, -2.1, 4.3, 12.1};
        int positive = 0;
        double a = 0;
        for (double dub : nums) {
            if (dub > 0) {
                positive++;
                a += dub;
            }
        }
        System.out.println(a / positive);

        double f=0;
        for (int i=0; i< nums.length;i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[i]>nums[j]){
                    f= nums[i];
                    nums[i]=nums[j];
                    nums[j]=f;

                }
            }
            System.out.println(nums[i]);
        }



            }
        }





