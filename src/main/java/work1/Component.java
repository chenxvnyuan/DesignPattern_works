package work1;

/**
 * 组件：用于作为部门和员工的基类
 * 并且充当抽象观察者接口
 */
public interface Component {
    //添加叶子节点
    public void add(Component component);
    //移除叶子节点
    public void remove(Component component);
    //获得会议更新
    public void update();
    //设置会议信息
    public void setMessage(String message);
}
