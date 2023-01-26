class Solution {
public:
    ListNode* removeElements(ListNode* head, int val) {
        ListNode *answer = new ListNode(0);
        ListNode *curr = answer;

        while(head) {
            if(head -> val != val) {
                curr -> next = head;
                curr = head;
            }
            head = head -> next;
        }
        curr -> next = nullptr;
        return answer -> next;
    }
};