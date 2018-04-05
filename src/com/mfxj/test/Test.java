package com.mfxj.test;

import com.mfxj.entity.NutritionFacts;
import com.mfxj.pojo.Student;
import redis.clients.jedis.Jedis;

import java.io.Serializable;

/**
 * 
* <p>Title: Test</p>
* <p>Description: redis的使用</p>
* <p>Company: </p> 
* @author lican
* @date 2017年11月13日 下午2:39:25
 */
public class Test extends Student{

	public static void main(String[] args) throws IllegalAccessException, InstantiationException {


    }

    /**
     * 特别注意
     */
    public static void warning() throws IllegalAccessException, InstantiationException {
        //使用类的newInstance目标类必须有无参构造，否则运行时异常，不推荐使用
        NutritionFacts nutritionFacts=NutritionFacts.class.newInstance();
        System.out.println(nutritionFacts);
    }

    /**
     * Builder方法调用
     */
    public static void getBuilder()
    {
        NutritionFacts cocaCola= new NutritionFacts.Builder(240,8).calories(100).sodium(35).carbohydrate(27).build();
        System.out.println(cocaCola.getServingSize()+"\t"+cocaCola.getServings()+"\t"+cocaCola.getCalories()+"\t"+cocaCola.getSodium()+"\t"+cocaCola.getCarbohydrate());
        System.out.println(cocaCola.getClass());
    }


    /**
     * redis测试
     */
	public static void redis()
	{
		Jedis jedis = new Jedis("localhost");
		System.out.println("Connection to server sucessfully");
		//测试与服务器的连接
		System.out.println("Server is running: "+jedis.ping());
		jedis.set("li", "李");
		System.out.println("储存的值为："+jedis.get("li"));
	}

}
