package work3;

/**
 * 代理类： 代理对象与目标对象要实现相同的接口
 */
public class ProxyHandler implements Software {

    private Software software;
    public ProxyHandler(final Software software) {
        this.software = software;
    }

    @Override
    public void run() {
        software.run();
    }
}
