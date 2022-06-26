package work2;

public class Client {
    public static void main(String[] args) {
        //图片读取器创建工厂
        ImageReaderFactory factory = new ImageReaderFactory();

        //创建图片
        String image ="123.JPEG";
        //获得图片读取器
        ImageReader imageReader = factory.createImageReader(image);
        //读取图片
        if(imageReader !=null){
            imageReader.readImage(image);
        }

        //创建图片文件夹
        String[] images = new String[]{"123.JPEG","123.gif","123.png"};
        //读取图片文件夹
        for(String im : images){
            factory.ReadImage(im);
        }
    }
}
