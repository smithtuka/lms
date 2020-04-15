package smith.tukahirwa;


import java.util.Date;

public class Member extends Account {

    private Date dateOfMembership;
    private int totalBooksCheckedout;

    public Member(String id, AccountStatus status, Person person, Date dateOfMembership, int totalBooksCheckedout) {
        super(id, status, person);
        this.dateOfMembership = dateOfMembership;
        this.totalBooksCheckedout = totalBooksCheckedout;
    }

  public int getTotalBooksCheckedout(){
   // implement
   return 0;
  }

  public boolean reserveBookItem(BookItem bookItem){
   // implement
   return false;
  }

  private void incrementTotalBooksCheckedout(){
   // implement this
  }

// Implement logic
  /*public boolean checkoutBookItem(BookItem bookItem) {
   if (this.getTotalBooksCheckedOut() >= Constants.MAX_BOOKS_ISSUED_TO_A_USER) {
    ShowError("The user has already checked-out maximum number of books");
    return false;
   }
   BookReservation bookReservation = BookReservation.fetchReservationDetails(bookItem.getBarcode());
   if (bookReservation != null && bookReservation.getMemberId() != this.getId()) {
    // book item has a pending reservation from another user
    ShowError("This book is reserved by another member");
    return false;
   } else if (bookReservation != null) {
    // book item has a pending reservation from the give member, update it
    bookReservation.updateStatus(ReservationStatus.COMPLETED);
   }

   if (!bookItem.checkout(this.getId())) {
    return false;
   }

   this.incrementTotalBooksCheckedout();
   return true;
  }*/

  // implemet logic
/*
  private void checkForFine(String bookItemBarcode) {
   BookLending bookLending = BookLending.fetchLendingDetails(bookItemBarcode);
   Date dueDate = bookLending.getDueDate();
   Date today = new Date();
   // check if the book has been returned within the due date
   if (today.compareTo(dueDate) > 0) {
    long diff = todayDate.getTime() - dueDate.getTime();
    long diffDays = diff / (24 * 60 * 60 * 1000);
    Fine.collectFine(memberId, diffDays);
   }
  }*/

  //implement logic
  /*
  public void returnBookItem(BookItem bookItem) {
   this.checkForFine(bookItem.getBarcode());
   BookReservation bookReservation = BookReservation.fetchReservationDetails(bookItem.getBarcode());
   if (bookReservation != null) {
    // book item has a pending reservation
    bookItem.updateBookItemStatus(BookStatus.RESERVED);
    bookReservation.sendBookAvailableNotification();
   }
   bookItem.updateBookItemStatus(BookStatus.AVAILABLE);
  }*/

  // IMPLEMENT LOGIC

/*  public bool renewBookItem(BookItem bookItem) {
   this.checkForFine(bookItem.getBarcode());
   BookReservation bookReservation = BookReservation.fetchReservationDetails(bookItem.getBarcode());
   // check if this book item has a pending reservation from another member
   if (bookReservation != null && bookReservation.getMemberId() != this.getMemberId()) {
    ShowError("This book is reserved by another member");
    member.decrementTotalBooksCheckedout();
    bookItem.updateBookItemState(BookStatus.RESERVED);
    bookReservation.sendBookAvailableNotification();
    return false;
   } else if (bookReservation != null) {
    // book item has a pending reservation from this member
    bookReservation.updateStatus(ReservationStatus.COMPLETED);
   }
   BookLending.lendBook(bookItem.getBarCode(), this.getMemberId());
   bookItem.updateDueDate(LocalDate.now().plusDays(Constants.MAX_LENDING_DAYS));
   return true;
  }*/
 }




