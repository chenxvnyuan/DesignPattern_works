package work5;

/**
 * 使用双重检查锁定实现的懒汉式单例类
 */
public class User_Generator_Two {
    private static User_Generator_Two user = null;
    private User_Generator_Two(){

    }
    public static User_Generator_Two getInstance() {
        //第一重判断
        if(user == null){
            //锁定代码块
            synchronized (User_Generator_Two.class){
                //第二重判断
                if(user == null){
                    user = new User_Generator_Two();
                }
            }
        }
        return user;
    }
}
