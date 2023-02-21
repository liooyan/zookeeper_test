package cn.lioyan.zookeeper.server;

import org.apache.zookeeper.server.ServerCnxnFactory;
import org.apache.zookeeper.server.ZooKeeperServer;
import org.apache.zookeeper.server.admin.AdminServerFactory;
import org.apache.zookeeper.server.auth.ProviderRegistry;
import org.apache.zookeeper.server.persistence.FileTxnSnapLog;


/**
 * {@link org.apache.zookeeper.server.ZooKeeperServerMain}
 *<pre>
 *     单机环境下的 启动类，启动方法{@link  org.apache.zookeeper.server.ZooKeeperServerMain#runFromConfig}
 *
 *  1、{@link ProviderRegistry} 初始化认证类
 *  2、创建{@link FileTxnSnapLog}
 *  3、创建{@link ZooKeeperServer}
 *  4、创建并启动{@link AdminServerFactory#createAdminServer()}  8088 页面
 *  5、 创建 {@link ServerCnxnFactory#createFactory} 用于接收 2818 端口
         并调用 {@link ServerCnxnFactory#startup} 启动
 *
 *
 *</pre>
 * @author com.lioyan
 * @date 2023/2/21  14:29
 */
public class ZooKeeperServerMain
{
}
