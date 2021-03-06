// I was pretty proud when l decided to use DP on second try
// Then l stuck for 30 mins just because l placed DP[0]=true after filling the array
// the last return statement could be 'return false' but either way

//I just realized you could start from index 1
//and (DP[d]=true) if (DP[i]>d-i);
//Whatever. If it works, it works.

import java.util.Arrays; 
class Solution {
    public boolean canJump(int[] nums) {
        
        boolean DP[]=new boolean[nums.length];
        
        int size=nums.length-1;
        Arrays.fill(DP,false);
        DP[0]=true;
        
        if(size==0){return true;}
        
        int i=0;
        while(DP[i]==true && i<size){
            
            for(int d=0;d<=nums[i];d++){
                if(i+d==size)return true;
                DP[i+d]=true;
                
            }
        i++;
        }
        return DP[size];
    }
}
        
    
