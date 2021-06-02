class Main {
  public static void main(String[] args) {
    int[] array = {1, 5, 3, 7, 9};
    
    System.out.println(trap(array));

  }

  public static int trap(int[] height) {
        if (height.length < 3) {
            return 0;
        }  
        int total = 0;
        
        for (int i = 0; i < height.length; ++i) {
            int maxLeft = 0;
            int maxRight = 0;
            int leftP = i;
            int rightP = i;
            
            while (leftP >= 0) {
                maxLeft = Math.max(height[leftP], maxLeft);
                leftP--;
            }
            
            while (rightP < height.length) {
                maxRight = Math.max(height[rightP], maxRight);
                rightP++;
            }
            
            int currentWater = Math.min(maxLeft, maxRight) - height[i];
            
            if (currentWater >= 0) {
                total += currentWater;
            }

        }
        
        return total;
    }
}