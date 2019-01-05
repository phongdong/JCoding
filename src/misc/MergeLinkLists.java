package misc;

class NodeLL {
	int data;
	NodeLL next;
	NodeLL(){
	}
	public NodeLL(int data, NodeLL next) {
		this();
		this.data = data;
		this.next = next;
	}
	public int getData() {
		return this.data;
	}
	public NodeLL getNext() {
		return this.next;
	}
	public void setData(int data) {
		this.data = data;
	}
	public void setNext(NodeLL next) {
		this.next = next;
	}
}
public class MergeLinkLists {
	public NodeLL mergeLinkLists(NodeLL list1, NodeLL list2) {
		if (list1 == null) return list2;
		if (list2 == null) return list1;	
		if (list1.data <= list2.data) {
			list1.next = mergeLinkLists(list1.next, list2);
			return list1;
		} else {
			list2.next = mergeLinkLists(list2.next, list1);
			return list2;
		}
	}
}
