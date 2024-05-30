package ToDoList;


public class ToDoList{

    Node head;


    public void addToDo(Task task) {
        Node newnode = new Node(task);

        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public void markToDoAsCompleted(String title){
        Node temp = head;
        while(temp != null){
            if(temp.task.getTitle().equals(title)){
                temp.task.markCompleted();
                break;
            }
            temp = temp.next;
        }
    }


    public void viewToDoList(){
        Node temp = head;
        while(temp != null){
            System.out.println("Title: " + temp.task.getTitle());
            System.out.println("Description: " + temp.task.getDescription());
            System.out.println("Completed: " + temp.task.isCompleted());
            System.out.println();
            temp = temp.next;
        }


    }
}
