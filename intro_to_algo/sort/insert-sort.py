def insert_sort(input_list):
    for i in range(len(input_list)):
        cur_value = input_list[i]
        j = i-1
        while input_list[j] > cur_value and j>=0:
            input_list[j+1] = input_list[j]
            j=j-1
        input_list[j+1] = cur_value
    return input_list

input_list = [5,4,3,2,1,0,-1,-1]

print(insert_sort(input_list))
