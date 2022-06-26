package work1;

import java.util.ArrayList;
import java.util.List;

/**
 * 充当具体被观察的目标
 */
public class Plan_metting implements Meeting{
    //会议信息
    private String message;

    //入会人员列表
    private List<Component> list;

    //注册会议
    public Plan_metting(){
        list = new ArrayList<>();
    }

    //添加会议人员
    @Override
    public void registerObserver(Component component) {
        list.add(component);
    }

    //移除会议人员
    @Override
    public void removeObserver(Component component) {
        if (!list.isEmpty()){
            list.remove(component);
        }
    }

    //设置会议信息，会议开启则自动通知参会人员
    public void setMessage(String message) {
        this.message = message;
        System.out.println("会议消息消息： " + message);
        notifyObserver();
    }

    //通知所有入会人员（观察者）
    @Override
    public void notifyObserver() {
        for (Component o : list) {
            o.setMessage(message);
        }
    }
}
