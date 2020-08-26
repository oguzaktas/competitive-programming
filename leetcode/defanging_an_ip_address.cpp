class Solution {
public:
    string defangIPaddr(string address) {
        for (int i = 0; i < address.size(); i++) {
            if (address[i] == '.') {
                address.replace(i, 1, std::string("[.]"));
                i += 2;
            }
        }
        // address.replace(address.find("."), 1, "[.]");
        return address;
    }
};

// https://leetcode.com/problems/defanging-an-ip-address/
/* C++ 1-line regex;
string defangIPaddr(string address) {
    return regex_replace(address, regex("[.]"), "[.]");
}
*/