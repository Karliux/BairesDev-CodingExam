package bairesDev.exam.exercises;

import java.util.HashMap;

public class ProfessionMap {
	
	private HashMap<String, String> map;
	
	public ProfessionMap(){
		map = new HashMap<String, String>();
	}
	
	public void addData(String name, String profession){
		map.put(name, profession);
	}
	
	public String getProfessionByName(String name){
		return map.get(name);
	}
	
	public HashMap<String, String> getMap() {
		return map;
	}

	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}

	public static void main(String[] args) {
		ProfessionMap professionMap = new ProfessionMap();
		
		System.out.println("Adding information to profession map...");
		
		professionMap.addData("Marion", "Engineer");
		professionMap.addData("James", "Doctor");
		professionMap.addData("Frederick", "Accountant");
		professionMap.addData("John", "Lawyer");
		
		System.out.println("Information of: " + professionMap.getMap().size() + " professionists added. ");
		
		System.out.println("Getting the profession of: John. Profession: " + professionMap.getProfessionByName("John"));

	}

}
