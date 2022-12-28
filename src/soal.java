public class soal{
    public static void haha (int n){
        int lastnum = 0;
        int total = 0;

        for (int row=1;row<=n;row++){
            total=0;
            for (int x_row=1;x_row<=row;x_row++){
                if (row>1){
                    lastnum+=2;
                    System.out.println(lastnum);
                    total+=lastnum;
                }else {
                    System.out.println(x_row);
                    lastnum =x_row;
                    total=1;
                }
            }

            System.out.println("total:" + total);
        }
    }
}