public class RemoteDemo extends BasicRemote{
    public RemoteDemo(Device device){
        super.device = device;
    }

    public void volumen_up(){
        System.out.println("Remote: all volume");
        device.setvolume(100);
    }
}
