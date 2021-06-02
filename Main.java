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
        int leftP = 0;
        int rightP = height.length - 1;
        int maxLeft = 0;
        int maxRight = 0;
        
        while (leftP < rightP) {
            if (height[leftP] <= height[rightP]) {
                if (height[leftP] >= maxLeft) {
                    maxLeft = height[leftP];
                } else {
                    total += maxLeft - height[leftP]; 
                }
                leftP++;
            } else {
                if (height[rightP] >= maxRight) {
                    maxRight = height[rightP];
                } else {
                    total += maxRight - height[rightP];
                }
                rightP--;
            }
        }
        
        return total;
    }
}