
class Stack{
    int array_size;
    char arr[] ;
    int top=-1;

    Stack(int size){
        array_size=size;
         arr = new char[size];
    }

    public void push(char value) {
        if(isFull()){
           System.out.println("Bhra hai bhaiya tumhara stack"); 
        }
        else{
        arr[++top]=value;
        }
    }

    public int pop(){
        if(isEmpty()){
           System.out.println("Khali stack se kuch bahar ni aa skta bhai ");
            return -1;
         }
         else
        return arr[top--];
    }

    public boolean isFull(){ 
            return top == array_size-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public void peek(){
    System.out.println(arr[array_size-1]);
    }
     
    public void printStack() {
        for (int i = 0; i <= top; i++) {
          System.out.println(arr[i]);
        }
      }
      
      public void printStack2() {
        for (int i = 0; i <= arr.length-1; i++) {
          System.out.println(arr[i]);
        }
      }
}


public class stack{
public static void main(String args[]){
     
    Stack stack=new Stack(100);
//     stack.push(10);
//     stack.push(10);
//     stack.push(10);
//     stack.push(10);
//     stack.push(11);
//     stack.peek();
//     System.out.println();
//     // System.out.println("Hogya");
//    stack.pop();
// //    stack.pop();
// //    stack.pop();
// //    stack.pop();
// //    stack.pop();

// stack.printStack();
// System.out.println();
// stack.printStack2();



String pattern = new String("{{{}}}");
        
boolean flag = false;
for(int i=0; i<pattern.length(); i++) {
     if(pattern.charAt(i) == '{') stack.push(pattern.charAt(i));
     else if(pattern.charAt(i) == '}') {
        if(stack.isEmpty()) {
          flag = true;
          System.out.println("Stack is Empty Man");
          break;
        } else stack.pop();
     }
}

if(stack.isEmpty() && !(flag)) {
  System.out.println("All Brasis has its closing");
} else System.out.println("Error all brasis are not closed correctly");

}
}