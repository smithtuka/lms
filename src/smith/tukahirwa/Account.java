package smith.tukahirwa;

public abstract class Account {
    private String id;
    private String password;
    private AccountStatus status;
    private Person person;

//    private Member member; //

    public Account(String id, AccountStatus status, String name, Address address, String email, String phone) {
        this.id = id;
        this.status = status;
        this.person = new Person(name,  address,  email, phone);
    }

//    public Account(String id, String password, AccountStatus status, Member member) {
//        this.id = id;
//        this.password = password;
//        this.status = status;
//        this.member = member;
//    }

    public Account(String id, AccountStatus status, Person person) {
        this.id = id;
        this.status = status;
        this.person = person;
    }

    public Account(String id, String password, AccountStatus status, Person person) {
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public Person getPerson() {
        return person;
    }

    public boolean resetPassword(){
      //implement
        return false;
    }

}
