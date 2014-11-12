package com.ttProject.test.bit;

import java.nio.ByteBuffer;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.ttProject.unit.extra.BitConnector;
import com.ttProject.unit.extra.bit.Bit2;
import com.ttProject.unit.extra.bit.Bit3;
import com.ttProject.util.HexUtil;

/**
 * BitConnetorの動作テスト
 * @author taktod
 */
public class BitConnectorTest {
	private Logger logger = Logger.getLogger(BitConnectorTest.class);
	@Test
	public void test() throws Exception {
		logger.info("動作テスト");
		Bit3 bitA = new Bit3(6);
		Bit2 bitB = new Bit2(0);
		Bit3 bitC = new Bit3(5);
		BitConnector connector = new BitConnector();
		ByteBuffer buf = connector.connect(bitA, bitB, bitC);
		logger.info(HexUtil.toHex(buf));
	}
}
