import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set = new HashSet<>();
    for(int i =0;i< nums1.length;i++){
        set.add(nums1[i]);
    }
     HashSet<Integer> map = new HashSet<>();
     for(int i =0;i< nums2.length;i++){
        if (set.contains(nums2[i])) map.add(nums2[i]);
    }
      ArrayList<Integer> arr= new ArrayList<>();
    for(int ele: map){
      arr.add(ele);
    }
     int[] num = new int [map.size()];
    for(int i =0;i<num.length;i++){
        num[i]=arr.get(i);
    }
    return num;
    }
}