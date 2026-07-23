class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        if (n == 0) return result;
        
        // The rightmost element is always a leader
        int maxFromRight = arr[n - 1];
        result.add(maxFromRight);
        
        // Traverse the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                result.add(maxFromRight);
            }
        }
        
        // Reverse the list to restore original order
        Collections.reverse(result);
        return result;
    }
}

// class Solution {
//     static ArrayList<Integer> leaders(int arr[]) {
//         // code here
//       ArrayList<Integer>a=new ArrayList<>();
//       for(int i=0;i<arr.length;i++){
//           int c=0;
//           for(int j=i+1;j<arr.length;j++){
//               if(arr[i]<arr[j]) c++;
//           }
//           if(c==0){
//               a.add(arr[i]);
//           }
//       }
       
//       return a;
       
//     }
// }
