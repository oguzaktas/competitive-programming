# Read from the file file.txt and output all valid phone numbers to stdout.
egrep "^(\([0-9]{3}\) |[0-9]{3}\-)[0-9]{3}\-[0-9]{4}$" file.txt

/* Different solutions with grep, sed and awk
using grep -> grep -P '^(\d{3}-|\(\d{3}\) )\d{3}-\d{4}$' file.txt
using sed -> sed -n -r '/^([0-9]{3}-|\([0-9]{3}\) )[0-9]{3}-[0-9]{4}$/p' file.txt
using awk -> awk '/^([0-9]{3}-|\([0-9]{3}\) )[0-9]{3}-[0-9]{4}$/' file.txt
using awk and ::digit:: in-place of [0-9] -> awk '/^([[:digit:]]{3}-|\([[:digit:]]{3}\) )[[:digit:]]{3}-[[:digit:]]{4}$/' file.txt
*/
// https://leetcode.com/problems/valid-phone-numbers/discuss/55478/Grep-e-solution-with-detailed-explanation-good-for-those-new-to-regex