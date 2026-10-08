class Solution {
    public String reverseByType(String s) {
        char[] arr = s.toCharArray();
        //Character.isLetter(ch) 
        int left=0,right=arr.length-1;
        while(left<right){
          char lh = arr[left];
          char rh= arr[right];
          if( Character.isLetter(lh) &&  Character.isLetter(rh)){
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
            continue;
          }
          if(Character.isLetter(lh) &&  !Character.isLetter(rh)) right--;
          else left++;
        }
         left=0;
         right=arr.length-1;
        while(left<right){
          char lh = arr[left];
          char rh= arr[right];
          if( !Character.isLetter(lh) &&  !Character.isLetter(rh)){
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
            continue;
          }
          if(Character.isLetter(lh) &&  !Character.isLetter(rh)) left++;
          else right--;
        }
       return  new String(arr);
    }

}