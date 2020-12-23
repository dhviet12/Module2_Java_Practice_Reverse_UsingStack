import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        int myArray[] = {1,2,3,4};
        for (int j : myArray) {
            myStack.push(j);
        }
        System.out.println(myStack);
        for (int i = 0; i < myArray.length; i++) {
           myArray[i]= myStack.pop();
        }
        for (int j : myArray) {
            myStack.push(j);
        }
        System.out.println(myStack);
    }
}
