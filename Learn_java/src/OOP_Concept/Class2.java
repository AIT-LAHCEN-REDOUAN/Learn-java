package OOP_Concept;

public class Class2 {
    String name = "GFC" ;
    public static void main(String[] Args ){
        try {
            Class cls =Class.forName("Class2");
            Class2 obj = (Class2)cls.newInstance();
            System.out.println(obj.name);
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        catch (InstantiationException e){
            e.printStackTrace();
        }
        catch (IllegalAccessException e){
            e.printStackTrace();
        }
    }
}
