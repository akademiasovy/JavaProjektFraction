public class MainClass {
    public static void main(String[] args) {
      // if, for, while, switch
      // int, float, double, char, char[] -> String , bool -> boolean
      // include -> import
      // printf -> System.out.print
      String city = "Nove mesto nad Vahom";
        System.out.println(city);
        System.out.println("Pocet znakov:"+city.length());
        int i, count=0;
        for(i=0;i<city.length();i++){
            if(city.charAt(i)>='A' && city.charAt(i)<='Z')
                 count++;
        }
        System.out.println("Pocet velkych pismen: "+count);

        Person student = new Person();
        student.setName("Tomas Pavlik");
        student.setGender(false);

        Book book1 = new Book();
        book1.setName("Java 2");
        book1.setAuthor("Herbert Schildt");

        System.out.println("Student's name is "+student.getName());

        Fraction x=new Fraction();
        x.setC(2);
        x.setM(8);
        x.convertToPrimary();
        Fraction y=new Fraction(21,45);


        System.out.println(x.getC()+"/"+x.getM());
        System.out.println(x.getRealValue());

    }
}
