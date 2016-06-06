package bairesDev.exam.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListsExercise {
	
	private final List<Integer> listA = Arrays.asList(2, 5, 8, 10);
	private final List<Integer> listB = Arrays.asList(2, 2, 3, 4, 4, 20);
	
	public void getNumbersInBothLists(List<Integer> listC){
		Integer temp;
		Iterator<Integer> itr = listA.iterator();
		while(itr.hasNext()){
			temp = itr.next();
			if(listB.contains(temp))
				listC.add(temp);
		}
	}
	
	public void getNumbersOnlyInB(List<Integer> listD){
		Integer temp;
		Iterator<Integer> itr = listB.iterator();
		while(itr.hasNext()){
			temp = itr.next();
			if(!listA.contains(temp))
				listD.add(temp);
		}	
	} 
	
	public static void main(String[] args) {
		ListsExercise exercise = new ListsExercise();
		ArrayList<Integer> listC = new ArrayList<Integer>();
		ArrayList<Integer> listD = new ArrayList<Integer>();
	
		exercise.printList("A", exercise.getListA());
		exercise.printList("B", exercise.getListB());
		
		exercise.getNumbersInBothLists(listC);
		exercise.printList("C", listC);
		
		exercise.getNumbersOnlyInB(listD);
		exercise.printList("D", listD);

	}
	
	public void printList(String listName, List<Integer> list){
		System.out.println("List " + listName +": "+ list);
		
	}

	public List<Integer> getListA() {
		return listA;
	}

	public List<Integer> getListB() {
		return listB;
	}

}
