// SHAURYA CHAWLA //
// 11/24/19 //
// PROJECT-3 (1st FILE)

import java.util.Scanner;
public class SeatingAsignmnet {
static Scanner input = new Scanner(System.in);

public String getdate() {
String seat = null;
System.out.println("Enter seat number to book:");
seat = input.nextLine(); // For acceptng seat location from the user
return seat;
}

// Method for displaying Airplane seats
public void display(char[][] seats) {
for(int i = 0;i < 7;i++)
  {
   for(int j = 0;j<5;j++) {
   System.out.print(seats[i][j] + " ");
   }
   System.out.println();
   }
   }
   
// Method to check Row number   
public boolean check(String seat, char[][] seats) {
int i,j = 0;
boolean status;
char row = seat.charAt(0);     // for getting row location from seat location
char column = seat.charAt(1);   // for getting column location from seat location 
i = Character.getNumericValue(row)-1;

if(column == 'A' || column == 'a')
j = 1;
else if(column == 'B' || column == 'b')
j = 2;
else if(column == 'C' || column == 'c')
j = 3;
else if(column == 'D' || column == 'd')
j = 4;
else {
System.out.println("Invalid Location");
}

if(seats[i][j] == 'X') {
status = false;
}
else {
seats[i][j] = 'X';
status = true;
}
return status;
}

// Method to check the selected seat
public void update(boolean status, char[][] seats) {
if(status == true) {
System.out.println("Your booking has been confirmed! Have a nice journey!!");
}
else{
System.out.println("The seat is already occupied.Please try other seat.Thank you!");
}
}
}
