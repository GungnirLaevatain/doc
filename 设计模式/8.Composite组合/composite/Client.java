package composite;

public class Client {
    public static void main(String[] args) {
        Department first = new ActualDepartment(0, "总裁办");
        Department two = new ActualDepartment(1, "研发部");
        Department three = new ActualDepartment(2, "人事部");
        Department four = new ActualDepartment(11, "云计算开发部");
        first.addSubordinate(two);
        first.addSubordinate(three);
        two.addSubordinate(four);
        first.logInfo();
    }
}
