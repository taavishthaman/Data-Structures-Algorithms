import Stack.Stack;

class StackClient{

    public static void main(String[] args) throws Exception{

        Stack stack = new Stack();

        for(int i=1; i<=5; i++){
            stack.push(i*10);
        }
        stack.push("Hello");
        stack.push("World");

        stack.printStack();
        System.out.println(stack.pop());

    }
}