class Solution {
    public String smallestNumber(int s, int d) {
        // code here
          String ans="";
        for (int i=1;i<=d;i++) { 
            for (int j=0;j<10;j++) { 
                if (i==1 && j==0) continue;
                if ((s-j)<=(d-i)*9) { 
                    ans+=j;
                    s-=j;
                    break;
                }
            }
        }
        
        if (s!=0) return "-1";
        
        return ans;
    }
}
