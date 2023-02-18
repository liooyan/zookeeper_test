package cn.lioyan.zookeeper.server;

import java.util.List;

/**
 * {@link org.apache.zookeeper.server.ReferenceCountedACLCache}
 * <pre>
 *     缓存所有阶段的acl，内部维护一个 自增id，在{@link  DataNode} 的acl 字段保存的就是这个id
 *     两个map
 *     final Map<Long, List<ACL>> longKeyMap = new HashMap<>();
 *
 *     final Map<List<ACL>, Long> aclKeyMap = new HashMap<>();
 *     分别维护两个各自的映射
 *
 *
 *方法：
 *   {@link org.apache.zookeeper.server.ReferenceCountedACLCache#convertAcls(List)} 添加新的acl 并返回id
 *   {@link org.apache.zookeeper.server.ReferenceCountedACLCache#convertLong} 通过id 获取acl
 *
 *
 *
 *
 * </pre>
 *
 */
public class ReferenceCountedACLCache {
}
