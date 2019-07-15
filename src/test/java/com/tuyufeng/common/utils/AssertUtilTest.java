package com.tuyufeng.common.utils;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * 
 * @ClassName: AssertUtilTest 
 * @Description: 单元测试类
 * @author:queen
 * @date: 2019年7月15日 上午8:52:37
 */
public class AssertUtilTest {

	@Test
	public void testIsTrue() {
      //	AssertUtil.isTrue(2>1, "断言为真--通过断言");	
       	AssertUtil.isTrue(2<1, "断言为真--不能通过断言");	
	}

	@Test
	public void testIsFalse() {
	//	AssertUtil.isFalse(1>2, "断言为假--通过断言");
		AssertUtil.isFalse(1<2, "断言为假--不能通过断言");
	}

	@Test
	public void testNotNull() {
	//	AssertUtil.notNull("123", "断言对象不为空--通过断言");
		AssertUtil.notNull(null, "断言对象不为空--不能通过断言");
	}

	@Test
	public void testIsNull() {
	//	AssertUtil.isNull(null, "断言对象必须空--通过断言");
		AssertUtil.isNull("123", "断言对象必须空--不能通过断言");
	}
	

	@Test
	public void testNotEmptyCollectionOfQString() {
		List  coll = new ArrayList();
	//	coll.add(1);
	//	AssertUtil.notEmpty(coll, "断言集合不为空，对象不能空，以及必须包含1个元素--通过断言");
		
		AssertUtil.notEmpty(coll, "断言集合不为空，对象不能空，以及必须包含1个元素--不能通过断言");
	}

	
	@Test
	public void testNotEmptyMapOfQQString() {
		Map map = new HashMap();
	//	map.put("name","张三");
    //     AssertUtil.notEmpty(map, "断言Map集合不为空，对象不能空，以及必须包含1个元素--通过断言");
         
      AssertUtil.notEmpty(map, "断言Map集合不为空，对象不能空，以及必须包含1个元素--不能通过断言");
	}

	
	@Test
	public void testHasText() {
	//	AssertUtil.hasText("123", "断言字符串必须有值--通过断言");
		
	  AssertUtil.hasText(null, "断言字符串必须有值--不能通过断言");
	}

	
	
	@Test
	public void testGreaterThanZero() {
		BigDecimal b = new BigDecimal("77.24");
	//	AssertUtil.greaterThanZero(b, "断言值必须大于0--通过断言");
		
		BigDecimal c = new BigDecimal("-77.24");
		AssertUtil.greaterThanZero(c, "断言值必须大于0--不能通过断言");
	}

}
