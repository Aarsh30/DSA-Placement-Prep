Class Queue{
    Node front;
    Node rear;
    int length;
        Queue()
        {
            this.front = null;
            this.rear = null;
            this.length = 0;
        }

  class Node{
            int data;
            Node next;
            Node(this.data)
            {
                this.data = data;
                this.next = null;
            }

            public boolean isEmpty()
            {
                return length == 0;
            }
            
            public void enqueue(int data)
            {
                Node newNode = new Node(data);
                if(isEmpty())
                {front= newNode;
                }
                else
                {
                    rear.next= newNode;
                }
                rear=newNode;
            }
            
            public void dqueue()
            {
                if(isEmpty())
                {
                    System.out.println("Exception");

                }else{
                    front=front.next;
                }
         
            }

            public static void main(String[] args)
            {
                Node Queue = new Node(10);
                Queue.enqueue(10);
                Queue.enqueue(20);
                Queue.enqueue(30);
                System.out.println(isEmpty());

            }
        }
}