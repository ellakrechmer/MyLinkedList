public class Node{
 private String data;
 private Node next,prev;
 public Node(String value){
   data=value;
 }
 public String getData(){
   return data;
 }
 public void setData(String val){
   data=val;
 }
 public Node getNext(){
   return next;
 }
 public void setNext(Node a){
   next=a;
 }
 public Node getPrev(){
   return prev;
 }
 public void setPrev(Node a){
   prev=a;
 }
}
