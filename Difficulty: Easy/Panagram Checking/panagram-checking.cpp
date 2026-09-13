class Solution {
public:
    bool checkPangram(string& s) {

        int frq[26] = {0};

        for(int i = 0; i < s.length(); i++) {
            char ch = tolower(s[i]);

            if(ch >= 'a' && ch <= 'z') {
                frq[ch - 'a']++;
            }
        }

        for(int i = 0; i < 26; i++) {
            if(frq[i] == 0) {
                return false;
            }
        }

        return true;
    }
};