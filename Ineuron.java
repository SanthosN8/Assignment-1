public class Ineuron {
    public static void main(String args[]){
        for(int l=1;l<=1;l++)
        {
            //I
            for(int i=1;i<=5;i++)
            {
                for(int j=1; j<=5; j++)
                {
                    if(j==3||i==1||i==5)
                    {
                        System.out.print("*");
                    }
                    else {
                    }
                }
                System.out.println();
            }
            System.out.println();

            //N
            for(int i=1;i<=5;i++)
            {
                for(int j=1; j<=5; j++)
                {
                    if(j==1||j==5||i==j)
                    {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();

            //E
            for(int i=1;i<=5;i++)
            {
                for(int j=1; j<=5; j++)
                {
                    if(j==1||i==1||i==3||i==5)
                    {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();

            //U
            for(int i=1;i<=5;i++)
            {
                for(int j=1; j<=5; j++)
                {
                    if(j==1||i==5||j==5)
                    {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();

            //R
            for(int i=1;i<=5;i++)
            {
                for(int j=1; j<=5; j++)
                {
                    if(j==1||i==1&&j!=5||j==i&&i>2.5||i==2&&j==4)
                    {
                        System.out.print("* ");
                    }else
                    {
                        System.out.print("  ");
                    }

                }
                    System.out.println();
            }

            System.out.println();

            //O
            for(int i=1;i<=5;i++)
            {
                for(int j=1; j<=5; j++)
                {
                    if(j==1||i==1||i==5||j==5)
                    {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();

            //N
            for(int i=1;i<=5;i++)
            {
                for(int j=1; j<=5; j++)
                {
                    if(j==1||j==5||i==j)
                    {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }




        }
    }

}


