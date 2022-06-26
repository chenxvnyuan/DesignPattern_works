package work4;

public class Banzhang extends Handler{

    @Override   
    public void handlerRequest(int Mission) {
        if(Mission <10 ){
            System.out.println("班长处理，下令消灭");
        }
        else {
            System.out.println("班长没有权限，上报上级");
            handler.handlerRequest(Mission);
        }
    }
}
