public class mobile {
    String brand;
    int price;
    static String name="smartphone";
     void show()
     {
        System.out.println("brand name="+brand);
        System.out.println("price="+price);
        System.out.println("name="+name);

     };
     class main
     {
        public static void main(String[]args)
        {
        
            mobile m1=new mobile();
            
         System.out.println("\t");
         System.out.println("  ");
         
        m1.brand="samsung";
        m1.price=100000;
        m1.show();

         System.out.println("\t");
          System.out.println("  ");

        mobile m2=new mobile();
        m2.brand="Vivo";
        m2.price=20000;
        m2.show();

        }

    }

}
