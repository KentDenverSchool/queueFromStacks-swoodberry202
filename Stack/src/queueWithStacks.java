/**
 * Name: sloanwoodberry
 * Lab Name: queueWithStacks
 * Lab Purpose
 * Date: 9/19/18
 * Collaborators: None
 */
public class queueWithStacks {
    public Stack in;
    public Stack out;

    public queueWithStacks(){
        in=new Stack();
        out = new Stack();
    }

    public void enqueue(Object o){
        in.push(o);
    }

    public Object dequeue(){
        if(out.isEmpty()){
            while (!in.isEmpty()){
                out.push(in.pop());
            }
        }
    return out.pop();
    }

    public boolean isEmpty(){return in.isEmpty();}

    public int size(){return in.size()+out.size();}

    public Object peak(){ return out.peak();}
}
