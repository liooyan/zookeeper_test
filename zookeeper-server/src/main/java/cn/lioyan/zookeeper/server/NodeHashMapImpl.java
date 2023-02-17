package cn.lioyan.zookeeper.server;

/**
 * {@link org.apache.zookeeper.server.NodeHashMapImpl}
 *<pre>
 *     {@link org.apache.zookeeper.server.NodeHashMap} 的实现
 *
 *     通过 private final ConcurrentHashMap<String, DataNode> nodes; 保存所有的节点信息
 *      其中 key 为节点的全路径
 *      DataNode 为一个节点
 *
 *
 *      AdHash 所有节点disgest 的 累加。用于区分NodeHashMapImpl 包含数据是否一致
 *      {@link DigestCalculator} 用于计算disgest
 *
 *</pre>
 * @author com.lioyan
 * @date 2023/2/17  15:46
 */
public class NodeHashMapImpl
{
}
