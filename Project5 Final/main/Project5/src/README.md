# Project5: Social Network Application 
## Option 3: Messaging Application

### Table of Contents
- [Overall introduction of the application](#overall-introduction-of-the-application)
- [How to run](#How-to-run)
- [Classes](#classes)
  - [Client](#client)
  - [DeleteAccountGUI](#deleteaccountgui)
  - [EditAccountGUI](#editaccountgui)
  - [EditAppearanceGUI](#editappearancegui)
  - [LoginGUI](#logingui)
  - [MainInterfaceGUI](#maininterfacegui)
  - [Room](#room)
  - [Server](#server)  
  - [ServerGUI](#servergui)
  - [SignUpGUI](#signupgui)
  - [User](#user)
  
  
  
  
### Overall Introduction of the Application
This application implements the main function of sending messages both in individual conversations and group chats after users successfully log in their accounts. 
The project is concurrent server-client interaction and utilizes many GUI interfaces.

## How to run
1. Import all the Java files and password.txt file. password.txt file should be outside the src folder.
2. Run Server.java and input desired number under Server Port. Press Start Server to activate. "Waiting for Client to connect" should appear.
3. Run Client.java and press Sign Up. Input desired Username and Password and you should see "User Created".
4. Type "localhost" under Server IP, Server Port from Step 2) and the Username and Password just created. (password.txt should have been updated)
5. User Interface for User should appear. Box under "Users" will show all online Users. Box under "Chat Rooms" will show all chatrooms the current user is in.
6. Repeat Step 1) ~ 4) to connect another User.
7. Press "New Chat" on one of the User's window. Type in Room name, choose the other Users to invite. (One at a time)
8. The invited Users should see the newly created chatroom under their "Chat Rooms". Both the Users will have to click on the room name, press "Join" to enter and start conversation.
9. Users can create another room and click that room to join to chat on that room.
10. Users can click on the room name and press "Delete" to delete selected room from his window (Other Users in that room will still see that room).
11. "Edit Appearance" on top right can be used to change background color of the chat rooms.
12. When a User closes the window, Server should see "username: disconnected".
13. Unless Sever shuts down, all chatrooms and messages should remain even when user disconnects. However, user MUST create a new chat in order to refresh and retain all the chatrooms from his PREVIOUS connection.

### Classes

#### Client
  As its name, this class is client side. Users launch this class to log in their accounts or do operations of deleting and editing their accounts.
After logging in, this class will open chat room window automatically, and users can do other operations.

**Testing**
Please refer to ##How to run 

#### DeleteAccountGUI
  This class is the GUI interface of deleting users' accounts.
 
#### EditAccountGUI
  This class is the GUI interface of editing users' accounts.
  
#### EditAppearanceGUI
  This class is the GUI interface of editing background color of chat room.
 
#### LoginGUI
  This class is the GUI interface of logging in.
  

#### MainInterfaceGUI
  This class is the GUI interface of the main page after users log in their accounts successfully.
 
 
#### Room
  This is the class of Room object. To create a new room, users need to enter the name of chat room. 
  This class contains methods of adding or removing users from a chat room. Also, every room has an ArrayList to store messages.
 
 
#### Server
  As its name, this is the server side. Running this method, developers of this application can start the server so that users can connect.
  On the other hand, when developers stop the serever, users are unable to log in their accounts.
  
  **Testing**
  Please refer to ##How to run 
  
  
#### ServerGUI
  This class is the GUI interface of log in page.
 

#### SignupGUI
  This class is the GUI interface of signing up new accounts.
  

#### User
  This is the class of User object. To create a new User object, users need to have the username.
  This class has the methods of adding the chat room for a user when they join a new one, and also remove the chat room when a user delete a chat room.



