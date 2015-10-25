
class QueueApplication
{

    public static void main(String arg[])
    {
        DataInputStream get = new DataInputStream(System.in);
        int choice;
        Queue queue = new Queue();
        queue.getdata();
        System.out.println("Queue\n\n");
        try
        {
            do
            {
                System.out.println(" 1.Enqueue\n 2.Dequeue\n 3.Display\n 4.Exit\n");
                System.out.println("Enter the Choice : ");
                choice = Integer.parseInt(get.readLine());
                switch (choice)
                {
                    case 1:
                        queue.enqueue();
                        break;
                    case 2:
                        queue.dequeue();
                        break;
                    case 3:
                        queue.display();
                        break;
                }
            }
            while (choice != 4);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
