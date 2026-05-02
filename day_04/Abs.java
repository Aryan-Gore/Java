
interface A{

    public static final int a = 10;
    int x = 100;


    void show();
    default void present(){
        System.out.println("indside A");
    }
}

interface B{
    void show();
    default void present(){
        System.out.println("indside B");
    }
}

class C implements A,B{

    public void present(){

        

    }
    public void show(){

    }
}

public interface Abs {

    public static void main(String[] args) {
        
        C c = new C();

        System.out.println(c.a);
        
    }
    
}