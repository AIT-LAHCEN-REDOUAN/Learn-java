package packages;


class Student {
    public String name ;
    Student(String name){
        this.name = name ;

    }
    @Override
    public String toString(){
        return name ;
    }
}

public class Arrays {
    public static void main(String[] Args){
        //One Dimentional Array

        //int[] intArray = new int[]{1,2,3,4,5,6,7,8,9,10};
        //System.out.println(intArray);

        //for (int i = 0 ; i<=intArray.length ;i++ ){
            //System.out.println(intArray[i]);

       //0 };

        Student[] myStudent = new Student[]{new Student("OUSSAMA"),new Student("ayoub"),new Student("ahmed")};
for(int i = 0 ; i<myStudent.length ; i++){
    System.out.println(myStudent[i]);


    int[] arr = new int[2] ;

    arr[0] = 10 ;
    arr[1] = 20 ;

    System.out.println(arr.length);

}
    }
}
