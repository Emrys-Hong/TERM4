import numpy as np
class Heap:
    def __init__(self, arr):
        self.n = len(arr)
        self.arr = arr

    def max_heapify(self, i):
        left_child = 2*i+1 # indexing is different in python
        right_child = 2*i+2
        max_position = i
        # comparing the left child
        if left_child < self.n:
            if self.arr[i] < self.arr[left_child]:
                max_position = left_child

        # comparing the right child
        if right_child < self.n:
            if self.arr[right_child] > self.arr[max_position]:
                max_position = right_child

        if max_position != i:
            temp = self.arr[i]
            self.arr[i] = self.arr[max_position]
            self.arr[max_position] = temp
            self.max_heapify(max_position)

    def max_heap(self):
        return self.arr[0]

    def extract_max(self):
        if self.n <= 0:
            return "overflowing"
        else:
            max_element = self.max_heap()
            self.arr[0] = self.arr[self.n-1]
            self.arr[self.n-1] = max_element
            self.n -= 1
            self.max_heapify(0)
            return 1

    @staticmethod
    def parent(i):
        return int((i-1)/2)

    def increase_key(self, i, key):
        if self.arr[i] > key:
            print( "error")
        else:
            self.arr[i] = key
            while i>0 and self.arr[Heap.parent(i)] < self.arr[i]:
                temp = self.arr[Heap.parent(i)]
                self.arr[Heap.parent(i)] = self.arr[i]
                self.arr[i] = temp
                i = Heap.parent(i)
            
    def insert_key(self, key):
        self.arr.append(-np.inf)
        self.n += 1
        self.increase_key(self.n-1, key)

    def build_max_heap(self):
        for i in range(int(self.n/2)-1, -1, -1):
            self.max_heapify(i)

    def heap_sort(self):
        self.build_max_heap()
        max_value = self.extract_max()
        while type(max_value) == int:
            max_value = self.extract_max()
        self.n = len(self.arr)
        return self.arr
    
array = list(range(15))
heap1 = Heap(array)
# print(heap1.heap_sort())
heap1.build_max_heap()
heap1.insert_key(50)
heap1.insert_key(25)
heap1.insert_key(26)
heap1.insert_key(30)
print(heap1.arr)