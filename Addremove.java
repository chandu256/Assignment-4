import java.io.*;
import java.util.*;
class Addremove
{
public static void stack_push(Stack<Integer>stack)
{
for(int i=0;i<5;i++)
{
stack.push(i);
}
}
 public static void stack_pop(Stack<Integer>stack)
{
System.out.println("pop operation:");
for(int i=0;i<5;i++)
{
Integer y=(Integer)stack.pop();
System.out.println(y);
}
}
public static void main(String[]args)
{
Stack<Integer>stack=new stack<Integer>();
stack_push(stack);
stack_pop(stack);
stack_push(stack);
}
}