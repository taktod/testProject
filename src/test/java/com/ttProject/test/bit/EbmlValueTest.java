package com.ttProject.test.bit;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.ttProject.unit.extra.EbmlValue;

/**
 * matroskaのebmlValueの動作テスト
 * @author taktod
 */
public class EbmlValueTest {
	private Logger logger = Logger.getLogger(EbmlValueTest.class);
	@Test
	public void test() {
		logger.info("テスト開始");
		EbmlValue ebml = new EbmlValue();
		ebml.set(5);
		logger.info(ebml); // ビット表現 10000101
		logger.info(ebml.getEbmlValue()); // ebmlとしての数値表現(133)
		logger.info(ebml.get()); // 数値 5
		ebml.set(150);
		logger.info(ebml); // ビット表現 0100000010010110
		logger.info(ebml.getEbmlValue()); // ebmlとしての数値表現(16534)
		logger.info(ebml.get()); // 数値150
	}
}
