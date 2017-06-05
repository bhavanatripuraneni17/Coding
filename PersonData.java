

public class PersonData {
	
	private Person[] persons = new Person[100]; //max for illustration
	
	private class Person {
		Person(int id, String name, String phone , String address) {
			this.id = id;
			this.name = name;
			this.address = address;
			this.phone = phone;
		}

		public String toString() {
			return "id:" + id 
			+ " name:" + name 
			+ "address:" + address
			+ "phone:" + phone;
		}
		
		private int id;
		private String name;
		private String address;
		private String phone;
	}
	public Person getPersons(int id) {
		return persons[id];
	}
	public void addPersons(Person person) {
		this.persons[person.id] = person;
	}
	
	public static void main(String[] args) {
		PersonData pData = new PersonData();
		
		PersonData.Person p1 = pData. new Person(1, "sam", "000000000", "az");
		pData.addPersons(p1);
		
		PersonData.Person p2 = pData. new Person(2, "dan", "1111111", "ar");
		pData.addPersons(p2);

		System.out.println(pData.getPersons(1));
		System.out.println(pData.getPersons(2));

	}
}
