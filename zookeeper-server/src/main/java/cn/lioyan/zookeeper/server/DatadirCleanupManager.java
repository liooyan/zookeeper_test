package cn.lioyan.zookeeper.server;

import org.apache.zookeeper.server.PurgeTxnLog;

import java.io.File;


/**
 * {@link org.apache.zookeeper.server.DatadirCleanupManager}
 * <pre>
 *     快照与日志 定时清理类
 * 主要参数
 *         this.snapDir = snapDir;  快照路径
 *         this.dataLogDir = dataLogDir; 日志路径
 *         this.snapRetainCount = snapRetainCount; 快照保留数量
 *         this.purgeInterval = purgeInterval;  定时检查间隔事件
 *
 *  启一个定时任务，定期执行
 *  最后调用 {@link PurgeTxnLog#purge(File, File, int)} 检查与删除多余日志
 *
 *
 *
 * </pre>
 * @author com.lioyan
 * @date 2023/2/21  11:35
 */
public class DatadirCleanupManager
{
}
