package cn.lioyan.zookeeper.server;

import org.apache.zookeeper.server.NIOServerCnxn;

import java.nio.channels.SelectionKey;


/**
 * {@link org.apache.zookeeper.server.NIOServerCnxnFactory}
 *<pre>
 * {@link ServerCnxnFactory}的nio实现
 * 两个子类：{@link  org.apache.zookeeper.server.NIOServerCnxnFactory.AcceptThread} 监听 端口，有链接请求，交给 {@link org.apache.zookeeper.server.NIOServerCnxnFactory.SelectorThread}
 * 
 * SelectorThread 处理 链接事件，如果有读写事件
 * 在新的线程池中调用：{@link NIOServerCnxn#doIO(SelectionKey)}
 * 
 * 
 * </pre>
 * @author com.lioyan
 * @date 2023/2/20  17:50
 */
public class NIOServerCnxnFactory
{
}
