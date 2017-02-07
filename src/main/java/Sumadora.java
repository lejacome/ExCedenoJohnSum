public class Sumadora {
    private int[] nums;

    public Sumadora(int[] nums) {
        super();
        this.nums = nums;
    }

    public int sumar() throws Exception{
       int suma=0;
       int[] numneg;
       for ( int num : this.nums ) {
    	   if (num >= 0){
    		   if (num <= 1000){
        		   suma = suma + num;
        	   }
    	   }else{
    		   throw new RuntimeException("Numeros negativos no permitidos: [-6, -18]");
    	   }
    	   
       }
       return suma;
   }
}
