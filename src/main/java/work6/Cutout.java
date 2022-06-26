package work6;

/** 滤镜的具体扩充类
 * 添加木刻滤镜
 */
public class Cutout implements ImageFilter{
    @Override
    public void filter(String image) {
        System.out.println(image + "图片添加木刻滤镜");
    }
}
