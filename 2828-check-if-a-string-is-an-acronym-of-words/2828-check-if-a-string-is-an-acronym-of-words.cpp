class Solution {
public:
    bool isAcronym(vector<string>& words, string s) {
        int n=words.size();
        string ans;
        int count=0;
        for(int i=0;i<n;i++){
            ans+=words[i][0];
        } 
        if(ans==s)
            return true;
        else 
            return false;
        
    }
};