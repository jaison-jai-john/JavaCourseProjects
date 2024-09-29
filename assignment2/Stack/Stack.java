package JavaCourseProjects.assignment2.Stack;

public class Stack {
  private int[] stack;
  private int top;
  private int size;

  public Stack(int size) {
    this.size = size;
    stack = new int[size];
    top = -1;
  }

  public void push(int element) {
    if (top == size - 1) {
      System.out.println("Stack is full");
    } else {
      stack[++top] = element;
    }
  }

  public int pop() {
    if (top == -1) {
      System.out.println("Stack is empty");
      return -1;
    } else {
      return stack[top--];
    }
  }

  public void display() {
    if (top == -1) {
      System.out.println("Stack is empty");
    } else {
      System.out.print("Stack: ");
      for (int i = 0; i <= top; i++) {
        System.out.print(stack[i] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Stack stack = new Stack(5);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.display();
    stack.push(6);
    stack.pop();
    stack.display();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.display();
  }
}
