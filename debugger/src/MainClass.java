public class MainClass {
    public static void main(String[] args) {
        int i = 0, j = 6;
        do{
            i = ++i;
            j--;
        } while (j>0);
        
        j+= i;
        j = j % 2 == 0 ? 0 : 1;
        
        System.out.println(i);
        System.out.println(j);

    }
    
}
