package composite;

/**
 * The class Department.
 * 部门接口
 *
 * @author GungnirLaevatain
 * @version 2019 -06-10 22:25:22
 * @since JDK 11
 */
public interface Department {
    /**
     * Gets id.
     * 部门的id
     *
     * @author GungnirLaevatain
     */
    int getId();

    /**
     * Add subordinate.
     * 增加从属部门
     *
     * @param department the department
     * @author GungnirLaevatain
     */
    void addSubordinate(Department department);

    /**
     * Remove subordinate.
     * 根据部门id移除从属部门
     *
     * @param id the id
     * @author GungnirLaevatain
     */
    void removeSubordinate(int id);

    /**
     * Log info.
     * 打印部门及从属部门信息
     *
     * @author GungnirLaevatain
     */
    void logInfo();
}
