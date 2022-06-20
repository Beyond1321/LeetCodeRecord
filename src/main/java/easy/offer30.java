package easy;

import java.util.Objects;
import java.util.Stack;

class offer30 {

    Stack<Integer> st1;
    Stack<Integer> st2;
    int min;
    /** initialize your data structure here. */
    public offer30() {
        st1 = new Stack<>();
        st2 = new Stack<>();
        min=(int)Math.pow(2,31);
    }

    public void push(int x) {
        if(x<=min){
            min=x;
            st2.push(x);
        }
        st1.push(x);
    }

    public void pop() {
        if(Objects.equals(st1.peek(), st2.peek()))st2.pop();
        st1.pop();
    }

    public int top() {
        return st1.peek();
    }

    public int min() {
        return st2.peek();
    }
}
