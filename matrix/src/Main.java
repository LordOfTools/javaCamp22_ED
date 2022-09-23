public class Main {
    public static void main(String[] args) {

        int[][] a = new int[3][3];
        a[0][0]=1;
        a[0][1]=2;
        a[0][2]=3;
        a[1][0]=1;
        a[1][1]=2;
        a[1][2]=3;
        a[2][0]=1;
        a[2][1]=2;
        a[2][2]=3;
        //bu durumda ben i lerin alt alta j lerin yany yana olmasını istiyorum
        System.out.println("<---------------------matrix--------------------->");
        System.out.println("              | stun 1 | stun 2 | stun 3 | ");
        for(int i=0; i<=2 ;i++) {
           System.out.print("     | satır "+(i+1)+"|");

            for(int j=0; j<=2; j++) {
                System.out.print("    " +(a[i][j])+ "   |");


                if (j==2 ){
                    System.out.println("");
                    System.out.println("   <-------------------------------------->");
                }

            }


        }











    }
}