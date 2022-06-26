package work6;

/**
 * 图片判断器：根据图片类型，返回对应的图片读取器
 */
public class ImageJudge {
    public static Image getInstance(String image){
        Image imagereader = null;
        if(image.contains(".gif")){
            imagereader = new GIFImage();
        }else if(image.contains(".bmp")){
            imagereader = new BMPImage();
        }else if(image.contains(".jpg")){
            imagereader = new JPGImage();
        }
        return imagereader;
    }
}
