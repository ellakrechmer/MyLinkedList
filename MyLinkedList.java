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
   if (size()==0){
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
 public boolean add(int index, String value) {
   Node n=new Node(value);
   if (size()==0) {
     start=n;
     end=n;
     size++;
     return true;
   }
   else if (index==0) {
     n.setNext(start);
     start.setPrev(n);
     start=n;
     size++;
     return true;
   }
   else if (index==size()) {
     add(value);
     return true;
   }
   else{
     Node curr=start;
     for (int i=0; i<index; i++){
       curr=curr.getNext();
     }
     Node next=curr.getNext();
     Node prev=curr.getPrev();
     n.setPrev(next.getPrev());
     n.setNext(prev.getNext());
     prev.setNext(n);
     next.setPrev(n);
     size++;
     return true;
   }
 }
 public String get(int index){
   Node curr=start;
   for (int i=0; i<index; i++){
     curr=curr.getNext();
   }
   return curr.getData();
 }
 public String set(int index, String value){
   Node curr=start;
   for (int i=0; i<index; i++){
     curr=curr.getNext();
   }
   String old=curr.getData();
   curr.setData(value);
   return old;
 }
 public String toString() {
   String output="";
   Node curr=start;
   for (int i=0; i<size()-1; i++){
     output+=curr.getData()+", ";
     curr=curr.getNext();
   }
   output+=curr;
   return output;
 }
}
