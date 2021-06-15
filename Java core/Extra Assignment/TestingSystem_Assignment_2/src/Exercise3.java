public class Exercise3 {
//    Question 1: Sử dụng for, while, do while để cho ra kết quả a, b, c, d như ảnh
    public  void Question1(){
        System.out.println("Exercise3 Question1: ");
        int n = Exercise2.InputInt();
        System.out.println("Kết quả ảnh a ");
        for (int i = 1 ; i <= n; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("Kết quả ảnh b ");
        for (int i = n ; i >= 1; i--){
            for (int j = 1;  j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("Kết quả ảnh c ");
        int i,j,k;
        for ( i = n ; i >= 1; i--){
            for ( j = 1;  j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
            for ( k = 0 ; k <(n-i+1) ; k++){
                System.out.print(" ");
            }
        }
        int i4,j4,k4;
        System.out.println();
        System.out.println("Kết quả ảnh d ");
        for ( i4 = 1 ; i4 <= n; i4++){
            for ( k4 = 0 ; k4 <(n-i4+1) ; k4++){
                System.out.print(" ");
            }
            for ( j4 = 1; j4 <= i4; j4++) {
                System.out.print("#");
            }
            System.out.println();

        }

    }
    public  void  Question2(){
        int n = Exercise2.InputInt();
        System.out.println("Exercise3 Question2: ");
        long  giaithua = 1;

        for (int i = 1; i <=n;i++){
            giaithua = giaithua*i;
        }
        System.out.println("n!= " + giaithua );
    }
}
