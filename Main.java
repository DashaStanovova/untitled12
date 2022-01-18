public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String str = scanner.nextLine();
        int n=Integer.valueOf(str);
        int[] a = new int [n];
        int[] s=a.split(" ");
        for( int i=0; i<n; int i++){
            if (a[i]==0&&a[i+1]!=0){
                int k=a[i];
                a[i]=a[i+1];
                a[i+1]=k;
            }
        }
    }
}
