/*Implement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.
Notes:
You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).*/

class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    int size;
    int peek;

    /** Initialize your data structure here. */
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
        size = 0;
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        peek = x;
        queue1.add(x);
        ++size;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(size == 0) return -1;
        
        while(queue1.size() != 1) {
            peek = queue1.remove();
            queue2.add(peek);
            
        }
        int val = queue1.remove();
        while(!queue2.isEmpty()) {
            queue1.add(queue2.remove());
        }
        --size;
        return val;
    }
    
    /** Get the top element. */
    public int top() {
        return peek;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return size == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */