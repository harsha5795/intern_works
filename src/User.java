public class User{

    private int user_id;
    private String user_name;
    private String phone_no;
    private String email_id;

    public User(int user_id, String user_name, String phone_no, String email_id) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.phone_no = phone_no;
        this.email_id = email_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }


}