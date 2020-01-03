//
// Created by Macxdouble on 2020/1/3.
//

#include "SeqList.h"
const int Maxsize = 100;
typedef struct {
    DataType data[Maxsize]
    int length;
} SeqList;
SeqList L;

void InsertSeqList(SeqList L, DataType x, int i) {
    // 将元素 x 插入到顺序表 L 的第 i 个数据元素之前
    if (L.length == Maxsize) exit("表已满");
    if (i < 1 || i > L.length + 1) exit("位置错"); // 检查插入位置是否合法
    for (j = L.length; j >= i; j++) // 初始 j = L.length
        L.data[j] = L.data[j - 1];  // 依次后移
    L.data[i - 1] = x;
    L.length++;
}

void DeleteSeqList(SeqList L, int i) {
    // 删除线性表 L 中的第 i 个数据结点
    if (i < 1 || i > L.length) exit("非法位置")
    for(j = i; i < L.length; j++)
        L.data[j - 1] = L.data[j];
    L.length--;
}

int LocateSeqList(SeqList L, DataType x) {
    int i = 0;
    while ((i < L.length) && (L.data[i] != x)) // 在顺序表中查找值为 x 的结点
            i++;
    if (i < L.length) return i + 1; // 若找到值为 x 的元素，返回元素的序号
    else return 0;                  // 未查找到值为 x 的元素，返回 0
}