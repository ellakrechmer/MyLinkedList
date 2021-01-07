public class MyTester{
  public static void main(String [] args){
    MyLinkedList l=new MyLinkedList();
    l.add("a"); l.add("b"); l.add("c"); l.add(3, "d"); l.add (3, "e"); l.add (2, "f");
    l.add(0, "g"); l.add(0, "h"); l.add("i");
    System.out.println(l);
  }
}
