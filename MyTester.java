public class MyTester{
  public static void main(String [] args){
    MyLinkedList l=new MyLinkedList();
    l.add("a"); l.add("b"); l.add("c"); l.add(3, "d"); l.add (3, "e"); l.add (2, "f");
    l.add(0, "g"); l.add(0, "h"); l.add("i");
    System.out.println(l);
    //System.out.println(l.toStringReversed());
    // l.remove(0);
    // System.out.println(l);
    // l.remove(7);
    // System.out.println(l);
    // l.remove(3);
    // System.out.println(l);

    MyLinkedList a = new MyLinkedList();
    MyLinkedList b = new MyLinkedList();
    for(int i = 0; i < 10; i++){
      if(i < 5){
        a.add(i+"");
      }else{
        b.add(i+"");
      }
    }
    System.out.println();
    System.out.println("A:"+a+a.size());
    System.out.println("B:"+b+b.size());

    a.extend(b);
    System.out.println("A:"+a+a.size());
    System.out.println("B:"+b+b.size());
    System.out.println("A reversed:"+a.toStringReversed()+a.size());
    System.out.println("B reversed:"+b.toStringReversed()+b.size());
  }
}
