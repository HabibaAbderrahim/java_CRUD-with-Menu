import java.util.ArrayList;
import java.util.Scanner;

public class crud {

    // Creating an empty LinkedList
    static ArrayList<Person> list = new ArrayList<>();

    //Find By ID in list
    public static boolean findById(Long idL){
        //find in list idL
        for(Person e : list){
            if(e.getId() == idL){
                return true ;
            }

        }
        return false;
    }


    public static void AddPerson(Person person){
      Long id = person.getId();
      if(! findById(id) ){
          //add
          list.add(person);
          System.out.println("person added with success ");

      }else {
          System.out.println("person exists ");
      }
    }
    //Delete person byId
    public static void DeletePerson(Long id){
        Person p = null;
        //Find person with specific id
        for (Person e : list){
            if (e.getId()==id){
                p=e; //affect record kemel
            }

        }
        if (p == null){
            System.out.println("id not exists ");
        }else
        {
            list.remove(p);
            System.out.println("Deleted");
        }


    }

  /*  public static void UpdatePerson(Long id, Scanner sc ){
        if(findById(id)){
            Person p = new Person();
            String name = p.getName();
            //name
            System.out.println("Enter new name");
            String newName = sc.next();
            //update
             p.setName(newName);
            System.out.println(p.toString());
            //list.add(p);
            //surname
            System.out.println("Person updated succeffully");
        }else {
            System.out.println("person do not exists");
        }

    }*/
  public static void UpdatePerson(Long id, Scanner sc ){

      Person p = null ;
      //find
      for (Person e : list){
          if (e.getId()==id){
              p=e;
          }
      if (p== null){
          System.out.println("no no");
      }else
      {
          System.out.println("Enter new name");
          String newName = sc.next();
          //update
          p.setName(newName);
          System.out.println(p.toString());
          //list.add(p);
          //surname
          System.out.println("Person updated succeffully");
      }
      }
  }

    public static void FindAll(){
        //if list is emplty
        if(list.isEmpty()){
            System.out.println("no records");
        }
        else {
            for (Person e : list){
                System.out.println(e);
            }
        }
    }

    public static Person SearchPersonByName(String name) {
        Person p = new Person();
        String nameP = p.getName();
        for (Person e : list){
            if (e.getName()==name)
                return e ;
        }
        if(nameP.equals(name)) {
            return p;
        }else {
            System.out.println(name + " Do NOT EXIST !");
        }
        return p;
    }

}
