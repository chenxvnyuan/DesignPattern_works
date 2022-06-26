package work5;

/**
 * 单例模式的两个关键点，构造方法私有，维持一个对象
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("===========普通对象对比=============");
        Client c1 = new Client();
        Client c2 = new Client();
        System.out.println("两客户端是否是同一个实例:" + (c1 == c2));

        System.out.println("\n===========饿汉式单例模式=============");
        User_Generator_Eager user1 = User_Generator_Eager.getInstance();
        User_Generator_Eager user2 = User_Generator_Eager.getInstance();
        System.out.println("两饿汉用户是否是同一个实例:" + (user1 == user2));

        System.out.println("\n===========懒汉式双否锁定单例模式=============");
        User_Generator_Two user3 = User_Generator_Two.getInstance();
        User_Generator_Two user4 = User_Generator_Two.getInstance();
        System.out.println("两懒汉用户是否是同一个实例:" + (user3== user4));
    }
}
