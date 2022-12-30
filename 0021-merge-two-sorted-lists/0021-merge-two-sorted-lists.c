/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
typedef struct ListNode Node; 

struct ListNode* mergeTwoLists(struct ListNode* l1, struct ListNode* l2){
    Node *result = NULL, *tail = NULL;

    if(l1==NULL) return l2;
    if(l2==NULL) return l1;

    if(l1-> val <=l2->val)
    {
        tail = result = l1;
        l1 = l1 ->next; 

    } 
    else 
    {
        tail = result = l2;
        l2 = l2->next; 

    } 
    while(l1!=NULL && l2 != NULL)
    {
        if(l1->val <= l2 -> val)
        {
            tail ->next = l1;
            tail = tail ->next; 
            l1 = l1 -> next;
        } 
        else 
        {
            tail -> next = l2; 
            tail = tail -> next;
            l2 = l2 -> next;
        }  
    }
            if(l1==NULL) tail ->next = l2;
            if(l2 == NULL ) tail -> next = l1; 
            return result;
}