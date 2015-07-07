package lianxiday2;

public class continuehebreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    for(int i=1;i<=99;i++){
    	if(i%5==0){
    	System.out.println(i);
    	break;
    	}
    	
    }
    int num=0;
    for(int i=1;i<=99;i++){
    	if(i%5==0){
    	System.out.println(i);
    	continue;
    	}
   	num++;}
	System.out.println(+num);
    }

}
