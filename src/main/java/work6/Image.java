package work6;

/**
 * 图片读取抽象类
 */
public abstract class Image {
    protected ImageFilter filter;

    //设置滤镜类型
    public void setFilter(ImageFilter filter) {
        this.filter = filter;
    }

    //打开图片
    public abstract void HandlerImage(String image);
}
