package lianxiday2;

public class xunhuan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i=1;
    while(i<100){
    	System.out.println(i);
    	i++;
    }
    System.out.println("跳出循环后i的值："+i);
    i=1;
    do{
    	System.out.println(i);
    	i++;
    }while(i<100);
    System.out.println("跳出循环后i的值："+i);
	}

}
