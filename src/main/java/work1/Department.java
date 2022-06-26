package work1;

import java.util.ArrayList;
import java.util.List;

/**
 * 叶子节点：作为部门，充当具体观察者
 */
public class Department implements Component{
    //部门名称
    private String name;
    //会议信息
    private String message;
    //该部门的员工列表
    private List<Component> children = new ArrayList<Component>();
    public Department(String name){
        this.name = name;
    }

    //添加部门员工
    @Override
    public void add(Component component) {
        children.add(component);
        ((Employee)component).setDeptname("    " + this.name + ":");
    }

    //将员工移出部门
    @Override
    public void remove(Component component) {
        children.remove(component);
        ((Employee)component).setDeptname("");
    }

    //通知该部门的人开会，即设置会议信息
    @Override
    public void update() {
        for (Object obj : children) {
            ((Component) obj).setMessage(this.message);
        }
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
        System.out.println(name + " 收到会议消息:" + message + ",并通知" + name + "的人");
        update();
    }
}
