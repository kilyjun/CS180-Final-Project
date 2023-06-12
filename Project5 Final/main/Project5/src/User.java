import java.util.ArrayList;

/**
 * A class that represents a User
 * It contains the information of all Rooms a User is in.
 *
 * <p>Purdue University -- CS18000 -- Fall 2020 -- Project5</p>
 *
 * @author Kil Junhyeok, An Nguyen, Hoang Nguyen, Xiaoke He, Theerapatra Thongdee
 * @version December 07, 2020
 */

public class User {

    private final String userName;
    private ArrayList<Room> arrayListOfRoomsThisUserIsIn = new ArrayList<Room>();
    private ArrayList<String> roomArrayListInString;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String getListOfRoomsThisUserIsIn() {
        return arrayListOfRoomsThisUserIsIn.toString();
    }

    // This method adds a room to the User's ArrayList of Rooms
    public void setListOfRoomsThisUserIsIn(Room roomName) {
        arrayListOfRoomsThisUserIsIn.add(roomName);
    }
    //This method removes a room from the User's ArrayList of Rooms
    public void removeRoomfromList(String roomName) {
        for (int i = 0; i < arrayListOfRoomsThisUserIsIn.size(); i++) {
            if (roomName.contains(arrayListOfRoomsThisUserIsIn.get(i).getRoomName())) {
                arrayListOfRoomsThisUserIsIn.remove(arrayListOfRoomsThisUserIsIn.get(i));
                break;
            }
        }
    }
    //This method prints the list of Rooms this User is in
    public void printListOfRoomsInString() {
        for (int i = 0; i < arrayListOfRoomsThisUserIsIn.size(); i ++) {
            System.out.println(arrayListOfRoomsThisUserIsIn.get(i).getRoomName());
        }
    }
    
    public ArrayList<String> getListOfRoomsInString() {
        roomArrayListInString = new ArrayList<String>(arrayListOfRoomsThisUserIsIn.size());
        for (int i = 0; i < arrayListOfRoomsThisUserIsIn.size(); i++) {
            roomArrayListInString.add(arrayListOfRoomsThisUserIsIn.get(i).getRoomName());
        }
        return roomArrayListInString;
    }

    public ArrayList<Room> getListOfRoomsThisUserIsIn2() {
        return arrayListOfRoomsThisUserIsIn;
    }
}
