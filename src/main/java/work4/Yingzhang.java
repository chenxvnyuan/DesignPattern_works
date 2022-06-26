package work4;

public class Yingzhang extends Handler{
    @Override
    public void handlerRequest(int Mission) {
        if(Mission >= 50 && Mission <200 ){
            System.out.println("营长处理，下令消灭");
        }
        else {
            System.out.println("营长开会，然后下令");
        }
    }
}
