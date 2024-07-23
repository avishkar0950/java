public class star {
    public static void main(String[] args) {
        int n=5;
      int  s=5;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<s-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}