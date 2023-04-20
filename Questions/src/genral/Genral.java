package genral;

public class Genral {
	public int subarraysDivByK(int[] nums, int k) {
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            int sum = nums[i];
            System.out.println(sum / 5);
            for(int j = i + 1; j < nums.length; j++){
                if(sum % k == 0)count++;
                sum += nums[j];
            }
            if(sum % k == 0)count++;
        }

        return count;
    }
}

