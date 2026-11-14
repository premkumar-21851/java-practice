/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head)
{
    typedef struct ListNode *node;
    node temp1=head;
    node temp2;

    while(temp1!=NULL)
    {
        temp2=temp1->next;
        while(temp2!=NULL)
        {
            if(temp1->val==temp2->val)
            {
                node del=temp2;
                temp1->next=temp2->next;
                temp2=temp2->next;
                free(del);
            }
            else
            {
                temp2=temp2->next;
            }
        }
        temp1=temp1->next;
    }
        return head;
}