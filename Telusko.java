public class Telusko {
    public static void main(String args[]) {

                // T
                for (int i = 1; i <= 5; i++) {  //row
                    for (int j = 1; j <= 5; j++) { //column
                        if (i == 1 || j == 3) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }

                    System.out.println();
                }

                System.out.println();

                //E
                for (int i = 1; i <= 5; i++) {  //row
                    for (int j = 1; j <= 5; j++) {   //cloumn
                        if (i == 1 || i == 3 || i == 5 || j == 1) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }

                    System.out.println();

                }

                System.out.println();

                //L
                for (int i = 1; i <= 5; i++) {  //row
                    for (int j = 1; j <= 5; j++) {   //cloumn
                        if (i == 5 || j == 1) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }

                    System.out.println();

                }

                System.out.println();

                //U
                for (int i = 1; i <= 5; i++) {  //row
                    for (int j = 1; j <= 5; j++) {   //cloumn
                        if (i == 5 || j == 1 || j == 5) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }

                    System.out.println();

                }

                System.out.println();

                //S
                for (int i = 1; i <= 5; i++) {  //row
                    for (int j = 1; j <= 5; j++) {   //cloumn
                        if(i==1 || i==5 ||i==3||j==1&&i==2||i==4&&j==5)
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

                //K
                for(int i=1;i<=5;i++)
                {
                    for(int j=1;j<=4;j++)
                    {
                        if(j==1||j==3&&i==2||j==3&&i==4||j==4&&i==1||j==4&&i==5||j==2&&i==3)
                        {
                            System.out.print("* ");
                        }else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                 System.out.println();


                //O
                for (int i = 1; i <= 5; i++)  //row
                {
                    for (int j = 1; j <= 5; j++) {
                        if (j == 1 || j == 5 || i == 1 || i == 5) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }


    }
}
