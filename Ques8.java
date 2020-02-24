//Q8 Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should return minimum element from the SpecialStack. (Expected complexity ­ O(1))

import java.util.Stack;
public class Ques8 {

        Stack<Integer> stack;
        Integer min;

        Ques8() {
            stack = new Stack<Integer>();
        }

        void getMin() {
            if (stack.isEmpty())
                System.out.println("Stack is empty");

            else
                System.out.println("Minimum Element in the " + " stack is: " + min);
        }

        void peek() {
            if (stack.isEmpty()) {
                System.out.println("Stack is empty ");
                return;
            }

            Integer t = stack.peek();

            System.out.print("Top Most Element is: ");

            if (t < min)
                System.out.println(min);
            else
                System.out.println(t);
        }

        void pop() {
            if (stack.isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }

            System.out.print("Top Most Element Removed: ");
            Integer t = stack.pop();
            if (t < min) {
                System.out.println(min);
                min = 2 * min - t;
            } else
                System.out.println(t);
        }

        void push(Integer x) {
            if (stack.isEmpty()) {
                min = x;
                stack.push(x);
                System.out.println("Number Inserted: " + x);
                return;
            }

            if (x < min) {
                stack.push(2 * x - min);
                min = x;
            } else
                stack.push(x);

            System.out.println("Number Inserted: " + x);
        }


        public static void main(String[] args) {
            Ques8 s = new Ques8();
            s.push(3);
            s.push(5);
            s.getMin();
            s.push(2);
            s.push(1);
            s.getMin();
            s.pop();
            s.getMin();
            s.pop();
            s.peek();
        }
}
