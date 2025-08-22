/*take the smallest element and check 
whether the difference of that element with 
all other elements is divisible by x. 
if yes, then operations are possible else -1.*/

class Solution {
    public int minOperations(int[][] grid, int x) {
        int size=grid.length * grid[0].length;
        int []arr=new int[size];
        int k=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                arr[k++]=grid[i][j];
            }
        }

        /*for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }*/

        java.util.Arrays.sort(arr);

        for(int i=1;i<size;i++){
            if((arr[i]-arr[0])%x !=0)
                return -1;
        }

        /*if(size%2==0){
            double med=(arr[size/2]+arr[size/2 -1])/2.0;
            k=(arr[size/2]-med)>(med-arr[size/2 -1])?arr[size/2 -1]:arr[size/2];
        }
        else
            k=arr[size/2];

        int sum=0;
        for(int i=0;i<size;i++){
            if(arr[i]<k){
                sum+=(k-arr[i])/x;
            }
            else{
                sum+=(arr[i]-k)/x;
            }
        }
        return sum;*/

        int median;
        if (size % 2 == 0) {
            int mid1 = arr[size / 2 - 1];
            int mid2 = arr[size / 2];
            median = (Math.abs(arr[0] - mid1) <= Math.abs(arr[0] - mid2)) ? mid1 : mid2;
        } else {
            median = arr[size / 2];
        }
        int sum = 0;
        for (int val : arr) {
            sum += Math.abs(val - median) / x;
        }
        return sum;
    }
}