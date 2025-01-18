import java.util.ArrayList;
public class Main_Test_Cases
{
    
    public static void main(String[] args)
    {
    ArrayList<String> testCase41 = new ArrayList<>(); 
    testCase41.add("A");
    testCase41.add("B");
    testCase41.add("C");
    testCase41.add("D");
    testCase41.add("E");
    testCase41.add("F");
    testCase41.add("G");
    testCase41.add("H");
    testCase41.add("I");
    
    ArrayList<Integer> testCase57 = new ArrayList<>();
    testCase57.add(1);
    testCase57.add(10);
    testCase57.add(100);
    testCase57.add(1000);
    testCase57.add(10000);
    testCase57.add(100000);
    testCase57.add(1000000);
    testCase57.add(10000000);
    testCase57.add(100000000);
    
    
    H03_31 test31 = new H03_31();
    System.out.println(test31.sum1toN(11));
    
    H03_32 test32 = new H03_32();
    System.out.println(test32.power(2,3));
    
    H03_33 test33 = new H03_33();
    System.out.println(test33.powerFaster(2,3));
    
    H03_35 test35 = new H03_35();
    System.out.println(test35.reverse("PIG")+" Funny Colors");
    
    H03_41 test41 = new H03_41();
    System.out.println(test41.recLinearSearch(testCase41, "F", 0, testCase41.size()-1));
    
    H03_57 test57 = new H03_57();
    System.out.println(test57.recTernarySearch(testCase57, 100, 0, testCase57.size() -1)); 
}
    
}
