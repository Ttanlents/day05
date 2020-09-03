package day09.test03;

public class Test {
    public static void main(String[] args) {
        USB usb=new Mouse();
        new Test().shwoUsb(usb);
        USB usb2=new Key();
        new Test().shwoUsb(usb2);
    }

    public void shwoUsb(USB usb){
        if (usb instanceof Mouse){
            Mouse mouse=(Mouse)usb;
            mouse.open();
            mouse.close();
        }else {
            Key mouse=(Key) usb;
            mouse.open();
            mouse.close();
        }
    }
}
