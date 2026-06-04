public class trappingRainWater {
    
public static void main(String[] args) {
    int height[] = {4,2,0,6,3,2,5};
    System.out.println(trapRainWater(height));
}
public  static int trapRainWater(int height[]){
    //left Auxiliary array
    int LA[] = new int[height.length];
    LA[0]= height[0];
    for(int i = 1 ; i<height.length;i++){
        LA[i]=Math.max(height[i], LA[i-1]);
    }
    /// Right Auxiliary Array
    int RA [] = new int[height.length];
    RA[RA.length-1] = height[height.length-1];
    for (int i = RA.length-2; i >=0 ; i--) {
        RA[i] =  Math.max(height[i], RA[i+1]);   
    }
    //Calulate Trapped Rain water
    int trappedRainWater = 0;
    for (int i = 0; i < height.length; i++) {
        int waterLevel = Math.min(LA[i], RA[i]);
        trappedRainWater+= waterLevel-height[i];
        
    }
    return trappedRainWater;
}
}
