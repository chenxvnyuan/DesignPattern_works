package work2;

/**
 * 图片读取器创建工厂
 */
public class ImageReaderFactory {
    //输出图片，返回对应的图片读取器
    public ImageReader createImageReader(String image){
        ImageReader reader = null;
        if (image.contains(".gif")){
            reader = new GifReader();
        }else if(image.contains(".JPEG")){
            reader = new JPEGReader();
        }else{
            System.out.println("暂无该格式图片的读取器");
        }
        return reader;
    }

    //输出图片，获得对应的图片读取器，并读取图片
    public void ReadImage(String image){
        ImageReader reader = null;
        if (image.contains(".gif")){
            reader = new GifReader();
        }else if(image.contains(".JPEG")){
            reader = new JPEGReader();
        }else{
            System.out.println("暂无该格式图片的读取");
        }
        if(reader !=null){
            reader.readImage(image);
        }
    }
}
