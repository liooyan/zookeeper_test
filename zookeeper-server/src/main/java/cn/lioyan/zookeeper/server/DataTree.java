package cn.lioyan.zookeeper.server;

import org.apache.zookeeper.server.watch.IWatchManager;

import java.util.List;

/**
 * {@link org.apache.zookeeper.server.DataTree}
 * <pre>
 * 封装 节点基本操作方法
 * 成员变量：
 *    {@link org.apache.zookeeper.server.NodeHashMap} 存储节点信息
 *    {@link ReferenceCountedACLCache} 存储acl信息
 *    两个 {@link IWatchManager} 分别监听 节点与字节事件
 *
 *
 * {@link org.apache.zookeeper.server.DataTree#processTxn}
 *  通过 不同的Txn 执行不同的操作，参数
 *  header 通用的请求头，包括type 操作类型 zxid、cxid
 *  txn 具体的操作参数
 *
 *
 *
 *
 *
 *
 *
 * {@link org.apache.zookeeper.server.DataTree#createNode(String, byte[], List, long, int, long, long)}
 *    创建新的节点，这里只能创建父节点已经存在的节点
 *     首先创建{@link DataNode} 对象
 *     填充基本信息与acl数据
 *     获取父节点，同时需要修改父节点基础信息，如版本号，时间戳
 *     在{@link NodeHashMap }添加新创建的数据
 *
 *      这里加了锁， 锁是 父节点路径，
 *
 *      最后将事件添加在{@link IWatchManager}对象
 *
 *
 *
 * {@link org.apache.zookeeper.server.DataTree#deleteNode(String, long)}
 * 节点删除。 与创建基本一直，添加了什么，就对应删除什么
 *
 *
 *
 *
 *
 * </pre>
 *
 */
public class DataTree {
}
