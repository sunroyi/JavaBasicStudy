package sun.study.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeNode {

    public TreeNode leftNode;
    public TreeNode rightNode;
    public Object value;

    public static void main(String[] args){

        int[] aryNumber = {1,6,4,8,9,130,6,848,132,0,6,6,6,6};

        TreeNode root = new TreeNode();

        for(int number:aryNumber){
            root.add(number);
        }

        System.out.println(root.values());
    }

    public void add(Object v){
        if (value == null)
            value = v;
        else{
            if ((Integer)v <= (Integer)value) {
                if (null == leftNode)
                    leftNode = new TreeNode();
                leftNode.add(v);
            }else {
                if (null == rightNode)
                    rightNode = new TreeNode();
                rightNode.add(v);
            }
        }
    }

    public List<Object> values(){

        List<Object> values = new ArrayList<>();

        if (leftNode != null)
            values.addAll(leftNode.values());

        values.add(value);

        if (rightNode != null)
            values.addAll(rightNode.values());

        return values;
    }
}
