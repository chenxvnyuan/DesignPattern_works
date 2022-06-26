package work1;

/**
 * 会议：充当被观察者，即观察目标
 */
public interface Meeting {
    public void registerObserver(Component component);
    public void removeObserver(Component component);
    public void notifyObserver();
}
