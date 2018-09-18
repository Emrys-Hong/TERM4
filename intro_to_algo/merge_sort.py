def merge_sort(input_list):
    length = len(input_list) 
    if length == 1:
        return input_list
    else:
        return merge(merge_sort(input_list[:int(length/2)]), merge_sort(input_list[int(length/2):]))

def merge(list1, list2):
    out = []
    while len(list1) > 0 and len(list2) > 0:
        if list1[0] < list2[0]:
            out.append(list1.pop(0))
        else:
            out.append(list2.pop(0))
            
    out.extend(list1)
    out.extend(list2)
    return out
print(merge_sort([10,9,4,5,6,7,8,10,23,7,7,5,6,1,-3,0]))

