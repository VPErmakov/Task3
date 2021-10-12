import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void printList(ArrayList<Integer> list){
        for(Integer integer : list){
            System.out.print(integer + " ");
        }
    }
    public static void main(String[] args) throws ScanException {
        Scanner s = new Scanner(System.in);
        String q = s.nextLine();
        String[] scan = q.split(" ");
        ArrayList<Integer> list0 = new ArrayList<>();
        ArrayList<Integer> listDiv3 = new ArrayList<>();
        ArrayList<Integer> listDiv2 = new ArrayList<>();
        ArrayList<Integer> listNoth = new ArrayList<>();

        try{
            for(String str : scan){
                list0.add(Integer.parseInt(str));
            }

        }catch(NumberFormatException e){
            throw new ScanException("["+q+"] is impossible format. Try again with Integer.");
        }
        for(Integer x:list0){
            if(x%3!=0 && x%2==0){
                listDiv2.add(x);
            }
            if(x%3==0 && x%2!=0){
                listDiv3.add(x);
            }
            if(x%3!=0 && x%2!=0){
                listNoth.add(x);
            }
        }
        System.out.println("List of divides of 2:");
        Task2.printList(listDiv2);
        System.out.println("List of divides of 3:");
        Task2.printList(listDiv3);
        System.out.println("Last list:");
        Task2.printList(listNoth);


    }
}




