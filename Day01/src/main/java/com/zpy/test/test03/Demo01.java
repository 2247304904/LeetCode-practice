package com.zpy.test.test03;

import com.zpy.test.Demo;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * <p>
     * 计算完成整个抽检过程所需的最短时长
     *
     * @param goods int整型ArrayList 货物一维数组，元素是每件货物检查所需时长
     * @return int整型
     */
    public int minCheckDuration(ArrayList<Integer> goods) {
        // write code here
        int result = 0;
        int index = 0;
        for (int i = 0; i < goods.size(); i++) {
            if(i+2> goods.size()){
                break;
            }
            if(goods.get(i)<goods.get(i+1)){
                result += goods.get(i);
            }else {
                result += goods.get(i+1);
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        ArrayList<Integer> goods = new ArrayList<Integer>();
        goods.add(4);
        goods.add(9);
        goods.add(24);
        int i = demo01.minCheckDuration(goods);
        System.out.println(i);
    }
}
