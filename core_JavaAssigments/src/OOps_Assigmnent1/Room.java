package OOps_Assigmnent1;

//Q1 Write a program to create a room class, the attributes of this class is roomno, roomtype, 
////roomarea and ACmachine.In this class the member
public class Room {

	int roomNo;
	String RoomType;
	float RoomArea;
	String Ac="AcMachine";

	Room(){}

	void input(int rno, String RType, float RArea, String Ac) {
		roomNo = rno;
		RoomType = RType;
		RoomArea = RArea;
		this.Ac = Ac;
	}

	void Display() {
		System.out.println("Room Number is " + roomNo);
		System.out.println("Room Number Type is " + RoomType);
		System.out.println("Room Number is " + RoomArea);
		System.out.println(roomNo+" with " + Ac+" Available");
	}

	public static void main(String args[]) {
		Room A = new Room();
		A.input(301, "Delux", 234.24f, "AcMachine");
		A.Display();
	}
}
