package day10.test3;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<User> list=new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            list.add(new User(i));
        }

        Receptionlist r1=new Receptionlist((user1)->{
            user1.setType("v1");
        });

        Receptionlist r2=new Receptionlist((user1)->{
            user1.setType("v2");
        });

        Receptionlist r3=new Receptionlist((user1)->{
            user1.setType("A");
        });


        for (User user:list){
            int id=user.getId();
            if (id>=10&&id<=19){
               r1.receptUser(user);
            }
            if (id>=20&&id<=29){
                r2.receptUser(user);
            }
            if (id>=30&&id<=50){
                r3.receptUser(user);
            }
        }

        for (User user:list){
            if (user.getType()!=null){
                System.out.print("已经分组："+user);
                continue;
            }
            System.out.print("未分组："+user);
        }
    }
}
