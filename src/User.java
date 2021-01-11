public class User {
    private int id;
    private String password;

    public User(){
        this("123456");
    }
    public User(String password)
    {
        this.password=password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
