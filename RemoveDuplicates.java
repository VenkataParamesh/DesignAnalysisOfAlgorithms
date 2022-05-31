package SingleLinkedList;

public class RemoveDuplicates 
{
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;	
		}
	}
	static void RemoveDuplicatesInLinkedList(Node node)
	{
		Node temp=node;
		while(temp.next!=null)
		{
			if(temp.data==temp.next.data)
			{
				temp.next=temp.next.next;
			}
			else
			{
				temp=temp.next;
			}
		}
		
	}
	static void display(Node node)
	{
	Node temp=node;
	 if(temp==null)
	 {
		 System.out.println("Linked list is empty :");
	 }
	 else
	 {
		while(temp.next!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println(temp.data+"->End");
	 }
	}
	static Node head=null;
	public static void main(String args[])
	{
		head=new Node(1);
		head.next=new Node(1);
		head.next.next=new Node(1);
		head.next.next.next=new Node(2);
		head.next.next.next.next=new Node(4);
		head.next.next.next.next.next=new Node(4);
		display(head);
		RemoveDuplicatesInLinkedList(head);
		display(head);
		
	}

}
