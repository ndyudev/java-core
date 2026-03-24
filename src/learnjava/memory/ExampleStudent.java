package learnjava.memory;


// Stack va Heap
public class ExampleStudent {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Integer int1 = 10;
        Integer int2 = 10; // -128 -> 128 sex nawfm trong stack

        Integer y = 1000;
        Integer x = 1000; // ngoài khoảng đó sex nằm trong stack dù được khai báo là wrapper

        int a = 1000;
        int b = 1000;
        System.out.println(int1 == int2);
        System.out.println(y == x);
        System.out.println(a == b);

//        Long sum = 0L;
//        for (long i = 0; i < Integer.MAX_VALUE; i++) {
//            sum += i;
//        }

//        Integer count = 127;
//        if (count > 0) {
//            System.out.println(".,.");
//        }

        // reference và value type
        Student student = new Student("Duy", 10);
        System.out.println(student.getAge());
//        updateAge(student);
//        System.out.println(student.getAge());

        updateAge(student, 12);
        System.out.println(student.getAge());

        System.out.println(arr[1]);
        updateArray(arr);
        System.out.println("Println:" + arr[1]);
    }

    public static void updateAge(Student student) {
        student.setAge(student.getAge() + 1);
        System.out.println("age: " + student.getAge());
    }

    public static void updateAge(Student student, int age) {
        Student newStudent = new Student(student.getName(), age);
        student = newStudent;
    }

//    public static void updateArrray(int[] arr) {
//        arr[1] = 1;
//    }

    public static void updateArray(int[] arr) {
        int[] newArr = new int[3];
        newArr[0] = 2;
        newArr[2] = 3;
        arr = newArr;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
