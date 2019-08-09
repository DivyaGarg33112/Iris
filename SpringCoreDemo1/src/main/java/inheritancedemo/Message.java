package inheritancedemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Message //implements InitializingBean,DisposableBean 
{
	
	private String msg1,msg2,msg3;

	
	
	
	public void setMsg1(String msg1) {
		this.msg1 = msg1;
	}

	public void setMsg2(String msg2) {
		this.msg2 = msg2;
	}

	public void setMsg3(String msg3) {
		this.msg3 = msg3;
	}

	@Override
	public String toString() {
		return "Message [msg1=" + msg1 + ", msg2=" + msg2 + ", msg3=" + msg3
				+ "]";
	}

/*	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean has been initialized");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Bean has been destroyed");
	}
*/
	
	@PostConstruct
	public void myInit()  {
		System.out.println("Bean has been initialized");
	}

	@PreDestroy
	public void myDestroy()  {
		System.out.println("Bean has been destroyed");
	}
	
	
}
