
public class Main
{
    int arr[];

    //Constructor
    Main(int sizeOfArray)
    {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }
    //Print the array or Traversing the array
    public void traverseArray()
    {
        try {
            for (int i = 0; i < arr.length; i++)
            {
                System.out.println(arr[i] + " ");
            }
        }
        catch (Exception e)
        {
            System.out.println("Array no longer exists");
        }

    }

    //Insert value in an array
    public void insert(int location,int valueToBeInserted)
    {
        try
        {
            if(arr[location]==Integer.MIN_VALUE) //cell is blank
            {
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted " +valueToBeInserted+ " at location: " +location );
            }
            else
            {
                System.out.println("This cell is already occupied by another value.");
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index to access try");
            //e.printStackTrace();
        }

    }

    //Accessing elements in an array
    public void accessElement(int cellnumber)
    {
        try
        {
            System.out.println("The access element of cellnumber " +cellnumber + " is: " +arr[cellnumber]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid cell number/index to access array");
        }
    }

    //Search of an element in an array
    public void search(int valueToSearch)
    {
        try
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==valueToSearch)
                {
                    System.out.println("Value Found!!");
                    System.out.println("Index of Value Search is: " +i + " and the value to search is: " +valueToSearch);
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Value can't be searched because out of Index");
        }

    }

    //Delete an element from an array
    public void delete(int valueToBeDeleted)
    {
        try
        {
            System.out.println("Value is deleted");
            arr[valueToBeDeleted]= Integer.MIN_VALUE;

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index can't be accessed");
        }
    }
}
