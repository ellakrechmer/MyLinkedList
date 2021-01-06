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
 public boolean void(int index, String value) throws IndexOutOfBoundsException{
   Node n=new Node(value);
   if (index>size()) throw new IndexOutOfBoundsException();
   if (size()==0) {
     start=n;
     end=n;
     size++;
   }
   else if (index==0) {
     n.setNext(start);
     start.setPrev(n);
     start=n;
     size++;
   }
   else if (index==size()) {
     add(value);
   }
   else{
     Node curr=start;
     int i=0;
     while (i<index){
       curr=curr.getNext();
       i++;
     }
     Node prev=curr.getPrev();
     n.setPrev(curr.getPrev());
     n.setNext(curr);
     prev.setNext(n);
     curr.setPrev(n);
     size++;
   }
 }
 public String get(int index) throws IndexOutOfBoundsException{
   Node curr=start;
   for (int i=0; i<index; i++){
     curr=curr.getNext();
     if (curr==null) throw new IndexOutOfBoundsException();
   }
   return curr.getData();
 }
 public String set(int index, String value) throws IndexOutOfBoundsException{
   Node curr=start;
   for (int i=0; i<index; i++){
     curr=curr.getNext();
     if (curr==null) throw new IndexOutOfBoundsException();
   }
   String old=curr.getData();
   curr.setData(value);
   return old;
 }
 public String toString() {
   if (size()==0) return "[]";
   String output="[";
   Node curr=start;
   for (int i=0; i<size()-1; i++){
     output+=curr.getData()+", ";
     curr=curr.getNext();
   }
   output+=curr+"]";
   return output;
 }
}
