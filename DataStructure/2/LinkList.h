//
// Created by Macxdouble on 2020/1/7.
//

#ifndef ALGORITHMIC_LINKLIST_H
#define ALGORITHMIC_LINKLIST_H


typedef struct node {
    DataType data;
    struct node *next
} Node, *LinkList;

// 单链表插入运算
void InsertLinkList(LinkList head, DataType x, int i) {
    // 在表 head 的第 i 个数据元素结点之前插入一个以 x 为值的新结点
    Node *p, *q;
    if (i == 1) q = head;
    else q = GetLinklist(head, i -1); // 找第 i - 1 个数据元素结点
    if (q == NULL)
        exit("找不到插入的位置");
    else {
        p = malloc(sizeof(Node)); p -> data = x; // 生成新结点
        p -> next = q -> next;                  // 新结点链域指向 *q 的后继结点
        q -> next = p;                          // 修改 *q 的链域
    }
}

// 单链表删除运算
void DeleteLinkList(LinkList head, int i) {
    // 删除表 head 的第 i 个结点
    Node *q;
    if (i == 1) q = head;
    else q = GetLinklist(head, i - 1); // 先找待删结点的直接前驱
    // 若直接前驱存在且待删结点存在
    if (q != NULL && q -> next != NULL) {
        p = q -> next; // p 指向待删结点
        q -> next = p -> next; // 移出待删结点
        free(p);    // 释放已移出结点 p 的空间
    }
    else exit("找不到要删除的结点"); // 结点不存在
}

// 定位运算
void LocateLinkList(LinkList head, DataType x) {
    // 求表 head 中第一个值等于 x 的结点的序号，若不存在这种结点，返回结果为 0
    Node *p = head; // p 是工作指针
    p = p -> next; // 初始时 p 指向首结点
    int i = 0;
    while (p != NULL && p->data != x) { // 访问链表
        i++;
        p = p -> next;
    }
    if (p != NULL) return i + 1;
    else return 0;
}

#endif //ALGORITHMIC_LINKLIST_H
