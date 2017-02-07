public class Sumadora {
    private int[] nums;

    public Sumadora(int[] nums) {
        super();
        this.nums = nums;
    }

    public int sumar(){
       int suma=0;
       for ( int num : this.nums ) {
    	   if (num <= 1000){
    		   suma = suma + num;
    	   }
       }
       return suma;
       }
}
