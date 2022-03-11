import javax.naming.ServiceUnavailableException;

public class stack{

    private int[] arr;
    private int sizeofstack=0;
    private int sizeofarr=0;
    private int tos=-1;

    //constructor
    public stack(){
     this.intialize(5);
    }

    public stack(int size){
        this.intialize(size);
    }

    //exceptions
    private void stackisfull() throws Exception{
        if(this.sizeofarr==this.sizeofstack){
            throw new Exception("StackOverflow");
        }
    }

    private void stackisempty() throws Exception{
        if(this.tos==-1){
            throw new Exception("StackUnderflow");
        }
    }

    public void intialize(int size){
        arr=new int[size];
        this.sizeofarr=size;
        this.sizeofstack=0;
        this.tos=-1;
    }

    public int size(){
        return this.sizeofstack;
    }

    public boolean IsEmpty(){
        return this.sizeofstack==0;
    }

    public int top() throws Exception{
        this.stackisempty();
        return this.tos;
    }

    public int pop() throws Exception{
        this.stackisempty();
        int val=this.top();
        this.arr[this.tos]=0;
        this.tos--;
        return val;
    }

    public void push(int val) throws Exception{
        stackisfull();
        this.tos++;
        this.arr[this.tos]=val;
        this.sizeofstack++;
    }

}