package com.jwl.Trustworthiness;

import java.lang.reflect.Array;
import java.util.*;

/**
 * 给定一个二叉树，返回它的中序 遍历。
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * 输出: [1,3,2]
 */
public class Test94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] split = str.split(",");
        List<String> list = Arrays.asList(split);
        System.out.println(list);
    }
}
