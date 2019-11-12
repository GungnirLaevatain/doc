package composite;

import java.util.LinkedList;
import java.util.List;

/**
 * The class Actual department.
 * 部门类
 *
 * @author GungnirLaevatain
 * @version 2019 -06-10 22:32:19
 * @since JDK 11
 */
public class ActualDepartment implements Department {

    /**
     * The Id.
     * 部门id
     */
    private int id;
    /**
     * The Name.
     * 部门名称
     */
    private String name;
    /**
     * The Subordinates.
     * 从属部门
     */
    private List<Department> subordinates;

    public ActualDepartment(int id, String name) {
        this.id = id;
        this.name = name;
        subordinates = new LinkedList<>();
    }

    /**
     * Gets id.
     * 部门的id
     *
     * @return int
     * 部门id
     * @author GungnirLaevatain
     */
    @Override
    public int getId() {
        return id;
    }

    /**
     * Add subordinate.
     * 增加从属部门
     *
     * @param department the department
     *                   部门信息
     * @author GungnirLaevatain
     */
    @Override
    public void addSubordinate(Department department) {
        subordinates.add(department);
    }

    /**
     * Remove subordinate.
     * 根据部门id移除从属部门
     *
     * @param id the id
     *           部门id
     * @author GungnirLaevatain
     */
    @Override
    public void removeSubordinate(int id) {
        for (int i = 0; i < subordinates.size(); i++) {
            if (subordinates.get(i).getId() == id) {
                subordinates.remove(i);
                return;
            }
        }
    }

    /**
     * Log info.
     * 打印部门及从属部门信息
     *
     * @author GungnirLaevatain
     */
    @Override
    public void logInfo() {
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        System.out.println("----------subordinates--------");
        subordinates.forEach(Department::logInfo);
    }
}
