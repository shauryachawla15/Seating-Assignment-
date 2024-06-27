// SHAURYA CHAWLA //
// 11/24/19 //
// PROJECT-3 (2nd FILE)
import java.util.*;

public class SeatingDriver {
 public static void main(String[] args)  {
 String seat = null;
 boolean status;
 char[][] seats = {{'1','A','B','C','D'},{'2','A','B','C','D'},{'3','A','B','C','D'},{'4','A','B','C','D'},{'5','A','B','C','D'},{'6','A','B','C','D'},{'7','A','B','C','D'}};
 char choice = 'Y';
 SeatingAsignmnet asignmnet = new SeatingAsignmnet();
 while(choice == 'Y' || choice == 'y'){
 asignmnet.display(seats);
 seat = asignmnet.getdate();
 System.out.println("Seat:" + seat);
 status = asignmnet.check(seat,seats);
 asignmnet.update(status,seats);
 asignmnet.display(seats);
 System.out.println("I need one more seat:(Y/N)");
 }
 }
 }
 