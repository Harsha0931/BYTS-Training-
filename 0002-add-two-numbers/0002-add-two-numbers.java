class Solution {
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(); //creating a dummy node so that data can be stored
        ListNode temp = dummy;  //creating temp using dummy node
        int carry = 0 ;   //carry pointer
        while(list1!=null || list2!=null || carry!=0){ 
            int sum=0;
            if(list1!=null){
                sum+=list1.val;
                list1 = list1.next;
            }
            if(list2!=null){
                sum+=list2.val;
                list2 = list2.next;
            }
            sum+=carry;  //adding carry to the sum
            carry=sum/10;  //getting carry by sum, for 16 it will be 1

            ListNode ll = new ListNode(sum%10);  //adding leftover after taking carry in the new linked list, i.e from 16, 6 will be added in the linked list
            temp.next = ll;  //increasing the pointer of address so as to store the data
            temp = temp.next;  //continuing the iteration
        }
        return dummy.next; // dummy will be 0, therefore, we return dummy.next which is temp where first value is stored.
    }}