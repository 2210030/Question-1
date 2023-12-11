package midterm;

public class Queue {
    static private int front, rear, capacity;
    static private int queue[];
 
    Queue(int c)
    {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }
 
    // function to insert an element
    // at the rear of the queue
    static void queueEnqueue(int data)
    {
        // check queue is full or not
        if (capacity == rear) {
            System.out.println("my Queue is full");
            return;
        }
 
        // insert element at the rear
        else {
            queue[rear] = data;
            rear++;
        }
        return;
    }
 
    // function to delete an element
    // from the front of the queue
    static void queueDequeue()
    {
        // if queue is empty
        if (front == rear) {
            System.out.println("nQueue is empty");
            return;
        }
 
        // shift all the elements from index 2 till rear
        // to the right by one
        else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
 
            // store 0 at rear indicating there's no element
            if (rear < capacity)
                queue[rear] = 0;
 
            // decrement rear
            rear--;
        }
        return;
    }
 
    // print queue elements
    static void queueDisplay()
    {
        int i;
        if (front == rear) {
            System.out.println("nQueue is Empty");
            return;
        }
 
        // traverse front to rear and print elements
        for (i = front; i < rear; i++) {
            System.out.printf(" %d <-- ", queue[i]);
        }
        return;
    }

    // print front of queue
    static void queueFront()
    {
        if (front == rear) {
            System.out.println("nQueue is Empty");
            return;
        }
        System.out.println("nFront Element is: %d",
                          queue[front]);
        return;
    }
} 

     //isEmpty method
static boolean isEmpty() {
    return front == rear;
}


//clear method
static void clear() {
    front = rear = 0;
    queu = new int[capacity];
}


 
