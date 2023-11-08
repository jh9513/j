public class gugudan {
    public static void main(String[] args) {
        System.out.println("[구구단출력]");
        for(int i = 1; i<=9 ; i++){
            for(int j = 1; j<=9 ; j++){
                System.out.print(String.format("0%dx0%d=%2d",i,j,i*j));

                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
