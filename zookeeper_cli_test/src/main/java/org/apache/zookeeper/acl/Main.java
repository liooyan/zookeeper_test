package org.apache.zookeeper.acl;

import org.apache.zookeeper.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, KeeperException {
        // 创建一个与服务器的连接 需要(服务端的 ip+端口号)(session过期时间)(Watcher监听注册)
        ZooKeeper zk = new ZooKeeper("127.0.0.1:2181", 3000, new Watcher() {
            // 监控所有被触发的事件
            public void process(WatchedEvent event) {
                System.out.println(event.toString());
            }
        });
        System.out.println("OK!");
        /**
         * CreateMode:
         *       PERSISTENT (持续的，相对于EPHEMERAL，不会随着client的断开而消失)
         *       PERSISTENT_SEQUENTIAL（持久的且带顺序的）
         *       EPHEMERAL (短暂的，生命周期依赖于client session)00933
         *       EPHEMERAL_SEQUENTIAL  (短暂的，带顺序的)
         */
        zk.create("/path03/test", "data01".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        zk.delete("/path03/test",0);
        Thread.sleep(100000);


    }
}