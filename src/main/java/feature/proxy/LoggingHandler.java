package feature.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//InvocationHandler implementation
class LoggingHandler implements InvocationHandler {
	private Object target;

	public LoggingHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Before method: " + method.getName());
		Object result = method.invoke(target, args);
		System.out.println("After method: " + method.getName());
		return result;
	}
}
