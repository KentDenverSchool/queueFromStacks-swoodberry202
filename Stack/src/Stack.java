
/**
 * Name: sloanwoodberry
 * Lab Name: Stack
 * Lab Purpose
 * Date: 9/10/18
 * Collaborators: None
 */
public class Stack {
    public int size;
    public Node topBoi;
     public Stack(){
         topBoi=null;
         size=0;
     }
     public void push(Object e){
         Node pain =new Node(e);
         Node n=topBoi;
         pain.pointMe(n);
         topBoi=pain;
         size++;
     }
     public Object pop(){
         Node old=topBoi;
         topBoi=old.getPointer(0);
         size--;
         return old.getData();
     }
     public boolean isEmpty(){
         if (size==0){return true;}
         return false;
     }
     public int size(){return size;}

     public Object peak(){
         return topBoi.getData();
     }
}
