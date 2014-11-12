package com.ttProject.test.util;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.ttProject.util.BufferUtil;
import com.ttProject.util.HexUtil;

/**
 * BufferUtilの動作テスト
 * @author taktod
 */
public class BufferUtilTest {
	private Logger logger = Logger.getLogger(BufferUtilTest.class);
	@Test
	public void test() throws Exception {
		logger.info("テスト開始");
		ReadableByteChannel channel = new FileInputStream("src/test/resources/test.txt").getChannel();
		ByteBuffer data = BufferUtil.safeRead(channel, 4);
		channel.close();
		logger.info(HexUtil.toHex(data));
	}
}
