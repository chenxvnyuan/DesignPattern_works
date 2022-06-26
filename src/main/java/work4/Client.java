package work4;

public class Client {
    public static void main(String[] args) {
        Handler banzhang ,paizhang,yingzhang;
        banzhang = new Banzhang();
        paizhang = new Paizhang();
        yingzhang = new Yingzhang();

        //创建职责链
        banzhang.setHandler(paizhang);
        paizhang.setHandler(yingzhang);

        //上报情报给班长
        banzhang.handlerRequest(500);
    }
}
