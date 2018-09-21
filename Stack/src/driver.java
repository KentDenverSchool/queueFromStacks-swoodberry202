/**
 * Name: sloanwoodberry
 * Lab Name: driver
 * Lab Purpose
 * Date: 9/19/18
 * Collaborators: None
 */
public class driver {
    public static void main(String[] args) {
        queueWithStacks q = new queueWithStacks();
        String x ="ethrytgrfhn";
        String y= "t4tergtgt";
        String z="tgffffffff";

        q.enqueue(x);
        q.enqueue(y);
        q.enqueue(z);
        System.out.println(q.isEmpty());//false
        System.out.println(q.size());//3
        System.out.println(q.dequeue());
        System.out.println(q.peak()); //y

    }
}
