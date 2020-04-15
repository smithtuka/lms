package smith.tukahirwa.storage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import smith.tukahirwa.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Factory {

    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new Gson();

        // Accounts

        // Librarians

        // Authors

        // Array of Dates

        // Racks

        // Address
        FileReader address = new FileReader("src/smith/tukahirwa/json/address.json");

        Type addressType = new TypeToken<ArrayList<Address>>(){}.getType();

        List<Address> addressList = gson.fromJson(address, addressType);
        System.out.println(addressList.get(0).getCity());

        // BOOK ITEMS
        // Date could not be parsed
//        FileReader bookItem = new FileReader("src/smith/tukahirwa/json/book_item.json");
//
//        Type bookItemType = new TypeToken<ArrayList<BookItem>>(){}.getType();
//
//        List<BookItem> bookItemList = gson.fromJson(bookItem, bookItemType);
//        System.out.println(bookItemList.get(0).getBarcode());

        // BOOK LENDING
        // Date could not be parsed
//        FileReader bookLending = new FileReader("src/smith/tukahirwa/json/book_lending.json");
//
//        Type bookLendingType = new TypeToken<ArrayList<BookLending>>(){}.getType();
//
//        List<BookLending> bookReservationList = gson.fromJson(bookLending, bookLendingType);
//        System.out.println(bookReservationList.get(0).getBookItemBarcode());

        // BOOK RESERVATION
        // Date could not be parsed
//        FileReader bookReservation = new FileReader("src/smith/tukahirwa/json/book_reservation.json");
//
//        Type bookReservationType = new TypeToken<ArrayList<BookReservation>>(){}.getType();
//
//        List<BookReservation> bookReservationList = gson.fromJson(bookReservation, bookReservationType);
//        System.out.println(bookReservationList.get(0).getBookItemBarcode());

        // FINES
        // JSON date could not be parsed
//        FileReader fine = new FileReader("src/smith/tukahirwa/json/fine.json");
//
//        Type fineType = new TypeToken<ArrayList<Fine>>(){}.getType();
//
//        List<Fine> fineList = gson.fromJson(fine, fineType);
//        System.out.println(fineList.get(0).getMemberId());

        // MEMBERS
        // Date could not be parsed
//        FileReader members = new FileReader("src/smith/tukahirwa/json/members.json");
//
//        Type memberType = new TypeToken<ArrayList<Member>>(){}.getType();
//
//        List<Member> memberList = gson.fromJson(members, memberType);
//        System.out.println(memberList.get(0).getId());

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

//    static List<Member> memberList = List.of(
//            new Member()

//    );



}
