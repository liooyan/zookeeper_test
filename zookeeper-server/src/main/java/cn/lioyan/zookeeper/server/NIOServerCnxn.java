package cn.lioyan.zookeeper.server;

import org.apache.zookeeper.proto.RequestHeader;
import org.apache.zookeeper.server.RequestRecord;
import org.apache.zookeeper.server.ServerCnxn;

import java.nio.channels.SelectionKey;


/**
 * {@link org.apache.zookeeper.server.NIOServerCnxn}
 *<pre>
 *     网络链接的处理过程
 *   {@link org.apache.zookeeper.server.NIOServerCnxn#doIO(SelectionKey)}
 *     这里读取数据，前4个字节为长度，后面为内容
 //TODO 待完成
 *     readConnectRequest 首次连接
 *
 *
 *     readRequest 具体请求
 *
 *    分支为 {@link RequestHeader} 有两个值
 *      xid：
 *      type：
 *    之后调用 {@link ZooKeeperServer#processPacket(ServerCnxn, RequestHeader, RequestRecord)} 方法
 *
 *     
 *</pre>
 * @author com.lioyan
 * @date 2023/2/20  18:15
 */
public class NIOServerCnxn
{
}
