package cn.lioyan.zookeeper.server;

import org.apache.zookeeper.server.SessionTracker;


/**
 * {@link org.apache.zookeeper.server.SessionTrackerImpl}
 *<pre>
 *     Session 过期定时检查
 * 成员变量 ：sessionExpiryQueue 延时队列{@link org.apache.zookeeper.server.ExitCode}
 *
 * 定期检查方法：{@link org.apache.zookeeper.server.SessionTrackerImpl#run()}
 *     获取过期的key， 设置SessionImpl 为关闭，并执行{@link SessionTracker.SessionExpirer#expire}
 *      这里注入的是{@link ZooKeeperServer} 执行{@link org.apache.zookeeper.server.ZooKeeperServer#expire}
 {@link org.apache.zookeeper.server.SessionTrackerImpl#createSession(int)} 创建Session
 *
 *</pre>
 * @author com.lioyan
 * @date 2023/2/21  11:47
 */
public class SessionTrackerImpl
{
}
