package com.zpy.leetcode.learn;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.beanutils.ConvertUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 现有这么一个使用场景，用户做完习题练习后有一个习题记录列表，本地已有用户课程结构状态记录，
 * 需要更新用户课程结构的完成习题数、正确习题数及掌握知识点数。
 *
 * <p>
 * 课程结构是一个树状结构，知识点为此树状结构的叶子节点，(为方便理解以下称为树状结构)
 * 同一个知识点可以同时在不同的非叶子节点下，知识点关联了习题，
 * 并且习题可能关联多个知识点。
 * 习题答题记录数据结构的parents是这个树状结构id的去重集合。
 * </p>
 *
 * 完成习题数: 树状课程结构节点完成的习题个数。</br>
 * 正确习题数: 树状课程结构节点正确的习题个数。</br>
 * 掌握知识点数: 树状课程结构节点掌握的知识点个数(知识点正确习题数大于所有习题数的60%即为掌握)。</br>
 *
 * <p>已有两个方法获取树状结构id是否是知识点、树状结构节点关联的总题数和本地已有保存的用户树状结构记录</p>
 *
 * @see #getCourseNodes 获取树状结构id是否是知识点、树状结构节点关联的总题数
 * @see #getUserAnswerRecord 返回本地已有保存的用户树状结构记录
 * @see CourseNode 树状课程结构节点数据结构
 * @see AnswerRecord 习题答题记录数据结构
 * @see UserAnswerRecord 需要更新的树状结构的数据结构
 * @see #getUserAnswerRecords 面试者需要完成的方法
 */
public class UserExerciseRecord {

    /**
     * 请完成以下方法，实现以上功能
     *
     * @param records 答题记录集合
     * @return
     */
    public List<UserAnswerRecord> getUserAnswerRecords(List<AnswerRecord> records) {

        ArrayList<UserAnswerRecord> list = new ArrayList<>();
        //TODO 需要编写的逻辑
        return list;
    }

    /**
     * 树状结构(parents的中某个id)课程节点是否知识点及总题数 (无需编写这是已有方法)
     *
     * @param ids 树状结构id
     * @return
     */
    private List<CourseNode> getCourseNodes(long[] ids) {
        // 无需编写这是已有方法
        return new ArrayList<CourseNode>();
    }

    /**
     * 本地已有保存的用户树状结构记录 (无需编写这是已有方法)
     *
     * @param ids 树状结构id
     * @return
     */
    private List<UserAnswerRecord> getUserAnswerRecord(long[] ids) {
        // 无需编写这是已有方法
        return new ArrayList<UserAnswerRecord>();
    }

    /**
     * 习题答题记录数据结构
     */
    @Setter
    @Getter
    static class AnswerRecord {

        /**
         * 习题id
         */
        long id;
        /**
         * 这次答题是否正确
         */
        boolean correct;
        /**
         * 习题相关知识点及课程结构列表以逗号(,)分隔
         * parents字段是一个树状课程结构的id, 并且叶子定义为知识点, 习题可能关联多个知识点，parents是习题所有相关知识点id及其相关父节点id的去重集合
         */
        String parents;
        /**
         * 上次答题情况，-1从未做过，0上次做错，1上次正确
         */
        int last;
    }

    /**
     * 树状课程结构节点数据结构
     */
    @Setter
    @Getter
    static class CourseNode {

        /**
         * 节点id
         */
        long id;
        /**
         * 是否是知识点
         */
        boolean knowledge;
        /**
         * 节点拥有习题数
         */
        int exercisesCount;
    }

    /**
     * 需要更新课程结构的数据结构
     */
    @Setter
    @Getter
    static class UserAnswerRecord {
        /**
         * 课程结构id
         */
        long id;
        /**
         * 完成习题数
         */
        int completed = 0;
        /**
         * 正确习题数
         */
        int correct = 0;
        /**
         * 掌握知识点数
         */
        int master = 0;
    }
}

