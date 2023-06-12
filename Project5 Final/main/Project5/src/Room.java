import java.util.ArrayList;

/**
 * A class that represents a ChatRoom.
 * It contains the information of all Users in this Chat Room.
 *
 * <p>Purdue University -- CS18000 -- Fall 2020 -- Project5</p>
 *
 * @author Kil Junhyeok, An Nguyen, Hoang Nguyen, Xiaoke He, Theerapatra Thongdee
 * @version December 07, 2020
 */

public class Room {

    private final String roomName;
    private ArrayList<User> arrayListOfUsersInThisRoom = new ArrayList<User>();
    private ArrayList<String> messagesOfThisRoom = new ArrayList<String>();
    private ArrayList<String> userArrayListInString;

    public Room(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }

    public String getListOfUsersInThisRoom() {
        return arrayListOfUsersInThisRoom.toString();
    }

    public String getMessagesOfThisRoom() {
        return messagesOfThisRoom.toString();
    }

    //This method adds a User to this Room's ArrayList of Users
    public void setListOfUsersInThisRoom(User userName) {
        arrayListOfUsersInThisRoom.add(userName);
    }

    //This method removes a User from the Room's ArrayList of Users
    public void removeUserfromList(String userName) {
        for (int i = 0; i < arrayListOfUsersInThisRoom.size(); i++) {
            if (arrayListOfUsersInThisRoom.get(i).getUserName().equals(userName)) {
                arrayListOfUsersInThisRoom.remove(arrayListOfUsersInThisRoom.get(i));
            }
        }
    }

    //This method prints the ArrayList of Users in this Room
    public void printListOfUsersInString() {
        for (int i = 0; i < arrayListOfUsersInThisRoom.size(); i++) {
            System.out.println(arrayListOfUsersInThisRoom.get(i).getUserName());
        }
    }

    public ArrayList<String> getListOfUsersInString() {
        userArrayListInString = new ArrayList<String>(arrayListOfUsersInThisRoom.size());
        for (int i = 0; i < arrayListOfUsersInThisRoom.size(); i++) {
            userArrayListInString.add(arrayListOfUsersInThisRoom.get(i).getUserName());
        }
        return userArrayListInString;
    }

    public void writeMessage(String message) {
        messagesOfThisRoom.add(message);
    }

    public ArrayList<User> getListOfUsersInThisRoom2() {
        return arrayListOfUsersInThisRoom;
    }
}
