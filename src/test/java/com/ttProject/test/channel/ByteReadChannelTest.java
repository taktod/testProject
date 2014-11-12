package com.ttProject.test.channel;

import java.nio.ByteBuffer;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.ttProject.nio.channels.ByteReadChannel;
import com.ttProject.nio.channels.IReadChannel;
import com.ttProject.util.BufferUtil;
import com.ttProject.util.HexUtil;

/**
 * ByteReadChannelの動作テスト
 * @author taktod
 */
public class ByteReadChannelTest {
	private Logger logger = Logger.getLogger(ByteReadChannelTest.class);
	@Test
	public void test() throws Exception {
		logger.info("テスト開始");
		byte[] buf = {(byte)0, (byte)1, (byte)2, (byte)3, (byte)4, (byte)5};
		IReadChannel channel = new ByteReadChannel(buf); // 000102030405
		BufferUtil.quickDispose(channel, 2); // 先頭の2byte捨てる
		ByteBuffer data = BufferUtil.safeRead(channel, 4); // 4バイト読み込む
		logger.info(HexUtil.toHex(data)); // 結果は02030405
	}
}
