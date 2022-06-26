package work4;

/**
 * 抽象处理类
 *
 */
public abstract class Handler {
    //维持对下家的引用
    protected Handler handler;
    public void setHandler(Handler handler){
        this.handler = handler;
    }
    //处理请求
    public abstract void handlerRequest(int Mission);
}
