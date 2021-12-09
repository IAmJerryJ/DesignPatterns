import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;



public class ProxyTest {
	public static void main(String[] args) {
		ISinger target = new Singer();
		ISinger proxy = (ISinger) Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, java.lang.reflect.Method method, Object[] args) throws Throwable{
						System.out.println("See hi to the audiences");
						Object returnValue = method.invoke(target, args);
						System.out.println("Thank you! ");
						return returnValue;
			}
		});
		proxy.sing();
	}
}

interface ISinger{
	void sing();
}

class Singer implements ISinger{
	public void sing() {
		System.out.println("Sing a song");
	}
}
