package cn.lioyan.zookeeper.server.watch;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;


/**
 * {@link org.apache.zookeeper.server.watch.WatchManager}
 *<pre>
 *      {@link org.apache.zookeeper.server.watch.IWatchManager} 的实现
 *      内部维护两个map
 *         private final Map<String, Set<Watcher>> watchTable = new HashMap<>();    路径到 watcher 的映射
 *         private final Map<Watcher, Set<String>> watch2Paths = new HashMap<>();  watcher到路径的映射
 *         {@link   org.apache.zookeeper.server.watch.WatcherModeManager}  watcher 到 监听模式的映射
  *
 *  addWatch 添加监听
 *  removeWatcher 移除监听
 *  就是对这几个map 的编辑
 *
 *{@link org.apache.zookeeper.server.watch.WatchManager#triggerWatch(String, Watcher.Event.EventType)}
 *   根据路径，创建符合要求的 {@link WatchedEvent}  然后遍历，并执行{@link Watcher#process(WatchedEvent)}
 *
 *</pre>
 * @author com.lioyan
 * @date 2023/2/21  14:15
 */
public class WatchManager
{
}
