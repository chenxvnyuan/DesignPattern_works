package work6;

public class Client {
    public static void main(String[] args) {
        String image ="123.gif";//图片
        Image imagereader = ImageJudge.getInstance(image);;//图片读取器
        imagereader.setFilter(new Blur());//设置滤镜类型
        imagereader.HandlerImage(image);//并读取图片,添加滤镜

        imagereader.setFilter(new Cutout());//设置滤镜类型
        imagereader.HandlerImage(image);//并读取图片,添加滤镜

        imagereader.setFilter(new Sharpen());//设置滤镜类型
        imagereader.HandlerImage(image);//并读取图片,添加滤镜
    }
}
