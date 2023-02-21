package cn.lioyan.zookeeper.server;

import org.apache.jute.Record;
import org.apache.zookeeper.server.DataTree;
import org.apache.zookeeper.txn.TxnDigest;
import org.apache.zookeeper.txn.TxnHeader;


/**
 * {@link org.apache.zookeeper.server.ZKDatabase}
 *<pre>
 *     维护zk的内存数据，以及 日志提交、读取和快照的保存、加载
 *
 *
 * {@link org.apache.zookeeper.server.ZKDatabase#processTxn}
 *      操作 zk内存数据，调用{@link DataTree#processTxn}
 *
 *</pre>
 * @author com.lioyan
 * @date 2023/2/21  9:43
 */
public class ZKDatabase
{
}
