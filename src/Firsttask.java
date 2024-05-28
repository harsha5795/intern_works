import java.util.*;


public class Firsttask extends User{
    public Firsttask(int user_id, String user_name, String phone_no, String email_id) {
        super(user_id, user_name, phone_no, email_id);
    }

    public static void main(String args[]){

        List<User> Userlist= new ArrayList<>();
        User a = new User(1, "ram", "8565367890", "kjydgfxcbnbhkj");
        Userlist.add(a);
        User b = new User(2, "allu", "9653457682", "jhgyftdrgfxjhkuijh");
        Userlist.add(b);
        int x=0;
        while(true)
        {
            if(x==1)
                break;

            System.out.println("pick the options:");
            System.out.println("1: Create user");
            System.out.println("2: Display user by entering userid");
            System.out.println("3: Update user");
            System.out.println("4: Delete user by entering userid");
            System.out.println("5: get all users");
            System.out.println("6: exit");

            Scanner se = new Scanner(System.in);
            int value = se.nextInt();
            switch (value){
                case 1:
                    System.out.println("Enter user id");
                    Scanner sa = new Scanner(System.in);
                    int id = sa.nextInt();
                    sa.close();
                    System.out.println("Enter user name");
                    Scanner sb = new Scanner(System.in);
                    String user_name = sb.nextLine();
                    System.out.println("Enter phone no");
                    Scanner sc = new Scanner(System.in);
                    String phone_no = sc.nextLine();
                    System.out.println("Enter email id");
                    Scanner sd = new Scanner(System.in);
                    String email_id = sd.nextLine();
                    User u = new User(id, user_name, phone_no, email_id);
                    Userlist.add(u);
                    System.out.println("successfully adder user");
                    break;

                case 2:
                    System.out.println("enter userid of user you wanna display");
                    Scanner s7 = new Scanner(System.in);
                    int us_id = s7.nextInt();
                        Optional<User> currentUser = Userlist.stream().
                                filter(user-> user.getUser_id() == us_id).findFirst();
                        if (currentUser.isPresent()) {
                            User user = currentUser.get();
                            System.out.println("User ID: " + user.getUser_id());
                            System.out.println("User Name: " + user.getUser_name());
                            System.out.println("Phone No: " + user.getPhone_no());
                            System.out.println("Email ID: " + user.getEmail_id());
                        }
                        else {
                            System.out.println("User with ID " + us_id + " not found.");
                        }
                    break;

                case 3:
//                    Here we are going to update, so updation should be done in the stream itself
//                    no object copy.
                    System.out.println("Enter user ID of the user you want to update:");
                    Scanner s2 = new Scanner(System.in);
                    int u_id = s2.nextInt();
                    s2.close();

                    boolean[] userFound = { false }; // Array to store whether user is found

                    Userlist.stream()
                            .filter(user -> user.getUser_id() == u_id)
                            .findFirst()
                            .ifPresent(user -> {
                                userFound[0] = true;
                                System.out.println("Pick an integer:");
                                System.out.println("1: Update username");
                                System.out.println("2: Update phoneno");
                                System.out.println("3: Update emailid");

                                Scanner s3 = new Scanner(System.in);
                                int picked_no = s3.nextInt();

                                switch (picked_no) {
                                    case 1:
                                        System.out.println("Enter new name:");
                                        Scanner s4 = new Scanner(System.in);
                                        String new_name = s4.nextLine();
                                        s4.close();
                                        user.setUser_name(new_name);
                                        System.out.println("Updated successfully");
                                        break;
                                    case 2:
                                        System.out.println("Enter new phone no:");
                                        Scanner s5 = new Scanner(System.in);
                                        String new_phno = s5.nextLine();
                                        s5.close();
                                        user.setPhone_no(new_phno);
                                        System.out.println("Updated successfully");
                                        break;
                                    case 3:
                                        System.out.println("Enter new emailid:");
                                        Scanner s6 = new Scanner(System.in);
                                        String new_email = s6.nextLine();
                                        s6.close();
                                        user.setEmail_id(new_email);
                                        System.out.println("Updated successfully");
                                        break;
                                    default:
                                        System.out.println("Wrong number entered");
                                }
                            }
                            );

                    if (!userFound[0]) {
                        System.out.println("User with ID " + u_id + " not found.");
                    }

                    break;

                case 4:
                    System.out.println("Enter user ID of the user you want to delete:");
                    Scanner s8 = new Scanner(System.in);
                    int ussid = s8.nextInt();

                    Optional<User> c_User = Userlist.stream()
                                           .filter(user -> user.getUser_id() == ussid).findFirst();

                    if (c_User.isPresent()) {
                        Userlist.remove(c_User.get());
                        System.out.println("User with ID " + ussid + " successfully deleted.");
                    } else {
                        System.out.println("User with ID " + ussid + " not found.");
                    }
                    break;

                case 5:
                    Userlist.stream().forEach((e)->{
                        System.out.println("user_id: " + e.getUser_id());
                        System.out.println("user_name: " + e.getUser_name());
                        System.out.println("phone_num: " + e.getPhone_no());
                        System.out.println("email_id: " + e.getEmail_id() + "\n");
                    }
                    );
                    break;

                case 6:
                    x++;
                    break;

                default:
                    System.out.println("Wrong number entered");


            }
        }


    }


}
