package cn.lioyan.zookeeper.server;

import org.apache.zookeeper.server.Request;
import org.apache.zookeeper.server.ZKDatabase;


/**
 * {@link org.apache.zookeeper.server.SyncRequestProcessor}
 *
 * <pre>
 *     处理具体的请求
 *
 * 1、 如果是需要写日志的操作就：调用{@link ZKDatabase#append(Request)} 先写日志
 *
 * 2、 否则调用下一个RequestProcessor
 * </pre>
 * @author com.lioyan
 * @date 2023/2/20  19:38
 */
public class SyncRequestProcessor
{
}
