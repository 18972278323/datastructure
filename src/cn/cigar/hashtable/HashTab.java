package cn.cigar.hashtable;



/**
 * 模拟散列表
 */
public class HashTab {

    private LinkedArrayList[] arrays;

    private int size;


    public HashTab(int size) {
        this.size = size;
        this.arrays = new LinkedArrayList[size];
    }

    /**
     * 当前散列表使用的哈希函数
     * @param id
     * @return
     */
    public int hashFunction(int id) {
        return id % this.size;
    }

    /**
     * 向链表中添加元素
     * @param employee
     */
    public void add(Employee employee) {
        int index = this.hashFunction(employee.getId());

        if (this.arrays[index] == null) {
            this.arrays[index] = new LinkedArrayList();
        }
        this.arrays[index].add(employee);
    }

    /**
     * 根据ID查询员工
     * @param id
     * @return
     */
    public Employee findById(int id) {
        int index = this.hashFunction(id);
        return this.arrays[index].find(id);
    }

    /**
     * 打印当前哈希表
     */
    public void list() {
        for (LinkedArrayList linkedArrayList : this.arrays) {
            linkedArrayList.list();
        }
    }

    /**
     * 依据ID删除数据
     * @param id
     */
    public Employee removeById(int id) {
        int index = this.hashFunction(id);

        return this.arrays[index].removeById(id);
    }
}

