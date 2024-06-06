class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] paths = path.split("/");
        for (String s : paths) {
            if (s.equals("") || s.equals(".")) {
                continue;
            }
            if (s.equals("..")) {
                if (!stack.empty()) {
                    stack.pop();
                }
            } else {
                stack.push(s);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stack.size(); i++) {
            sb.append("/");
            sb.append(stack.get(i));
        }
        return sb.length() == 0 ? "/" : sb.toString();
        /*
        List<String> dirs = new ArrayList<>();
        for (String dir : path.split("/")) {
            if (dir.isEmpty() || dir.equals(".")) {
                continue;
            }
            if (dir.equals("..")) {
                if (!dirs.isEmpty()) {
                    dirs.remove(dirs.size() - 1);
                }
            } else {
                dirs.add(dir);
            }
        }
        return "/" + String.join("/", dirs);
        */
    }
}

// https://leetcode.com/explore/featured/card/leetcodes-interview-crash-course-data-structures-and-algorithms/706/stacks-and-queues/4610/