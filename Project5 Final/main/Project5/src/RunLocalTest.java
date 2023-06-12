import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import javax.swing.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.fail;
public class RunLocalTest {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestCase.class);
        if (result.wasSuccessful()) {
            System.out.println("Excellent - Test ran successfully");
        } else {
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
        }
    }

    public static class TestCase {
        private final PrintStream originalOutput = System.out;
        private final InputStream originalSysin = System.in;

        @SuppressWarnings("FieldCanBeLocal")
        private ByteArrayInputStream testIn;

        @SuppressWarnings("FieldCanBeLocal")
        private ByteArrayOutputStream testOut;

        @Before
        public void outputStart() {
            testOut = new ByteArrayOutputStream();
            System.setOut(new PrintStream(testOut));
        }

        @After
        public void restoreInputAndOutput() {
            System.setIn(originalSysin);
            System.setOut(originalOutput);
        }

        private String getOutput() {
            return testOut.toString();
        }

        @SuppressWarnings("SameParameterValue")
        private void receiveInput(String str) {
            testIn = new ByteArrayInputStream(str.getBytes());
            System.setIn(testIn);
        }

        @Test(timeout = 1000)
        public void testClientDeclarations() {
            // checks Room.java fields
            Field[] fields = Client.class.getDeclaredFields();
            if (fields.length < 4) {
                fail("Ensure that you have implemented the 4 required fields!");
                return;
            }
            // checks String roomname in Room.java
            try {
                Field roomNameCheck = Room.class.getDeclaredField("roomName");
                if (roomNameCheck.getType() != String.class) {
                    fail("Ensure that your field roomName is a String");
                    return;
                }
                if (roomNameCheck.getModifiers() != Modifier.PRIVATE + Modifier.FINAL) {
                    fail("Ensure that your field roomName in class Room is private and final!");
                    return;
                }
            } catch (NoSuchFieldException e) {
                fail("Ensure that you have a field roomName in class Room " +
                        "that is of String, is private, and final!");
                e.printStackTrace();
                return;
            }
            // check arrayListOfUsersInThisRoom in Room.java
            try {
                Field arrayListOfUsersInThisRoomCheck = Room.class.getDeclaredField("arrayListOfUsersInThisRoom");
                if (arrayListOfUsersInThisRoomCheck.getType() != ArrayList.class) {
                    fail("Ensure that your field arrayListOfUsersInThisRoom is an ArrayList");
                    return;
                }
                if (arrayListOfUsersInThisRoomCheck.getModifiers() != Modifier.PRIVATE) {
                    fail("Ensure that your field arrayListOfUsersInThisRoom in class Room is private!");
                    return;
                }
            } catch (NoSuchFieldException e) {
                fail("Ensure that you have a field arrayListOfUsersInThisRoom in class Room " +
                        "that is of ArrayList, and private!");
                e.printStackTrace();
                return;
            }
            // check messagesOfThisRoom in Room.java
            try {
                Field messagesOfThisRoomCheck = Room.class.getDeclaredField("messagesOfThisRoom");
                if (messagesOfThisRoomCheck.getType() != ArrayList.class) {
                    fail("Ensure that your field messagesOfThisRoom is an ArrayList");
                    return;
                }
                if (messagesOfThisRoomCheck.getModifiers() != Modifier.PRIVATE) {
                    fail("Ensure that your field messagesOfThisRoom in class Room is private!");
                    return;
                }
            } catch (NoSuchFieldException e) {
                fail("Ensure that you have a field messagesOfThisRoom in class Room " +
                        "that is of ArrayList, and private!");
                e.printStackTrace();
                return;
            }

            // check userArrayListInString in Room.java

            try {
                Field userArrayListInStringCheck = Room.class.getDeclaredField("userArrayListInString");
                if (userArrayListInStringCheck.getType() != ArrayList.class) {
                    fail("Ensure that your field userArrayListInString is an ArrayList");
                    return;
                }
                if (userArrayListInStringCheck.getModifiers() != Modifier.PRIVATE) {
                    fail("Ensure that your field userArrayListInString in class Room is private!");
                    return;
                }
            } catch (NoSuchFieldException e) {
                fail("Ensure that you have a field userArrayListInString in class Room " +
                        "that is of ArrayList, and private!");
                e.printStackTrace();
                return;
            }

            // check getRoomName method in Room.java

            try {
                Method checkGetRoomName = Room.class.getDeclaredMethod("getRoomName");
                if (checkGetRoomName.getModifiers() != Modifier.PUBLIC) {
                    fail("Ensure that your method getRoomName in class Room is public!");
                    return;
                }
                if (!checkGetRoomName.getReturnType().equals(String.class)) {
                    fail("Ensure that your method getRoomName in class Room returns a String!");
                    return;
                }
            } catch (NoSuchMethodException e) {
                fail("Ensure that you have a method getRoomName in class Room that is public, " +
                        "takes a single parameter of a string, and returns a string!");
                e.printStackTrace();
            }

            // check getListOfUsersInThisRoom method

            try {
                Method checkGetListOfUsersInThisRoom = Room.class.getDeclaredMethod("getListOfUsersInThisRoom");
                if (checkGetListOfUsersInThisRoom.getModifiers() != Modifier.PUBLIC) {
                    fail("Ensure that your method getListOfUsersInThisRoom in class Room is public!");
                    return;
                }
                if (!checkGetListOfUsersInThisRoom.getReturnType().equals(String.class)) {
                    fail("Ensure that your method getListOfUsersInThisRoom in class Room returns a String!");
                    return;
                }
            } catch (NoSuchMethodException e) {
                fail("Ensure that you have a method getListOfUsersInThisRoom in class Room that is public, " +
                        "takes no parameters, and returns a string!");
                e.printStackTrace();
            }

            // check getMessagesOfThisRoom() method in Room.java

            try {
                Method checkGetMessagesOfThisRoom = Room.class.getDeclaredMethod("getMessagesOfThisRoom");
                if (checkGetMessagesOfThisRoom.getModifiers() != Modifier.PUBLIC) {
                    fail("Ensure that your method getMessagesOfThisRoom in class Room is public!");
                    return;
                }
                if (!checkGetMessagesOfThisRoom.getReturnType().equals(String.class)) {
                    fail("Ensure that your method getMessagesOfThisRoom in class Room returns a String!");
                    return;
                }
            } catch (NoSuchMethodException e) {
                fail("Ensure that you have a method getMessagesOfThisRoom in class Room that is public, " +
                        "takes no parameters, and returns a string!");
                e.printStackTrace();
            }

            // checks setListOfUsersInThisRoom in Room.java

            try {
                Method checkSetListOfUsersInThisRoom = Room.class.getDeclaredMethod("setListOfUsersInThisRoom", User.class);
                if (checkSetListOfUsersInThisRoom.getModifiers() != Modifier.PUBLIC) {
                    fail("Ensure that your method setListOfUsersInThisRoom in class Room is public!");
                    return;
                }
                if (!checkSetListOfUsersInThisRoom.getReturnType().equals(void.class)) {
                    fail("Ensure that your method setListOfUsersInThisRoom in class Room returns void!");
                    return;
                }
            } catch (NoSuchMethodException e) {
                fail("Ensure that you have a method setListOfUsersInThisRoom in class Room that is public, " +
                        "takes a User parameter, and returns void!");
                e.printStackTrace();
            }

            // checks removeUserfromList in Room.java

            try {
                Method checkRemoveUserfromList = Room.class.getDeclaredMethod("removeUserfromList", String.class);
                if (checkRemoveUserfromList.getModifiers() != Modifier.PUBLIC) {
                    fail("Ensure that your method removeUserfromList in class Room is public!");
                    return;
                }
                if (!checkRemoveUserfromList.getReturnType().equals(void.class)) {
                    fail("Ensure that your method removeUserfromList in class Room returns void!");
                    return;
                }
            } catch (NoSuchMethodException e) {
                fail("Ensure that you have a method removeUserfromList in class Room that is public, " +
                        "takes a String parameter, and returns void!");
                e.printStackTrace();
            }

            // check printListOfUsersInString in Room.java

            try {
                Method checkPrintListOfUsersInString = Room.class.getDeclaredMethod("printListOfUsersInString");
                if (checkPrintListOfUsersInString.getModifiers() != Modifier.PUBLIC) {
                    fail("Ensure that your method printListOfUsersInString in class Room is public!");
                    return;
                }
                if (!checkPrintListOfUsersInString.getReturnType().equals(void.class)) {
                    fail("Ensure that your method printListOfUsersInString in class Room returns a void!");
                    return;
                }
            } catch (NoSuchMethodException e) {
                fail("Ensure that you have a method printListOfUsersInString in class Room that is public, " +
                        "takes no parameter, and returns void!");
                e.printStackTrace();
            }

            // check getListOfUsersInString in Room.java

            try {
                Method checkGetListOfUsersInString = Room.class.getDeclaredMethod("getListOfUsersInString");
                if (checkGetListOfUsersInString.getModifiers() != Modifier.PUBLIC) {
                    fail("Ensure that your method getListOfUsersInString in class Room is public!");
                    return;
                }
                if (!checkGetListOfUsersInString.getReturnType().equals(ArrayList.class)) {
                    fail("Ensure that your method printListOfUsersInString in class Room returns an ArrayList!");
                    return;
                }
            } catch (NoSuchMethodException e) {
                fail("Ensure that you have a method getListOfUsersInString in class Room that is public, " +
                        "takes no parameter, and returns an ArrayList!");
                e.printStackTrace();
            }

            // check writeMessage in Room.java

            try {
                Method checkWriteMessage = Room.class.getDeclaredMethod("writeMessage", String.class);
                if (checkWriteMessage.getModifiers() != Modifier.PUBLIC) {
                    fail("Ensure that your method writeMessage in class Room is public!");
                    return;
                }
                if (!checkWriteMessage.getReturnType().equals(void.class)) {
                    fail("Ensure that your method writeMessage in class Room returns a void!");
                    return;
                }
            } catch (NoSuchMethodException e) {
                fail("Ensure that you have a method writeMessage in class Room that is public, " +
                        "takes a String parameter, and returns void");
                e.printStackTrace();
            }

            // check getListOfUsersInThisRoom2 in Room.java

            try {
                Method checkGetListOfUsersInThisRoom2 = Room.class.getDeclaredMethod("getListOfUsersInThisRoom2");
                if (checkGetListOfUsersInThisRoom2.getModifiers() != Modifier.PUBLIC) {
                    fail("Ensure that your method getListOfUsersInThisRoom2 in class Room is public!");
                    return;
                }
                if (!checkGetListOfUsersInThisRoom2.getReturnType().equals(ArrayList.class)) {
                    fail("Ensure that your method writeMessage in class Room returns an ArrayList!");
                    return;
                }
            } catch (NoSuchMethodException e) {
                fail("Ensure that you have a method getListOfUsersInThisRoom2 in class Room that is public, " +
                        "takes no parameter, and returns an ArrayList");
                e.printStackTrace();
            }

            // check fields in User.java

            try {
                Field userNameCheck = User.class.getDeclaredField("userName");
                if (userNameCheck.getType() != String.class) {
                    fail("Ensure that your field userName is a String");
                    return;
                }
                if (userNameCheck.getModifiers() != Modifier.PRIVATE + Modifier.FINAL) {
                    fail("Ensure that your field userName in class User is private and final!");
                    return;
                }
            } catch (NoSuchFieldException e) {
                fail("Ensure that you have a field userName in class User " +
                        "that is of String, is private, and final!");
                e.printStackTrace();
                return;
            }

            // check field arrayListOfRoomsThisUserIsIn

            try {
                Field arrayListOfRoomsThisUserIsInCheck = User.class.getDeclaredField("arrayListOfRoomsThisUserIsIn");
                if (arrayListOfRoomsThisUserIsInCheck.getType() != ArrayList.class) {
                    fail("Ensure that your field arrayListOfRoomsThisUserIsIn is an ArrayList");
                    return;
                }
                if (arrayListOfRoomsThisUserIsInCheck.getModifiers() != Modifier.PRIVATE) {
                    fail("Ensure that your field arrayListOfRoomsThisUserIsIn in class User is private!");
                    return;
                }
            } catch (NoSuchFieldException e) {
                fail("Ensure that you have a field arrayListOfRoomsThisUserIsIn in class User " +
                        "that is of ArrayList, is private!");
                e.printStackTrace();
                return;
            }

            // checks field roomArrayListInString

            try {
                Field roomArrayListInStringCheck = User.class.getDeclaredField("roomArrayListInString");
                if (roomArrayListInStringCheck.getType() != ArrayList.class) {
                    fail("Ensure that your field roomArrayListInString is an ArrayList");
                    return;
                }
                if (roomArrayListInStringCheck.getModifiers() != Modifier.PRIVATE) {
                    fail("Ensure that your field roomArrayListInString in class User is private!");
                    return;
                }
            } catch (NoSuchFieldException e) {
                fail("Ensure that you have a field roomArrayListInString in class User " +
                        "that is of ArrayList, is private!");
                e.printStackTrace();
                return;
            }

            // checks getUserName() method in User.java

            try {
                Method checkGetUserName = User.class.getDeclaredMethod("getUserName");
                if (checkGetUserName.getModifiers() != Modifier.PUBLIC) {
                    fail("Ensure that your method getUserName in class User is public!");
                    return;
                }
                if (!checkGetUserName.getReturnType().equals(String.class)) {
                    fail("Ensure that your method getUserName in class User returns a String!");
                    return;
                }
            } catch (NoSuchMethodException e) {
                fail("Ensure that you have a method getUserName in class User that is public, " +
                        "takes no parameter, and returns a string!");
                e.printStackTrace();
            }

            // checks method getListOfRoomsThisUserIsIn() in user.java

            try {
                Method checkGetListOfRoomsThisUserIsIn = User.class.getDeclaredMethod("getListOfRoomsThisUserIsIn");
                if (checkGetListOfRoomsThisUserIsIn.getModifiers() != Modifier.PUBLIC) {
                    fail("Ensure that your method getListOfRoomsThisUserIsIn in class User is public!");
                    return;
                }
                if (!checkGetListOfRoomsThisUserIsIn.getReturnType().equals(String.class)) {
                    fail("Ensure that your method getListOfRoomsThisUserIsIn in class User returns a String!");
                    return;
                }
            } catch (NoSuchMethodException e) {
                fail("Ensure that you have a method getListOfRoomsThisUserIsIn in class User that is public, " +
                        "takes no parameter, and returns a string!");
                e.printStackTrace();
            }

            // checks method setListOfRoomsThisUserIsIn

            try {
                Method checkSetListOfRoomsThisUserIsIn = User.class.getDeclaredMethod("setListOfRoomsThisUserIsIn", Room.class);
                if (checkSetListOfRoomsThisUserIsIn.getModifiers() != Modifier.PUBLIC) {
                    fail("Ensure that your method setListOfRoomsThisUserIsIn in class User is public!");
                    return;
                }
                if (!checkSetListOfRoomsThisUserIsIn.getReturnType().equals(void.class)) {
                    fail("Ensure that your method setListOfRoomsThisUserIsIn in class User returns void!");
                    return;
                }
            } catch (NoSuchMethodException e) {
                fail("Ensure that you have a method setListOfRoomsThisUserIsIn in class User that is public, " +
                        "takes a Room parameter, and returns void!");
                e.printStackTrace();
            }

            // checks removeRoomfromList method in User.java

            try {
                Method checkRemoveRoomfromList = User.class.getDeclaredMethod("removeRoomfromList", String.class);
                if (checkRemoveRoomfromList.getModifiers() != Modifier.PUBLIC) {
                    fail("Ensure that your method removeRoomfromList in class User is public!");
                    return;
                }
                if (!checkRemoveRoomfromList.getReturnType().equals(void.class)) {
                    fail("Ensure that your method removeRoomfromList in class User returns void!");
                    return;
                }
            } catch (NoSuchMethodException e) {
                fail("Ensure that you have a method removeRoomfromList in class User that is public, " +
                        "takes a String parameter, and returns void!");
                e.printStackTrace();
            }

            // checks method printListOfRoomsInString in User.java

            try {
                Method checkPrintListOfRoomsInString = User.class.getDeclaredMethod("printListOfRoomsInString");
                if (checkPrintListOfRoomsInString.getModifiers() != Modifier.PUBLIC) {
                    fail("Ensure that your method printListOfRoomsInString in class User is public!");
                    return;
                }
                if (!checkPrintListOfRoomsInString.getReturnType().equals(void.class)) {
                    fail("Ensure that your method printListOfRoomsInString in class User returns void!");
                    return;
                }
            } catch (NoSuchMethodException e) {
                fail("Ensure that you have a method printListOfRoomsInString in class User that is public, " +
                        "takes no parameter, and returns void!");
                e.printStackTrace();
            }

            // checks getListOfRoomsInString method in User.java

            try {
                Method checkGetListOfRoomsInString= User.class.getDeclaredMethod("getListOfRoomsInString");
                if (checkGetListOfRoomsInString.getModifiers() != Modifier.PUBLIC) {
                    fail("Ensure that your method getListOfRoomsInString in class User is public!");
                    return;
                }
                if (!checkGetListOfRoomsInString.getReturnType().equals(ArrayList.class)) {
                    fail("Ensure that your method getListOfRoomsInString in class User returns ArrayList!");
                    return;
                }
            } catch (NoSuchMethodException e) {
                fail("Ensure that you have a method getListOfRoomsInString in class User that is public, " +
                        "takes no parameter, and returns an ArrayList!");
                e.printStackTrace();
            }

            // checks getListOfRoomsThisUserIsIn2 in User.java

            try {
                Method checkGetListOfRoomsThisUserIsIn2 = User.class.getDeclaredMethod("getListOfRoomsThisUserIsIn2");
                if (checkGetListOfRoomsThisUserIsIn2.getModifiers() != Modifier.PUBLIC) {
                    fail("Ensure that your method getListOfRoomsThisUserIsIn2 in class User is public!");
                    return;
                }
                if (!checkGetListOfRoomsThisUserIsIn2.getReturnType().equals(ArrayList.class)) {
                    fail("Ensure that your method getListOfRoomsThisUserIsIn2 in class User returns ArrayList!");
                    return;
                }
            } catch (NoSuchMethodException e) {
                fail("Ensure that you have a method getListOfRoomsThisUserIsIn2 in class User that is public, " +
                        "takes no parameter, and returns an ArrayList!");
                e.printStackTrace();
            }


            // check checkUsername method
            try {
                Method checkUsername = Client.class.getDeclaredMethod("checkUsername", String.class);
                if (checkUsername.getModifiers() != Modifier.PUBLIC + Modifier.STATIC) {
                    fail("Ensure that your method checkUsername in class Client is public!");
                    return;
                }
                if (!checkUsername.getReturnType().equals(int.class)) {
                    fail("Ensure that your method checkUsername in class Client returns an integer!");
                    return;
                }
            } catch (NoSuchMethodException e) {
                fail("Ensure that you have a method checkUsername in class Client that is public, " +
                        "takes a single parameter of a string, and returns an integer!");
                e.printStackTrace();
            }



            // server fields
            // checks userArrayList field
            try {
                Field userArrayListCheck = Server.class.getDeclaredField("userArrayList");
                if (userArrayListCheck.getType() != ArrayList.class) {
                    fail("Ensure that your field userArrayList is an ArrayList");
                    return;
                }
                if (userArrayListCheck.getModifiers() != Modifier.PRIVATE) {
                    fail("Ensure that your field userArrayList in class User is private!");
                    return;
                }
            } catch (NoSuchFieldException e) {
                fail("Ensure that you have a field userArrayList in class Server " +
                        "that is of ArrayList, is private!");
                e.printStackTrace();
                return;
            }

            try {
                Field arrayListOfAllUsersCheck = Server.class.getDeclaredField("arrayListOfAllUsers");
                if (arrayListOfAllUsersCheck.getType() != ArrayList.class) {
                    fail("Ensure that your field arrayListOfAllUsers is an ArrayList");
                    return;
                }
                if (arrayListOfAllUsersCheck.getModifiers() != Modifier.PRIVATE) {
                    fail("Ensure that your field arrayListOfAllUsers in class User is private!");
                    return;
                }
            } catch (NoSuchFieldException e) {
                fail("Ensure that you have a field arrayListOfAllUsers in class Server " +
                        "that is of ArrayList, is private!");
                e.printStackTrace();
                return;
            }

            // check arrayListOfAllRooms field
            try {
                Field arrayListOfAllRoomsCheck = Server.class.getDeclaredField("arrayListOfAllRooms");
                if (arrayListOfAllRoomsCheck.getType() != ArrayList.class) {
                    fail("Ensure that your field arrayListOfAllRooms is an ArrayList");
                    return;
                }
                if (arrayListOfAllRoomsCheck.getModifiers() != Modifier.PRIVATE) {
                    fail("Ensure that your field arrayListOfAllRooms in class User is private!");
                    return;
                }
            } catch (NoSuchFieldException e) {
                fail("Ensure that you have a field arrayListOfAllRooms in class Server " +
                        "that is of ArrayList, is private!");
                e.printStackTrace();
                return;
            }

            // check userInfo class

            try {
                Field usernameCheck = Server.UserInfo.class.getDeclaredField("username");
                if (usernameCheck.getType() != String.class) {
                    fail("Ensure that your field username is a String");
                    return;
                }
                if (usernameCheck.getModifiers() != Modifier.PRIVATE) {
                    fail("Ensure that your field username in class userInfo is private!");
                    return;
                }
            } catch (NoSuchFieldException e) {
                fail("Ensure that you have a field username in class userInfo " +
                        "that is of String, is private!");
                e.printStackTrace();
                return;
            }

            // check method getUsername
            try {
                Method checkGetUsername = Server.UserInfo.class.getDeclaredMethod("getUsername");
                if (checkGetUsername.getModifiers() != Modifier.PRIVATE) {
                    fail("Ensure that your method getUsername in class userInfo is public!");
                    return;
                }
                if (!checkGetUsername.getReturnType().equals(String.class)) {
                    fail("Ensure that your method getUsername in class userInfo returns a String!");
                    return;
                }
            } catch (NoSuchMethodException e) {
                fail("Ensure that you have a method getUsername in class User that is public, " +
                        "takes no parameter, and returns a string!");
                e.printStackTrace();
            }

            // check method inMessage
            try {
                Method checkInMessage = Server.UserInfo.class.getDeclaredMethod("inMessage", String.class);
                if (checkInMessage.getModifiers() != Modifier.PRIVATE) {
                    fail("Ensure that your method inMessage in class userInfo is private!");
                    return;
                }
                if (!checkInMessage.getReturnType().equals(void.class)) {
                    fail("Ensure that your method inMessage in class userInfo returns void!");
                    return;
                }
            } catch (NoSuchMethodException e) {
                fail("Ensure that you have a method inMessage in class User that is private, " +
                        "takes a String parameter, and returns void!");
            }

            // checks sendMessage

            try {
                Method checkSendMessage = Server.UserInfo.class.getDeclaredMethod("sendMessage", String.class);
                if (checkSendMessage.getModifiers() != Modifier.PRIVATE) {
                    fail("Ensure that your method sendMessage in class userInfo is private!");
                    return;
                }
                if (!checkSendMessage.getReturnType().equals(void.class)) {
                    fail("Ensure that your method sendMessage in class userInfo returns void!");
                    return;
                }
            } catch (NoSuchMethodException e) {
                fail("Ensure that you have a method sendMessage in class User that is private, " +
                        "takes a String parameter, and returns void!");
            }

            // checks broadcast method

            try {
                Method checkBroadcast = Server.UserInfo.class.getDeclaredMethod("broadcast", String.class);
                if (checkBroadcast.getModifiers() != Modifier.PRIVATE) {
                    fail("Ensure that your method broadcast in class userInfo is private!");
                    return;
                }
                if (!checkBroadcast.getReturnType().equals(void.class)) {
                    fail("Ensure that your method broadcast in class userInfo returns void!");
                    return;
                }
            } catch (NoSuchMethodException e) {
                fail("Ensure that you have a method broadcast in class User that is private, " +
                        "takes a String parameter, and returns void!");
            }

            // check broadcastSpecific

            try {
                Method checkBroadcastSpecific = Server.UserInfo.class.getDeclaredMethod("broadcastSpecific", String.class, String.class);
                if (checkBroadcastSpecific.getModifiers() != Modifier.PRIVATE) {
                    fail("Ensure that your method broadcastSpecific in class userInfo is private!");
                    return;
                }
                if (!checkBroadcastSpecific.getReturnType().equals(void.class)) {
                    fail("Ensure that your method broadcastSpecific in class userInfo returns void!");
                    return;
                }
            } catch (NoSuchMethodException e) {
                fail("Ensure that you have a method broadcastSpecific in class User that is private, " +
                        "takes 2 String parameter, and returns void!");
            }






        }



    }
}

