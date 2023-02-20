package cn.lioyan.zookeeper.server.persistence;

import org.apache.jute.Record;
import org.apache.zookeeper.txn.TxnDigest;
import org.apache.zookeeper.txn.TxnHeader;

import java.io.File;
import java.util.zip.Checksum;


/**
 * {@link  org.apache.zookeeper.server.persistence.FileTxnLog}
 *<pre>
 *     {@link TxnLog} 的文件实现
 *     构造函数为{@link File} 对象，为文件夹
 *
 * 主要方法：
 *  {@link org.apache.zookeeper.server.persistence.TxnLog#append(TxnHeader, Record, TxnDigest)}
 *  TxnHeader ：
 *  Record ： 具体某个操作
 *  TxnDigest：
 *
 *  内部维护一个logStream 文件流，如果为空。就创建新的文件。
 *      文件名称 为 Zxid 最开始的值
 *  通过Record 向logStream  写数据
 *  在每个操作前都有{@link Checksum} 校验码
 *
 *
 *
 *  {@link org.apache.zookeeper.server.persistence.TxnLog#read(long)}
 *  读取日志文件结果为：{@link org.apache.zookeeper.server.persistence.TxnLog.TxnIterator} 类似一个迭代器
 *      主要有一个方法：{@link org.apache.zookeeper.server.persistence.TxnLog.TxnIterator#next()} 读取当前文件的下一个指令
 *                    通过{@link org.apache.zookeeper.server.persistence.FileTxnLog.FileTxnIterator#goToNextLog()} 切换一下一个文件
 *
 *
 *
 *  {@link org.apache.zookeeper.server.persistence.TxnLog#commit()}
 *  提交文件，判断当前文件是否需要切换新的文件
 *  通过参数 ：zookeeper.txnLogSizeLimitInKb 配置一个文件的最大容量，就关闭多余的流
 *
 *  如果 符合要求就调用{@link org.apache.zookeeper.server.persistence.TxnLog#rollLog}
 *      逻辑为设置 logStream = null ;等待append 创建
 *
 *</pre>
 * @author com.lioyan
 * @date 2023/2/20  16:49
 */
public class FileTxnLog
{
}
