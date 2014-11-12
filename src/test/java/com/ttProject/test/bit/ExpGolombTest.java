package com.ttProject.test.bit;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.ttProject.unit.extra.bit.Seg;
import com.ttProject.unit.extra.bit.Ueg;

/**
 * ExpGolombTest
 * @author taktod
 */
public class ExpGolombTest {
	private Logger logger = Logger.getLogger(ExpGolombTest.class);
	@Test
	public void test() {
		logger.info("テスト開始");
		Seg seg = new Seg();
		seg.set(5);
		logger.info(seg);
		logger.info(seg.get());
		Ueg ueg = new Ueg();
		ueg.set(5);
		logger.info(ueg);
		logger.info(ueg.get());
	}
}
