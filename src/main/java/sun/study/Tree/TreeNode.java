package sun.study.Tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

    private TreeNode leftNode;
    private TreeNode rightNode;
    public Object value;

    private void add(Object v){

        if (this.value == null)
            this.value = v;
        else{
            if ((int)this.value >= (int)v){
                if (leftNode == null)
                    leftNode = new TreeNode();

                leftNode.add(v);
            }else {
                if (rightNode == null)
                    rightNode = new TreeNode();

                rightNode.add(v);
            }
        }
    }

    private List<Object> values(){
        List<Object> valueList = new ArrayList<>();

        if (leftNode != null)
            valueList.addAll(leftNode.values());

        valueList.add(this.value);

        if (rightNode != null)
            valueList.addAll(rightNode.values());

        return valueList;
    }

    public static void main(String[] args){
        int[] aryInt = {1,8,253,8,8,2,4,0,3245,7,2,45,7,7};
        TreeNode tn = new TreeNode();

        for(int i:aryInt){
            tn.add(i);
        }

        System.out.println(tn.values());
    }
}
