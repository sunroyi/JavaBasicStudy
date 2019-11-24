package sun.study.Netty.TestServerNeedNetty5;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.ReferenceCountUtil;

// 客户端业务处理类
// (编写主要的业务逻辑)
public class ClientHandler extends ChannelHandlerAdapter {
    // ByteBuf是一个引用计数对象，这个对象必须显示地调用release()方法来释放。
    // 请记住处理器的职责是释放所有传递到处理器的引用计数对象。
    //@Override // 这是netty5的方法
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception
    {
        try{
            // 接收服务端发来的数据 ByteBuf
            ByteBuf buf = (ByteBuf)msg;
            // 创建一个和buf一样长度的字节空数组
            byte[] data = new byte[buf.readableBytes()];
            // 将buf中的数据读取到data数组中
            buf.readBytes(data);
            // 将data数组进行包装，以String格式输出
            String response = new String(data, "utf-8");
            System.out.println("Client:" + response);

            ctx.close();
        }finally{
            ReferenceCountUtil.release(msg);
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception
    {
        cause.printStackTrace();
        ctx.close();
    }
}
