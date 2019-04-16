/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution
 * Author:   Administrator
 * Date:     2019/4/1 21:22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import java.util.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/4/1
 * @since 1.0.0
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {

    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null)
            return  null;
        int length = 1;
        ListNode record=head;
        while ((head=head.next)!=null)
        {
            length++;

        }
        System.out.println(length);
        System.out.println(length-k);
        if(length>=k) {
            System.out.println("length>=k");
            for(int i=0;i<length-k;i++)
                record=record.next;
            return record;
        } else{   System.out.println("length<k");
            return null;

        }

    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        System.out.println(solution.FindKthToTail(head,4));
    }

}