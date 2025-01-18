//CLASS: CSE 205
//DESCRIPTION:
//CSE205 Object Oriented Programming and Data Structures, Fall 2021
//Project Number: 1
//Authors: Miranda Coston, mcoston, mcoston@asu.edu; 
//Authors: Caleb Ewer, cewer, cewer@asu.edu;
//Authors: Samuel Ketcham, scketch1, scktech1@asu.edu
//Authors: Miranda Coston, mcoston, mcoston@asu.edu
//Main.java
import java.io.*;
import java.util.*;
import java.util.ArrayList;
public class Main 
{


  //-----------------readInputFile--------------------------
  public static ArrayList<Integer> readInputFile(String pFileName) throws FileNotFoundException  
  {
    ArrayList<Integer> list = new ArrayList<>();
    File in = new File(pFileName);
    Scanner scan = new Scanner(in);
    while (scan.hasNextInt()) 
    {
      list.add(scan.nextInt());
    }
  scan.close();
  return list;
  }
//--------run-----------------------------------

//---------------original run() writeup------------------------------------------
    
  public static void run() throws FileNotFoundException
    {
      final Integer UP = 2;
      final Integer DOWN = 3;
      ArrayList<Integer> list = readInputFile("p01-in.txt");
      ArrayList<Integer> listRunsUpCount = new ArrayList<>();
      ArrayList<Integer> listRunsDnCount = new ArrayList<>();

      listRunsUpCount = findRuns(list,UP);
      listRunsDnCount = findRuns(list,DOWN);
      ArrayList<Integer> listRunsCount = mergeLists(listRunsUpCount, listRunsDnCount);
      writeOutputFile("p01-runs.txt", listRunsCount);

     }
     
  //----------create array list-------------------------
  public static  ArrayList<Integer> arrayListCreate(int pSize, int pInitValue)
  {
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=0; i<pSize; i++)
    {
      list.add(pInitValue);
    }
    return list;
  }
  //------------findRuns-------------------------------------------------
  public static ArrayList<Integer>  findRuns (ArrayList<Integer> pList, int pDir)
  {
    ArrayList <Integer> listRunsCount = arrayListCreate(pList.size(), 0);
    Integer i = new Integer (0);
    Integer k = new Integer (0);
    Integer index = new Integer(0); 

  while ( i< pList.size()-1) 
  {
    if (pDir.equals(UP) && pList.get(i)<= pList.get(i+1))
    {
      k++;
    }
  else if (pDir.equals(DOWN) && pList.get(i)>=pList.get(i+1))
    {
      k++;
    } 
  else 
      {
        if (k!=0)
          {
            index = listRunsCount.get(k);
            listRunsCount.set(k, index+1);
            k=0;
          }   
      } i++;
  }
  if (k!=0)
  {
    index= listRunsCount.get(k);
    listRunsCount.set(k,index+1);
    k=0;
  }
  return listRunsCount;
  }
//-----------merge Lists-----------------------------
  public static ArrayList<Integer> mergeLists(ArrayList<Integer> pListRunsUpCount, ArrayList<Integer> pListRunsDnCount)
  {
    ArrayList<Integer> listRunsCount = arrayListCreate(pListRunsUpCount.size(), 0);
    for (int i=0; i<=pListRunsUpCount.size()-1;i++)
    {
      int sum=pListRunsUpCount.get(i)+pListRunsDnCount.get(i);
      listRunsCount.set(i,sum);
    }
  return listRunsCount;
  } 
//-----------------write outputfile-----------------------
public static void writeOutputFile (String pFileName, ArrayList<Integer> pListRuns)
{
try 
  {
    File outputFile = new File(pFileName);
    PrintWriter out = new PrintWriter (outputFile);
    int sumPListRuns = 0;
    for( int i=0; i<pListRuns.size();i++)
    {
      sumPListRuns += pListRuns.get(i);
    }
    out.println("runs_total: " + sumPListRuns + "\n");
    for (int k = 1; k<pListRuns.size()-1;k++)
    {
      out.println("runs_"+ k+ ", " + pListRuns.get(k));
    }
    out.close();
  } 
  catch (FileNotFoundException pExcept3)
  {
    System.out.println("Unfortunately, we were unable to open an output file to write in!");
    System.exit(-200);
  }
}

  public static void main(String[] pArgs) throws FileNotFoundException
  {
    Main mainObject = new Main();
    mainObject.run();
  }

}
