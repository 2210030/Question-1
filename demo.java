package midterm;

public class demo {
 
    // Driver code
    public static void main(String[] args)
    {
        // Create a queue of capacity 4
        Queue q = new Queue(4);
 
        // print Queue elements
        q.queueDisplay();
 
        // inserting elements in the queue
        q.queueEnqueue(20);
        q.queueEnqueue(30);
        q.queueEnqueue(40);
        q.queueEnqueue(50);
 
        // print Queue elements
        q.queueDisplay();
 
        // insert element in the queue
        q.queueEnqueue(60);
 
        // print Queue elements
        q.queueDisplay();
 
        q.queueDequeue();
        q.queueDequeue();
        System.out.println("nafter two node deletion");
 
        // print Queue elements
        q.queueDisplay();
 
        // print front of the queue
        q.queueFront();
        q.isEmpty();
        q.clear();
    }
}

    
