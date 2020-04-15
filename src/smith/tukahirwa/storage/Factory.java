package smith.tukahirwa.storage;

import com.google.gson.Gson;
import smith.tukahirwa.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Factory {

    public static void main(String[] args) throws FileNotFoundException {

       // Accounts

        // Librarians

        // Fines

        // Authors

        // Array of Dates

        // List of Members

        // Racks

        // Address

        // Librarians

        //BookItems

        // using the Gson
        var g = new Gson();
        List<Member> list = g.fromJson(new FileReader("src/smith/tukahirwa/docs/data-member.json"),
                ArrayList.class);
        System.out.println(list.get(0).getStatus());



    }
    // Addresses
    List<Address> addressList = List.of(
            new Address("100N 4th Street", "Fairfield", "Iowa", "522540","USA"),
            new Address("100N 5th Street", "Desmoines", "Iowa", "522540","USA"),
            new Address("100N 6th Street", "Fairfield", "Iowa", "522540","USA")
    );

    // Persons

    List<Person>  personList= List.of(
            new Person("Smith Tukahirwa", addressList.get(0),"smithtuka@gmail.com", "3397077670"),
            new Person("Alice Tukahirwa", addressList.get(1),"alicenan@gmail.com", "4497077678"),
            new Person("Dalson Tukahirwa", addressList.get(2),"dalsonk@gmail.com", "55534077670"),
            new Person("Smith Tukahirwa", addressList.get(0),"smithtuka@gmail.com", "3397077670")
    );

    // Members

    static List<Member> memberList = List.of(
//            new Member()

    );



}
