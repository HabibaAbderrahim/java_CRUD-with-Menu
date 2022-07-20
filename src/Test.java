import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void mm(){

        // Printing statements
        System.out.println("---MENU---");
        System.out.println("1: Add person");
        System.out.println("2: Delete person");
        System.out.println("3: Update person");
        System.out.println("4: Search person");
        System.out.println("5: Display person");
        System.out.println("6: Exit");
        //scanner
        System.out.println("Choose option :");

    }
    public static void menu()
    {

        //printing states
        mm();
        //User choice
        Scanner scanner = new Scanner(System.in);
        int option = 0 ;
        //Based on the option do
        //while not exit
        do {

            option = scanner.nextInt();
            //options
            switch (option){
                //ADD PERSON
                case 1 :
                    System.out.println("Set person name");
                    String pName = scanner.next();
                    System.out.println("Set person surname");
                    String surName = scanner.next();
                    System.out.println("set person age");
                    Integer age = scanner.nextInt();
                    System.out.println("set person id");
                    Long id = (long)scanner.nextInt();
                    //Call add method
                    Person p = new Person(pName ,surName , age , id);
                    crud.AddPerson(p);
                    System.out.println(p.toString());
                    break;
                case 2 :
                    //Delete Person
                    System.out.println("set person id");
                    Long ids = (long)scanner.nextInt();
                    //call
                    crud.DeletePerson(ids);
                    break;
                case 3 :
                    //update
                    System.out.println("set person id");
                    Long idp = (long)scanner.nextInt();
                    //call
                    crud.UpdatePerson(idp,scanner);
                    break ;
                case 4 :
                    //search
                    System.out.println("Person name");
                    String name = scanner.next();
                    //call
                    crud.SearchPersonByName(name);
                    break;
                case 5 :
                    crud.FindAll();
                    break;
                case 6: System.exit(0);
                     break;
                default:
                    System.out.println("Invalid operation");




            }

        }while (option != 9);
    }


    public static void main(String[] args) {

        //call list
        ArrayList<Person> myList = crud.list ;

        //objects to add to myList
        Person e1 = new Person("Habiba","Abderrhim" , 22 , (long) 1785);
        Person e2 = new Person();
        e2.setAge(23);
        e2.setId((long)2);
        e2.setName("Hedi");
        e2.setSurname("hadi");
        myList.add(e1);
        myList.add(e2);

        //
        for (Person e : myList){
            System.out.println(e);
        }

        // Menu - Static menu for displaying options
         menu();

    }
}
