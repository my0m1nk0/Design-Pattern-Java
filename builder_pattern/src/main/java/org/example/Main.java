package org.example;

import org.example.color.RedColor;
import org.example.font.CustomFontStyle;

public class Main {
    public static void main(String[] args) {
//        Student stu = new Student("Mg Mg",12,"Mandalay");
//        System.out.println(stu);

//        Student stu = new StudentBuilder()
//                .create()
//                .addName("Alien ")
//                .addAge(23)
//                .addSchool("Yangon")
//                .build();
//        System.out.println(stu);

//        End Demo ///////////


//        Start Font

//            MyStyle obj = new MyStyle(new DefaultColor(),new CustomFontStyle());
//        System.out.println(obj);

//            MyStyle obj =new MyStyle.MyStyleBuilder().create().build();
//           obj.changeFont(new CustomFontStyle());
        MyStyle obj = MyStyle.createMyStyle();
        obj.changeColor(new RedColor());

        System.out.println(obj);
    }

}