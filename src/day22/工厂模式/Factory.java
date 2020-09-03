package day22.工厂模式;

/**
 * @author 余俊锋
 * @date 2020/9/3 10:36
 */
public class Factory {
    public Fruit creatFruit(String type){
        if (type.equals("apple")){
            return new Apple();
        }
        return new Fruit() {
            @Override
            public void whatIm() {
                System.out.println("水果");
            }
        };
    }
}
