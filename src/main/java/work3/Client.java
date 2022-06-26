package work3;

public class Client {
    public static void main(String[] args) {
        //创建代理类
        ProxyHandler proxyHandler = null;

        proxyHandler = new ProxyHandler(new IDEA());
        proxyHandler.run();

        proxyHandler = new ProxyHandler(new Excel());
        proxyHandler.run();

        proxyHandler = new ProxyHandler(new Word());
        proxyHandler.run();
    }
}
