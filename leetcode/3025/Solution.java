class Solution {
    public int numberOfPairs(int[][] arr) {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int l=0;
                if(i==j)
                    continue;
                //line wala case
                if((arr[i][0]==arr[j][0])&&(arr[i][1]>arr[j][1])){
                    l=1;
                    for(int k=0;k<n;k++){
                        if(k==i || k==j)
                            continue;
                        if(arr[k][0]==arr[i][0] && arr[k][1]>=arr[j][1] && arr[k][1]<=arr[i][1]){
                            l=0;
                            break;
                        }
                    }
                }
                if(((arr[i][1]==arr[j][1])&&(arr[i][0]<arr[j][0]))){
                    l=1;
                    for(int k=0;k<n;k++){
                        if(k==i || k==j)
                            continue;
                        if(arr[k][1]==arr[i][1] && arr[k][0]>=arr[i][0] && arr[k][0]<=arr[j][0]){
                            l=0;
                            break;
                        }
                    }
                }
                //left rectangle case
                else if(arr[j][0]>arr[i][0] && arr[j][1]<arr[i][1]){
                    l=1;
                    for(int k=0;k<n;k++){
                        if(k==i || k==j)
                            continue;
                        if(arr[k][0]<=arr[j][0] && arr[k][0]>=arr[i][0] && arr[k][1]<=arr[i][1] && arr[k][1]>=arr[j][1]){
                            l=0;
                            break;
                        }
                    }
                }
                if(l==1)
                    count++;
            }
        }
        return count;
    }
}