package lianxiday1;

public class Demoxunsuanfu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i=5;
    int j=6;
    System.out.println("i+j="+(i+j));
    System.out.println("i/j="+(i/j));
    System.out.println("i%j="+(i%j));
    System.out.println(++i);
    System.out.println(j++);
    
    
    boolean flag=false;
    int m=0;
    if(flag&&(++m)>0){
    	System.out.println("m的值"+m);
    flag=true;
        if(flag||(++m)>0){
        	System.out.println("m的值"+m);
    }
	}

}
}
