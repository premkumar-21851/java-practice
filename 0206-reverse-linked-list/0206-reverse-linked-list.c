/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    typedef struct ListNode *node;
    node prev,current,nextnode;

    prev=NULL;
    current=head;
    nextnode=head;

    while(nextnode!=NULL)
    {
        nextnode=nextnode->next;
        current->next=prev;
        prev=current;
        current=nextnode;
    }
    return prev;
}