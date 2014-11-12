package com.ttProject.test.channel;

import java.nio.ByteBuffer;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.ttProject.nio.channels.FileReadChannel;
import com.ttProject.nio.channels.IReadChannel;
import com.ttProject.util.BufferUtil;
import com.ttProject.util.HexUtil;

/**
 * FileReadChannelの動作テスト
 * @author taktod
 */
public class FileReadChannelTest {
	private Logger logger = Logger.getLogger(FileReadChannelTest.class);
	@Test
	public void test() throws Exception {
		logger.info("テスト開始");
		IReadChannel channel = FileReadChannel.openFileReadChannel(
				"src/test/resources/test.txt"
		);
		ByteBuffer data = BufferUtil.safeRead(channel, 4);
		logger.info(HexUtil.toHex(data));
	}
}
