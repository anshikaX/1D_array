public class OneD_main
{
    public static void main(String args[])
    {
          Main obj = new Main(10);
          System.out.println("Printing the array:");

          obj.traverseArray();

          obj.insert(0,0);
          obj.insert(1,10);
          obj.insert(2,20);
          obj.insert(3,30);
          obj.insert(4,40);
          obj.insert(5,50);
          obj.insert(6,60);
          obj.insert(7,70);
          obj.insert(8,80);
          obj.insert(9,90);
          obj.insert(12,10);

          obj.traverseArray();
          obj.accessElement(2);
          obj.search(10);
          obj.delete(0);



    }
}
