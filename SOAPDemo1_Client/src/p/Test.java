package p;

import java.util.Arrays;

import proxies.Person;
import proxies.PersonService;
import proxies.PersonServiceImplService;

public class Test {

	public static void main(String[] args) {
		
		PersonServiceImplService serviceImpl = new PersonServiceImplService();
		
		PersonService service = serviceImpl.getPersonServiceImplPort();
		
		Person p1 = new Person(); p1.setName("Pankaj"); p1.setId(1); p1.setAge(30);
        Person p2 = new Person(); p2.setName("Meghna"); p2.setId(2); p2.setAge(25);
        
        System.out.println("Add Person Status="+service.addPerson(p1));
        System.out.println("Add Person Status="+service.addPerson(p2));
        
      //get person
        System.out.println("\n"+service.getPerson(1).toString());
         
        //get all persons
        System.out.println("\n"+Arrays.asList(service.getAllPersons()));
         
        //delete person
        System.out.println("\n"+"Delete Person Status="+service.deletePerson(2));
         
        //get all persons
        System.out.println("\n"+Arrays.asList(service.getAllPersons()));
        
	}

}

