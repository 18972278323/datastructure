package cn.cigar.hashtable;

public class HashTest {


    public static void main(String[] args) {
        HashTab hashTab = new HashTab(3);

        // 增
        hashTab.add(new Employee(1, "张三"));
        hashTab.add(new Employee(2, "李四"));
        hashTab.add(new Employee(3, "王五"));
        hashTab.add(new Employee(4, "赵六"));
        hashTab.add(new Employee(6, "田七"));
        hashTab.add(new Employee(7, "孙八"));

        // 查
        hashTab.list();

        // 查
        Employee employee = hashTab.findById(1);
        System.out.println(employee);

        // 删除
        Employee remove = hashTab.removeById(7);
        System.out.println(remove);

        hashTab.list();

    }

}
