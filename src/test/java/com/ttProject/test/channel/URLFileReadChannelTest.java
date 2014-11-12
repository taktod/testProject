package com.ttProject.test.channel;

import java.nio.ByteBuffer;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.ttProject.nio.channels.FileReadChannel;
import com.ttProject.nio.channels.IReadChannel;
import com.ttProject.util.BufferUtil;
import com.ttProject.util.HexUtil;

/**
 * URLFileReadChannelTest
 * @author taktod
 */
public class URLFileReadChannelTest {
	private Logger logger = Logger.getLogger(URLFileReadChannelTest.class);
	@Test
	public void test() throws Exception {
		logger.info("テスト開始");
		IReadChannel channel = FileReadChannel.openFileReadChannel(
				"http://www.gnu.org/licenses/gpl-3.0.txt"
		);
		BufferUtil.quickDispose(channel, 20); // 20byte捨てる
		ByteBuffer data = BufferUtil.safeRead(channel, 4);
		logger.info(HexUtil.toHex(data)); // 474E5520 [GNU ]が取得できる
	}
}
