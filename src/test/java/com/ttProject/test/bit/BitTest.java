package com.ttProject.test.bit;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.ttProject.unit.extra.bit.Bit1;
import com.ttProject.unit.extra.bit.Bit10;
import com.ttProject.unit.extra.bit.Bit5;

/**
 * Bitの動作テスト
 * @author taktod
 *
 */
public class BitTest {
	private Logger logger = Logger.getLogger(BitTest.class);
	@Test
	public void test() {
		logger.info("テスト開始");
		Bit1 bit1 = new Bit1(0);
		logger.info(bit1); // ビット表現0
		bit1 = new Bit1(1);
		logger.info(bit1); // ビット表現1
		Bit5 bit5 = new Bit5(8);
		logger.info(bit5); // ビット表現 01000
		bit5 = new Bit5(10);
		logger.info(bit5); // ビット表現 01010
		Bit10 bit10 = new Bit10(300);
		logger.info(bit10); // ビット表現 0100101100
		logger.info(bit10.get()); // 数値の取り出し
	}
}
