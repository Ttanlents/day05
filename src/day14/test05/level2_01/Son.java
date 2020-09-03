package day14.test05.level2_01;

public class Son extends Father {
    public static void main(String[] args) {

    }

    //a) 验证：重写方法不能抛出与父类平级的其他异常
    /*@Override
    public void eat() throws TonguepainException {
       //重写方法抛出平级异常

        throw new TonguepainException("舌头疼");
    }*/


    //b) 验证：重写方法不能抛出比父类高级的异常。
   /* @Override
    public void eat() throws PainException {
        super.eat();
    }*/


    //c) 验证：重写方法可以抛出和父类同样的异常
   /* @Override
    public void eat() throws ToothPainException {
        super.eat();
    }*/

   //d) 验证：重写方法:可以抛出父类抛出异常的子类异常.
    /*@Override
    public void eat() throws BigToothPainException {

    }*/

    //e) 验证： 重写方法可以抛出多个 "父类抛出异常的子类异常".
   /* @Override
    public void eat() throws BigToothPainException,FrontToothPainException {

    }*/


   //f) 验证：父类不抛出异常,子类也不能抛出异常(编译时异常)
   /* @Override
    public void eat() throws ToothPainException {
        super.eat();
    }*/

    @Override
    public void eat() {
        super.eat();
        try {
            throw new BigToothPainException("大牙疼");
        } catch (BigToothPainException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void drink() {

    }
}
