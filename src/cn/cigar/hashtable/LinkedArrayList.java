package cn.cigar.hashtable;

import java.util.EnumMap;

public class LinkedArrayList {

    private Employee head;

    public LinkedArrayList() {
    }

    /**
     * 添加员工
     * @param e
     */
    public void add(Employee e) {

        if (this.head == null) {
            this.head = e;
        } else {
            Employee tmp = this.head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(e);
        }
    }

    /**
     * 查找员工
     * @param id 员工ID
     * @return
     */
    public Employee find(int id) {
        if (this.head.getId() == id) {
            return this.head;
        }

        Employee tmp = this.head;
        while (tmp.getNext() != null) {
            if (tmp.getNext().getId() == id) {
                return tmp.getNext();
            }
            tmp = tmp.getNext();
        }
        return null;
    }

    /**
     * 打印当前哈希表
     */
    public void list() {
        if (this.head == null) {
            System.out.println("空");
            return;
        }


        Employee tmp = this.head;
        StringBuilder builder = new StringBuilder(this.head.getName() + "===>");

        while (tmp.getNext() != null) {
            builder.append(tmp.getNext().getName());
            builder.append("===>");
            tmp = tmp.getNext();
        }
        builder.delete(builder.length() - 4, builder.length());
        System.out.println(builder);
    }

    /**
     * 删除ID对应的数据
     * @param id id
     */
    public Employee removeById(int id) {
        if (this.head == null) {
            return null;
        }

        if (this.head.getId() == id) {
            Employee target = this.head;
            this.head = this.head.getNext();
            return target;
        }

        Employee tmp = this.head;
        while (tmp.getNext() != null) {
            if (tmp.getNext().getId() == id) {
                Employee target = tmp.getNext();
                tmp.setNext(tmp.getNext().getNext());
                return target;
            }

            tmp = tmp.getNext();
        }
        return null;
    }
}
