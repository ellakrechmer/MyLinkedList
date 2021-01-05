public class MyLinkedList{
 private int size;
 private Node start,end;
 public MyLinkedList(){
   size=0;
 }
 public int size() {
   return size;
 }
 public boolean add(String value){
   Node n=new Node(value);
   if (start==null){
     start=n;
     end=n;
     size++;
   }
   else{
     n.setPrev(end);
     end.setNext(n);
     size++; 
   }
   return true;
 }
 //public boolean add(int index, String value);
 //public String get(int index);
 //public String set(int index, String value);
 //public String toString();
 //Any helper method that returns a Node object MUST BE PRIVATE!
}
