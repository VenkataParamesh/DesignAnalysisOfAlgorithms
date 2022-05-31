package SingleLinkedList;
public class CycleInLinkedList {
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
	public static void findCycleInLinkedList(Node node)
	{
		boolean link=false;
		Node fast=node;
		Node slow=node;
		while(slow.next!=null&&fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				link=true;
				break;
			}
		}
		if(link)
		{
			System.out.println("Linked List exists :");
			int count=0;
			do {
				slow=slow.next;
				count++;
			}while(slow!=fast);
			System.out.println("Length of the loop is :"+count);
			fast=node;
			slow=node;
			int x=0;
			while(x<count)
			{
				fast=fast.next;
				x++;
			}
			while(slow!=fast)
			{
				slow=slow.next;
				fast=fast.next;
			}
			System.out.println("Starting point is :"+slow.data);
			
		}
		else
		{
			System.out.println("LinkedList didn't exists :");
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
		head.next.next.next.next.next.next=head.next.next.next;
		findCycleInLinkedList(head);
	
		
	}

}
