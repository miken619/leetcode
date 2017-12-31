/*Implement the following operations of a queue using stacks.

push(x) -- Push element x to the back of queue.
pop() -- Removes the element from in front of queue.
peek() -- Get the front element.
empty() -- Return whether the queue is empty.
Notes:
You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).*/

class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int size;
    int peek;

    /** Initialize your data structure here. */
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        size = 0;
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(size == 0) peek = x;
        stack1.push(x);
        ++size;
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int result = 0;
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        
        result = stack2.pop();
        if(!stack2.isEmpty()) peek = stack2.peek();
        else peek = -1;
        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        
        --size;
        
        return result;
        
    }
    
    /** Get the front element. */
    public int peek() {
        return peek;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return size == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */