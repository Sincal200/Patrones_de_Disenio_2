public interface Device {
    boolean isEnabled();
    void enable();
    void disable();
    int getvolume();
    void setvolume(int percent);
    int getChannel();
    void setChannel(int channel);
    void printStatus();

}
