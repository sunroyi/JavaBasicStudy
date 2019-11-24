package sun.study.Netty.DecodeServer;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;

import java.nio.charset.StandardCharsets;
import java.util.List;

// bytes -> string 解码器
@ChannelHandler.Sharable
public class BytesToStringDecoder extends MessageToMessageDecoder<ByteBuf> {
    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf msg, List<Object> out) throws Exception {
        //解码
        String str = msg.toString(StandardCharsets.UTF_8);

        out.add(str);
    }
}