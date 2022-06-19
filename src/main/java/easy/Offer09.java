package easy;

import java.util.Stack;

public class Offer09 {
    Stack<Integer> st1;
    Stack<Integer> st2;

    public Offer09() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    public void appendTail(int value) {
        st1.add(value);
    }

    public int deleteHead() {
        while(!st1.empty()){
            st2.add(st1.pop());
        }
        int res = -1;
        if(st2.empty())res=st2.pop();
        while(!st2.empty())st1.add(st2.pop());
        return  res;
    }
}
