package constructor;


class City{
    public void m1(){
        System.out.println("hajipur");
    }
}
class Detail{
    City city;
    public  void m2(){
        city.m1();
    }
    Detail(City city){
        this.city=city;
    }
}
public class ConstructroDemo {


    public static void main(String[] args) {

        City c=new City();
        Detail d=new Detail(c);
        d.m2();
    }
}
