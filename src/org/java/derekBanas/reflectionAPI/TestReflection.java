package org.java.derekBanas.reflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.java.derekBanas.factoryDP.EnemyShipFactory;

public class TestReflection {

	public static void main(String[] args) {
		Class reflectClass = UfoEnemyShip.class; 
		String className = reflectClass.getName();
		System.out.println(className + "\n");
		
		int classModifier = reflectClass.getModifiers();
		
		// isAbstract, isFinal, isInterface, isPrivate, isProtected
		// isStatic, isStrict, isSynchronized, isVolatile
		System.out.println(Modifier.isPublic(classModifier)+"\n");
		
		Class[] interfaces = reflectClass.getInterfaces();
		
		Class classSuper = reflectClass.getSuperclass();
		System.out.println(classSuper.getName() + "\n");
		
		Method[] classMethod = reflectClass.getMethods();
		for(Method method : classMethod){
			
			if(method.getName().startsWith("get")){
				System.out.print("Getter Method :"+method.getName()+" ,");
			}
			else if (method.getName().startsWith("set")){
				System.out.print("Setter method :"+ method.getName()+ "  ,");
			}
			else{
				System.out.print("Method Name: "+method.getName()+" ,");
			}
			
			System.out.println("Return type: " + method.getReturnType());
			
			Class[] parameterType  =  method.getParameterTypes();
			
			System.out.print("Parameters : ");
			for(Class param: parameterType){
				System.out.print(param.getName() + " ,");
			}
			
			System.out.println();
			
			Constructor constructor = null;
			
			Object constructor2 = null;
			
			try {
				constructor = reflectClass.getConstructor(new Class[]{EnemyShipFactory.class});
				constructor2 = reflectClass.getConstructor(int.class,String.class).newInstance(12,"Random String");
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException 
					| InvocationTargetException |NoSuchMethodException | SecurityException e) {
				
				e.printStackTrace();
			} 
			
			Class[] constructorParameters = constructor.getParameterTypes();
			
			for(Class param: constructorParameters){
				System.out.println(param.getName() + " ,");
			}
			
			UfoEnemyShip ufoEnemyShip = null;
			
			EnemyShipFactory shipFactory = null;
			
			try {
				ufoEnemyShip = (UfoEnemyShip)constructor.newInstance(shipFactory);
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ufoEnemyShip.setName("XT-1000");
			System.out.println("Enemy Ship name: " + ufoEnemyShip.getName());
			
			Field privateStringName = null;
			
			UfoEnemyShip enemyShipPrivate = new UfoEnemyShip(shipFactory);
			
			try {
				privateStringName = ufoEnemyShip.getClass().getDeclaredField("idCode");
				
				privateStringName.setAccessible(true);
				
				try {
					String valueOfName = (String)privateStringName.get(enemyShipPrivate);
					System.out.println(" Private Field Name : " + valueOfName);
					
					String methodName = "getPrivate";
					
					Method privateMethod = UfoEnemyShip.class.getDeclaredMethod(methodName, null);
					
					privateMethod.setAccessible(true);
					
					String privateReturnValue= (String)privateMethod.invoke(enemyShipPrivate, null);
					System.out.println("Enemyship Private method :"+ privateReturnValue);
					
					Class[] methodParameters = new Class[]{Integer.TYPE,String.class};
					
					Object[] params = new Object[]{new Integer(10), new String("Random String")};
					
					privateMethod = UfoEnemyShip.class.getDeclaredMethod("getOtherPrivate", methodParameters);
					
					privateMethod.setAccessible(true);
					
					privateReturnValue = (String)privateMethod.invoke(enemyShipPrivate, params);
					System.out.println("Enemyship Other Private Method: " + privateReturnValue);
					
					
				} catch (IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			} catch (NoSuchFieldException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}

}
