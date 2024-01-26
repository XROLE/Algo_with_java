package Stack;

public class Stack {
    int[] arr;
    int topOfStack;

    public Stack(int size){
        this.arr = new int[size];
        this.topOfStack = -1;

        System.out.println("The stack is created with size of : " + size);
    }

    public boolean isEmpty(){
        if(topOfStack == -1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(topOfStack == arr.length - 1){
            return true;
        }
        return false;
    }

    public void push(int value){
        if(isFull()){
            System.out.println("This stack is full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("The value is successfuly inserted");
        }
    }
}
