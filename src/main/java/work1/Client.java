package work1;

public class Client {
    public static void main(String[] args) {
        //注册五个员工，两个部门，前两个员工是第一个部门的人，后两个是第二个部门的人，中间的人是某个部门的人
        Component e1,e2,e3,e4,e5,d1,d2;
        e1 = new Employee("张三");
        e2 = new Employee("李四");
        e3 = new Employee("王五");
        e4 = new Employee("赵六");
        e5 = new Employee("钱七");
        d1 = new Department("财务部");
        d2 = new Department("行政部");

        d1.add(e1);d1.add(e2);
        d2.add(e4);d2.add(e5);

        //注册会议
        Plan_metting meeting = new Plan_metting();

        //添加入会人员,财务部，行政部，某部门的王五
        meeting.registerObserver(d1);meeting.registerObserver(d2);meeting.registerObserver(e3);

        //发布会议信息
        meeting.setMessage("6月1日召开第二季度总结大会");

        //赵六被调到其他部门
        d2.remove(e4);

        //重新发布会议
        System.out.println();
        meeting.setMessage("6月15日召开第二季度总结大会");
    }
}
