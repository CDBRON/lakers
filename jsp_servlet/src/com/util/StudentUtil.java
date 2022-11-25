package com.util;



import com.entity.Student;



import java.util.HashMap;



public class StudentUtil {

    public static HashMap<String, Student> map=new HashMap<String,Student>();

    static{

        map.put("101",new Student("101","123","lili"));

        map.put("102",new Student("102","123","lisa"));

        map.put("103",new Student("103","123","coco"));

        map.put("104",new Student("104","123","mark"));

    }

    public static boolean log(Student stu){

        boolean b=false;

        for(String s:map.keySet()){

            if(map.get(s).getSno().equals(stu.getSno())&&map.get(s).getPassword().equals(stu.getPassword())){

                b=true;

            }

        }

        return b;

    }

    public static boolean reg(Student stu){

        map.put(stu.getSno(),stu);

        return true;

    }

}