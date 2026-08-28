class RandomizedSet {
    HashMap<Integer,Integer> hm;
    List<Integer> list;

    public RandomizedSet() {
        hm = new HashMap<>();
        list = new ArrayList<>();  
    }
    
    public boolean insert(int val) {
        if(hm.containsKey(val)) return false;
        list.add(val);
        hm.put(val,list.size()-1);
        return true;
        
    }
    
    public boolean remove(int val) {
        if(!hm.containsKey(val)) return false;
        int ind=hm.get(val);
        Collections.swap(list,ind,list.size()-1);
        int sw=list.get(ind);
        hm.put(sw,ind);
        list.remove(list.size()-1);
        hm.remove(val);
        return true;
    }
    
    public int getRandom() {
        Random rn = new Random();
        int n= rn.nextInt(list.size());
        return list.get(n);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */