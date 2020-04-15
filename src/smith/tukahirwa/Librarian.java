package smith.tukahirwa;

public class Librarian extends Account {

    public Librarian(String id, String password, AccountStatus status, Person person) {
        super(id, password, status, person);
    }

    public boolean addBookItem(BookItem bookItem){
        // implement
        return false;
    }

    public boolean blockMember(Member member){
        //implement
        return false;
    }

    public boolean unBlockMember(Member member){
        // implement
        return false;
    }
}
