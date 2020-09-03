package day09.test8;

import java.util.ArrayList;
import java.util.List;

public class ShopCar {
    List<Goods> list=new ArrayList<>();

   void addGoods(Goods goods){
       list.add(goods);
       System.out.println("加入"+goods.getName()+"成功");
      // System.out.println(list.getClass());
   }

   void showGoods(){
       System.out.println("您选购的商品为：");
       for (Goods g:list){
           System.out.println("商品："+g.getId()+","+g.getName()+","+g.getPrice());
       }
   }

   void getTotal(){
       double total=0;
       for (Goods g:list){
        total+= g.getPrice();
       }
       System.out.println("原价为"+total+"元");
       System.out.println("8.8折，折扣价："+total*0.88+"元");

   }

}
