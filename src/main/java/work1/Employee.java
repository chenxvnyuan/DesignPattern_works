package work1;

/**
 * 叶子节点：作为员工，充当具体观察者
 */
public class Employee implements Component{
    //会议信息
    private String message;

    private String name; //员工名称

    private String deptname = "";//部门名称，可为空

    public Employee(String name){
        this.name = name;
    }

    @Override
    public void add(Component component) { }

    @Override
    public void remove(Component component) { }

    //设置部门名称，可为空
    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    //获得会议通知
    @Override
    public void update() {
        System.out.println(deptname + name + " 收到会议消息:" + message);
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
        update();
    }
}
