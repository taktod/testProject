package com.ttProject.test.util;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.ttProject.util.HexUtil;

/**
 * HexUtilの動作テスト
 * @author taktod
 */
public class HexUtilTest {
	private Logger logger = Logger.getLogger(HexUtilTest.class);
	@Test
	public void test() {
		logger.info("テスト開始");
		byte[] data = {(byte)0, (byte)26};
		logger.info(HexUtil.toHex(data));
	}
}
