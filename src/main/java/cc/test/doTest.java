package cc.test;

import com.founderinternation.datacenter.datadownload.client.mina.TestDownLoadThread;

public class doTest {

	public static void main(String[] args) {
		 
		
		   for(int i=0;i<1;i++)
		   {
			   TestDownLoadThread t=new TestDownLoadThread();
			   t.setCountz(i+1);
			   Thread tt= new Thread(t);
			   tt.start();
		   }
		   System.out.println("结束");
	}
}
