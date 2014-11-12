package com.ttProject.test.bit;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.ttProject.nio.channels.ByteReadChannel;
import com.ttProject.nio.channels.IReadChannel;
import com.ttProject.unit.extra.BitLoader;
import com.ttProject.unit.extra.bit.Bit2;
import com.ttProject.unit.extra.bit.Bit3;

/**
 * BitLoaderの動作テスト
 * @author taktod
 */
public class BitLoaderTest {
	private Logger logger = Logger.getLogger(BitLoaderTest.class);
	@Test
	public void test() throws Exception {
		logger.info("テスト開始");
		Bit3 bitA = new Bit3();
		Bit2 bitB = new Bit2();
		Bit3 bitC = new Bit3();
		IReadChannel channel = new ByteReadChannel(new byte[]{(byte)0xC5});
		BitLoader loader = new BitLoader(channel);
		loader.load(bitA, bitB, bitC);
		logger.info(bitA);
		logger.info(bitB);
		logger.info(bitC);
	}
}
