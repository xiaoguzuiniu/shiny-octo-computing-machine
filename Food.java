package top.xiaoguyouqu.foodSet;

public class Food {
    private String name;
    private double price;
    private String desc;

//    无参构造器
public Food(){

}

//有参构造器
public Food(String name, double price, String desc){
   this.name = name;
   this.price = price;
   this.desc = desc;
}

//为每个成员提供get set 方法
public void setName(String name){
    this.name = name;
}
public String getName(){
        return name;
    }

public void setPrice(double price){
    this.price = price;
    }
public double getPrice(){
    return price;
}

public void setDesc(String desc){
    this.desc =desc;
}
public String getDesc(){
    return desc;
}

}



