package me.maktoba.LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        //we have our string and our stack

        //for every char in the string
        //  if c is an opening paren character
        //      add corresponding closing paren to stack
        //  else c is not an opening paren character, check if it matches whats to be popped off the stack(or empty)
        //      return false

        //at end return if the stack is empty, which means each bracket was properly closed(and paren chars were found)

        //  s.charAt(i)           stack
        //        (                 )
        //        [                 ]

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.addFirst(')');
            } else if (c == '{') {
                stack.addFirst('}');
            } else if (c == '[') {
                stack.addFirst(']');
            } else if (stack.isEmpty() || stack.removeFirst() != c) {
                return false;
            }
        }

        return stack.isEmpty();
    }

}
