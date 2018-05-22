package com.design.factory.simple;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class ProductFactory {
	public static Map<String, String> map = new HashMap<String, String>();
	/**
	 * 加载配置文件
	 */
	static {

		Properties properties = new Properties();
		ClassLoader classLoader = ProductFactory.class.getClassLoader();
		InputStream inputStream = classLoader
				.getResourceAsStream("com/design/factory/resource/product.properties");

		try {
			// 载入配置文件
			properties.load(inputStream);

			Iterator<String> iterator = properties.stringPropertyNames()
					.iterator();
			while (iterator.hasNext()) {
				String key = iterator.next();
				String value = (String) properties.get(key);
				System.out.println("key is :" + key + ", value  is : " + value);
				map.put(key, value);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Product produce(String className) throws Exception {
		try {
			/**
			 * 复杂对象初始化，效率比较慢，只能用于无参构造，有参数的时候无能为力
			 */
			Product newInstance = (Product) Class.forName(map.get(className))
					.newInstance();
			return newInstance;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		throw new Exception("没有该产品");
	}
}
