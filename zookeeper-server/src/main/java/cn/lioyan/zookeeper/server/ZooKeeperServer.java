package cn.lioyan.zookeeper.server;

import org.apache.zookeeper.proto.RequestHeader;
import org.apache.zookeeper.server.RequestProcessor;
import org.apache.zookeeper.server.RequestRecord;
import org.apache.zookeeper.server.ServerCnxn;


/**
 * {@link org.apache.zookeeper.server.ZooKeeperServer}
 *  <pre>
 *      zookeeper服务，
 *
 * startup 初始化方法：
 *  {@link  org.apache.zookeeper.server.ZooKeeperServer#setupRequestProcessors}
 * 构建 RequestProcessors 链路，调用关系为 PrepRequestProcessor ---> SyncRequestProcessor ---> FinalRequestProcessor
 *
 *
 *
 *
 *  {@link ZooKeeperServer#processPacket(ServerCnxn, RequestHeader, RequestRecord)} 方法
 *  交给{@link  RequestProcessor} 处理
 *
 *
 *  </pre>
 * @author com.lioyan
 * @date 2023/2/20  18:38
 */
public class ZooKeeperServer
{
}
