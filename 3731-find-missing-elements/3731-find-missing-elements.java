class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        ArrayList<Integer> ee= new ArrayList<>();
        HashSet<Integer> he= new HashSet<>();
        for(int ele:arr){
            he.add(ele);
        }
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        int min=arr[0];
        for(int i=min;i<=max;i++){
            if(he.contains(i)){
             continue;
            }
            else{
                ee.add(i);
            }
        }
        return ee;

    }
}