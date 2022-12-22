package duansg.example01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;

/**
 * @author Duansg
 * @date 2022-12-22 11:59
 */
public class Custom {

  public static void main(String[] args) {
    ItemMapper itemMapper = (ItemMapper) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{ItemMapper.class}, new InvocationHandler() {
      @Override
      public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return null;
      }
    });
    System.out.println(itemMapper.findById(1L));
  }

}
