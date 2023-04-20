package genral;

public class Colors {
	public int maxDistance(int[] colors) {
        int max = 0;

        for(int i = 0; i < colors.length/2; i++){
            for(int j = colors.length - 1; j >= colors.length/2; j--){
                if(colors[i] != colors[j]){
                    max = Math.max(max, j - i);
                    System.out.println(max);
                    break;
                }
            }
        }
        return max;
    }
}

