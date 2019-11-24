package sun.study.Netty.DecodeServer;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

// 数据转发,得到的string 可以经由该处理器转发出来
@ChannelHandler.Sharable
public class MsgClientHandler extends ChannelInboundHandlerAdapter {

    String name ;

    public MsgClientHandler(String name) {
        this.name = name;
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        String str = (String) msg;
        System.out.println("客户端收到:" + str);
        /**
         *  do any thing ....
         */
        //释放msg
        ReferenceCountUtil.release(msg);
    }

}