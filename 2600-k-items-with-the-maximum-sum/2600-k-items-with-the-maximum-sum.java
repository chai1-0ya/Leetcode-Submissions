class Solution {
    public int kItemsWithMaximumSum(int no, int nz, int nno, int k) {
        if(k<=no)
            return k;
        if(k<=nz+no)
            return no;
        return no-(k-(no+nz));
    }
}