package clasesAnidadas;

public class Externa {
    
    private int atributoExterna = 7;
    
    public static class Interna{
        private int atributoInterno = 2;
        
        public void metodoInterno(){
            System.out.println(atributoInterno);
        }
        
    }
}
