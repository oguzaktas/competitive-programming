Regex_Pattern = r'(ok)\1\1'	# Do not delete 'r'.

import re

print(str(bool(re.search(Regex_Pattern, input()))).lower())