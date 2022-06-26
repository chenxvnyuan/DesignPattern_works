package work6;

/** 滤镜的具体扩充类
 * 添加锐化滤镜
 */
public class Sharpen implements ImageFilter{
    @Override
    public void filter(String image) {
        System.out.println(image + "图片添加锐化滤镜");
    }
}
