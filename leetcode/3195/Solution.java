class Solution {
    public int minimumArea(int[][] grid) {
        int tl,tr,bl,br,k=0;
        tl=tr=bl=br=0;
        int rows=grid.length;
        int cols=grid[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    if(k==0){
                        tl=bl=i;
                        tr=br=j;
                        k=1;
                        continue;
                    }
                    if(i>bl)
                    bl=i;
                    if(i<tl)
                    tl=i;
                    if(j>br)
                    br=j;
                    if(j<tr)
                    tr=j;                    
                }
            }
        }
        return (bl-tl+1)*(br-tr+1);
    }
}