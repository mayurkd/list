import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CompareList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("!!!!!!!!!Comparing 2 List!!!!!!!!");
		//compareList();
		System.out.println("!!!!!!!!!!Duplicate item Added in 3 List!!!!!!!!");
		listthree();
	}
	public static void compareList()
	{
		List<String> list1=new ArrayList<>();
		list1.add("Samsung S10");
		list1.add("Samsung S20");
		list1.add("Samsung S21");
		list1.add("iPhone X");
		list1.add("iPhone 11");
		List<String> list2=new ArrayList<>();
		list2.add("Samsung S10");
		list2.add("Samsung S20");
		list2.add("Samsung S21");
		list2.add("iPhone X");
		list2.add("iPhone 11");
		System.out.println(list1+"\n"+list2);
		if(list1.equals(list2)==true)
			System.out.println("List are same!!!!");
		else
			System.out.println("List are not same");
	}
	public static void listthree()
	{
		List<String> order1=new CopyOnWriteArrayList();
		order1.add("Samsung S10");
		order1.add("Samsung S20");
		order1.add("Samsung S21");
		order1.add("iPhone X");
		order1.add("iPhone 11");
		System.out.println("Order List First:"+order1);
		List<String> order2=new CopyOnWriteArrayList<>();
		order2.add("Samsung a50");
		order2.add("Samsung a30");
		order2.add("Samsung S21");
		order2.add("iPhone X");
		order2.add("iPhone 12");
		System.out.println("Order List Second:"+order2);
		List<String> order3=new CopyOnWriteArrayList<>();
		for(int i=0;i<order2.size();i++)
		{
			
			if(order1.get(i).equalsIgnoreCase(order2.get(i)))
			{
				order3.add(order2.get(i));
			}
		}
		System.out.println("Duplicate order List:"+order3);
		
	}
}
