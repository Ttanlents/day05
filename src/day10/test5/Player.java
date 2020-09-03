package day10.test5;

public class Player {
    public  void FightAbleSelect(String str){
        System.out.println("选择"+str);
        if (str.equals("法力角色")){

            FightAble play=new Mage();
            play.specialFight();
            play.commonFight();
            return;
        }
        FightAble play=new Fighter();
        play.commonFight();
        play.specialFight();
    }
}
