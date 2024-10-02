package com.javalearning.classandobject;

public class App {

    public static void main(String[] args) {
        Person personA = new Person("N1", "A1", "test@gmail.com", "1321323", "213123");
        Person personB = new Person("N1", "A1", "test@gmail.com", "1321323", "213123");
//        person.setAddress("A1");
//        person.setName("N1");
//        person.setEmail("test@gmail.com");
//        person.setPhoneNumber("11234332343");
//        person.setCardNo("dfjdsklfjs"); // solved this using constructor

        Person person2 = new Person("Mohit", "123456");

        System.out.println(personA); // ??

        if(personA.equals(personB)) {
            System.out.println("same");
        } else {
            System.out.println("diff");
        }

        double pi = Math.PI;
        int maxValue = Integer.MAX_VALUE;

        String template = AppConstant.EMAIL_STRING;

        String output = StringUtils.createOutput("Mohit", "Singh"); // static memory

    }
}
