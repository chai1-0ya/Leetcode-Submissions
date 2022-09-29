class MyHashSet {

    LinkedList<Integer> ll;
    
    public MyHashSet() {
        ll = new LinkedList<>();
    }
    
    public void add(int key) {
        if(!contains(key))
            ll.add(key);
    }
    
    public void remove(int key) {
        if(contains(key)){
            // MyHashSet obj = new MyHashSet(key);
            Object a = (Integer)key;
            ll.remove(a);
        }
    }
    
    public boolean contains(int key) {
        return ll.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */