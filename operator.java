package top.xiaoguyouqu.foodSet;

import java.util.ArrayList;
import java.util.Scanner;

public class operator {
//    定义一个ArrayList集合对象，负责存储菜品对象信息
    private ArrayList<Food> foodList = new  ArrayList();


//    上架商品功能
public void setFood(){
    //    创建一个商品对象用于存储商品信息
    Food newFood = new Food();
    Scanner s = new Scanner(System.in);
    System.out.println("输入商品名称:");
    newFood.setName(s.next());
    System.out.println("输入商品价格:");
    newFood.setPrice(s.nextDouble());
    System.out.println("输入商品描述:");
    newFood.setDesc(s.next());
    foodList.add(newFood);
}
//展示所有菜品功能
public void showAllFood(){
    for (int i = 0; i < foodList.size(); i++) {
        System.out.println(foodList.get(i).getName());
        System.out.println(foodList.get(i).getPrice());
        System.out.println(foodList.get(i).getDesc());
        System.out.println("--------------------------");
    }
}
//添加商品菜单功能
public void foodMenu() {

    while (true) {
        System.out.println("后台菜品上架菜单系统：");
        System.out.println("1.添加菜品");
        System.out.println("2.展示所有菜品");
        System.out.println("3.退出菜单");
        System.out.println("请输入您的操作：");
        Scanner s = new Scanner(System.in);
        String flag;
        flag = s.next();
        switch (flag) {
            case "1":
                setFood();
                break;
            case "2":
               showAllFood();
                break;
            case "3":
                System.out.println("欢迎下次再来！");
                return;//表示退出当前这个方法
        }
    }
}


}
