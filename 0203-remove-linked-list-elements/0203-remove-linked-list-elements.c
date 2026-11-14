/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeElements(struct ListNode* head, int val)
{
    typedef struct ListNode *node;
    node temp;
    if(head==NULL)
    return head;

    temp=head;
    node prev=NULL;

    while(temp!=NULL)
    {
        if(temp->val==val)
        {
            node del = temp;
            if(prev==NULL)
            {
                head=temp->next;
            }
            else
            {
                prev->next=temp->next;
            }
            temp=temp->next;
            free(del);
        }
        else
        {
            prev=temp;
            temp=temp->next;
        }
    }
    return head;
}