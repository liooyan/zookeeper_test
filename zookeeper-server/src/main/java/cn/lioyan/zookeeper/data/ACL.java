package cn.lioyan.zookeeper.data;

/**
 * {@link org.apache.zookeeper.data.ACL}
 * <pre>
 *     zookeeper 的权限控制。 力度为每个节点
 *
 * 内容：
 *      perms：  控制不同的权限：
 *              create(c)：允许对子节点Create操作
 *              delete(d)：允许对子节点Delete操作
 *              read(r)：允许对本节点GetChildren和GetData操作，有对本节点进行删除操作的权限。
 *              write(w)：允许对本节点SetData操作
 *              admin(a)：允许对本节点setAcl操作
 *      scheme： 权限机制的模式：world、auth、digest、ip、super
 *      id：     限制的对象，根据scheme 不同，进行改变
 *
 * perms： 通过 5位进行控制，从 0-4位依次代表：READ | WRITE | CREATE | DELETE | ADMIN;
 * scheme 与 id 都为字符串；
 *      1：world,表示无限制，任何人都可以访问。ip固定为anyone
 *      2：auth，不需要任何id，只要是通过auth的用户都有权限。
 *      3：digest，Client端使用用户和密码的方式验证，采用username:BASE64(SHA1(password))的字符串作为节点ACL的id（如：digest:lyz:apNZxQYP6HbBQ9hRAibCkmPKGss=）
 *      4：ip:使用客户端的IP地址作为ACL的id，可以设置为一个ip段（如：ip:192.168.0.1/8）。Client端由IP地址验证，譬如172.2.0.0/24
 *      5:sasl:
 *
 *
 *
 *
 *
 *
 * </pre>
 *
 *
 */
public class ACL {
}
