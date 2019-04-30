class MyModel1 {
    public int Camera = 2;
    public String Lock = "No Lock";
    public int Display = 5;
}
class MyModel2 extends MyModel1 {

    public int upgrade(int Camera){
        this.Camera = Camera;
        return Camera;
    }

    public String upgrade(String Lock) {
        this.Lock = Lock;
        return Lock;
    }

    public int upgradeDisplay(int Display){
        this.Display = Display;
        return Display;
    }
}
class MyModel2T extends MyModel2 {

    public int upgrade(int Camera){
        this.Camera = Camera;
        return Camera;
    }

    public String upgrade(String Lock) {
        this.Lock = Lock;
        return Lock;
    }

    public int upgradeDisplay(int Display){
        this.Display = Display;
        return Display;
    }
}
public class Main 
{
    public static void main(String[] args) 
    {
        MyModel2T obj = new MyModel2T();
        System.out.println("Features of MyModel 1");
        System.out.println("Camera mega pixels: " + obj.Camera);
        System.out.println("Features of MyModel 2");
        System.out.println("Camera mega pixels: " + obj.upgrade(5));
        System.out.println("Lock mechanism: " + obj.upgrade("Fingerprint"));
        System.out.println("Display size: " + obj.Display);
        System.out.println("Features of MyModel 2T");
        System.out.println("Camera mega pixels: " + obj.upgrade(16));
        System.out.println("Lock mechanism: " + obj.upgrade("Fingerprint"));
        System.out.println("Display size: " + obj.upgradeDisplay(6));
    }
}