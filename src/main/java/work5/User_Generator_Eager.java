package work5;

/**
 * 饿汉式
 */
public class User_Generator_Eager {
    private static final User_Generator_Eager user = new User_Generator_Eager();
    private User_Generator_Eager(){

    }
    public static User_Generator_Eager getInstance() {
        return user;
    }
}
