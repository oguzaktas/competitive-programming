Regex_Pattern = r"^\d\w\w\w\w.$"	# Do not delete 'r'.

import re

print(str(bool(re.search(Regex_Pattern, input()))).lower())

# Sample input: 0qwer. (Output: true)
# ^\d\w{4}\.$