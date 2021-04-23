package com.qianerba.earth.data_structure;

import java.util.Objects;

/**
 * @author qianerba
 * @create 2021/4/23
 * @describe desc your class
 */
public class Solution {

    public static void main(String[] args) {
        /*int[] nums = {2, 3, 1, 0, 2, 5, 3};*/
        int[][] nums = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };
        System.out.println(checkTargetExist(nums, 8));
    }

    /**
     * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
     * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一
     * 个整数，判断数组中是否含有该整数
     *
     * @param twoDimArray
     * @param target
     * @return
     */
    public static boolean checkTargetExist(int[][] twoDimArray, int target) {
        int rowIndex = 0;
        int columnIndex = twoDimArray[0].length - 1;

        while (columnIndex >= 0 && rowIndex < twoDimArray.length) {
            if (twoDimArray[rowIndex][columnIndex] == target) {
                return true;
            } else if (twoDimArray[rowIndex][columnIndex] > target) {
                columnIndex = columnIndex - 1;
            } else {
                rowIndex = rowIndex + 1;
            }
        }
        return false;
    }

    /**
     * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
     * 数组中某些数字是重复的，但不知道有几个数字是重复的。
     * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字
     *
     * @param nums
     * @return
     */
    public static int findAnyoneRepeatNumber(int[] nums) {
        if (Objects.isNull(nums) || nums.length < 2) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                } else {
                    int tmp = nums[i];
                    nums[i] = nums[tmp];
                    nums[tmp] = tmp;
                }
            }
        }
        return -1;
    }
}
