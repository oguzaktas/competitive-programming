class MyHashSet {
    // HashSet using array
    private boolean[] arr;
    
    public MyHashSet() {
        this.arr = new boolean[1000009];
    }
    
    public void add(int key) {
        this.arr[key] = true;
    }
    
    public void remove(int key) {
        this.arr[key] = false;
    }
    
    public boolean contains(int key) {
        return this.arr[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */

// https://leetcode.com/explore/learn/card/hash-table/182/practical-applications/1139/
/* HashSet using ArrayList
class MyHashSet {
    List<Integer> hashset;
    public MyHashSet() {
        this.hashset = new ArrayList<Integer>();
    }
    
    public void add(int key) {
        if (!hashset.contains(key)) {
            hashset.add(key);
        }
    }
    
    public void remove(int key) {
        hashset.remove(new Integer(key));
    }
    
    public boolean contains(int key) {
        return hashset.contains(key);
    }
}
*/