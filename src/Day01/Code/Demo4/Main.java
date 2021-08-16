package Day01.Code.Demo4;

public class Main {
    public static void  main(String[] args){
        Person p1 = new Person();
        p1.age = 30;
        p1.name = "Tom";
        Person p2 = new Person();
        p2.age = 30;
        p2.name = "Tom1";
        if(p1.equals(p2)){
            System.out.println("p1和p2相等");
        }else{
            System.out.println("p1和p2不相等");
        }


    }
}
