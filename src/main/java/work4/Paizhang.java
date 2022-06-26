package work4;

public class Paizhang extends Handler{
    @Override
    public void handlerRequest(int Mission) {
        if(Mission >= 10 && Mission <50 ){
            System.out.println("排长处理，下令消灭");
        }
        else {
            System.out.println("排长没有权限，上报上级");
            handler.handlerRequest(Mission);
        }
    }
}
