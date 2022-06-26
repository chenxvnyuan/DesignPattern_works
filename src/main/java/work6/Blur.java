package work6;

/** 滤镜的具体扩充类
 * 添加模糊滤镜
 */
public class Blur implements ImageFilter{
    @Override
    public void filter(String image) {
        System.out.println(image + "图片添加模糊滤镜");
    }
}
