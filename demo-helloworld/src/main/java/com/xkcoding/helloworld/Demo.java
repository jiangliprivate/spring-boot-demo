package com.xkcoding.helloworld;

public class Demo {
    /**
     * 该函数用于将两个已排序的整数数组合并为一个新数组。数组a的长度为m，数组b的长度为n。合并后的数组应保持排序顺序，并返回合并后的数组。
     * 输入参数：
     * a：已排序的整数数组a。
     * m：数组a中的有效元素数量。
     * b：已排序的整数数组b。
     * n：数组b中的有效元素数量。
     * 返回值：返回一个合并后的已排序整数数组
     */
    public static int[] merge(int[] a, int m, int[] b, int n) {
        // 校验输入参数是否为null
        if (a == null || b == null) {
            throw new NullPointerException("Input arrays must not be null.");
        }
        // 校验m和n的值是否合理
        if (m < 0 || n < 0 || m > a.length || n > b.length) {
            throw new IllegalArgumentException("Invalid length parameters 'm' and 'n'.");
        }

        // 创建合并后的数组
        int[] c = new int[m + n];

        // 定义指针指向a和b的末尾，开始合并操作
        int i = m - 1; // 指向a的最后一个元素
        int j = n - 1; // 指向b的最后一个元素
        int k = m + n - 1; // 指向c的最后一个位置

        // 从后往前遍历数组a和b，将较大的元素依次放入c的末尾
        while (i >= 0 && j >= 0) {
            if (a[i] >= b[j]) {
                c[k] = a[i];
                i--;
            } else {
                c[k] = b[j];
                j--;
            }
            k--;
        }

        // 如果数组b还有剩余元素，说明剩余元素都比a中当前最小的元素小，直接将它们加入c的前面
        while (j >= 0) {
            c[k] = b[j];
            j--;
            k--;
        }

        // 如果数组a还有剩余元素，情况同上，但由于java中范围判断方式，这里不需要额外的while循环
        // 因为上面的循环已经确保了所有元素都被正确处理

        return c;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 10};
        int[] c = merge(a, 5, b, 5);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();

        //生成一个随机数
        int[] d = new int[10];
    }
}
