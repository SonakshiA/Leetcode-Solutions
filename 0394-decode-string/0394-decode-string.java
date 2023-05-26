class Solution {
    public String decodeString(String s) {
        Stack<String> stringStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        StringBuilder res = new StringBuilder();
        int index = 0;

        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) {
                int num = 0;
                while (Character.isDigit(s.charAt(index))) {
                    num = num * 10 + (s.charAt(index) - '0');
                    index++;
                }
                numStack.push(num);
            } else if (s.charAt(index) == '[') {
                stringStack.push(res.toString());
                res = new StringBuilder("");
                index++;
            } else if (s.charAt(index) == ']') {
                StringBuilder temp = new StringBuilder(stringStack.pop());
                int repeat = numStack.pop();
                for (int i = 0; i < repeat; i++) {
                    temp.append(res);
                }
                res = temp;
                index++;
            } else {
                res.append(s.charAt(index));
                index++;
            }
        }
        return res.toString();
    }
}


/*

"3[a2[c]]"



character    numStack    stringStack         temp     res
   ]                                          ""       "accaccacc"
   ]            3                   ""        "a"       "acc"
   c            2,3                "a",""                "c"                  
   [            2,3                "a",""
   2            2,3                ""
   a            3                    ""
   [            3                   ""
   3            3

  

*/