public class Comentarios {
    
    /*Este método foi elaborado as pressas
     * por isso os nomes das variáveies
     * se encontram abreviados,
     * Mas ele tem a finalidade de somar
     * ou multiplicar dois números.
     */
    
    public static void main(String[] args){
    
    }
        
    public int somaMultiplica(int n, int x, String m){
            int r = 0; // r é igual ao resultado
            if (m == "M"){ // M = Multiplicação
                r = n * x;
            }else{
                //se não soma mesmo
                r = n + x;
            }
            return r;
        }
}


