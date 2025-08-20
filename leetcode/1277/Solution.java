class Solution {
    public int countSquares(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int size=rows>cols?cols:rows;
        int[] sq=new int[size];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==1){
                    sq[0]++;
                    for(int k=1;k<rows-i && k<cols-j;k++){
                        int h=1;
                        for(int l=0;l<=k;l++){
                            int z=0;
                            for(int m=0;m<=k;m++){
                                if(matrix[i+l][j+m]==0){
                                    z=1;
                                    break;
                                }
                            }
                            if(z==1){
                                h=0;
                                break;
                            }
                        }
                        if(h==1)
                        sq[k]++;
                    }
                }
            }
        }
        int sum=0;
        for(int i=0;i<size;i++)
            sum+=sq[i];
        return sum;
    }
}