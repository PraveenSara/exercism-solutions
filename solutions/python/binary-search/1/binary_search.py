def find(search_list, value):
    
        

    start_ind = 0
    end_ind = len(search_list) - 1
    
    while start_ind <= end_ind:
        mid = (end_ind + start_ind) // 2

        if search_list[mid] == value:
            return mid

        if search_list[mid] < value:
            start_ind = mid + 1
            
        if search_list[mid] > value:
            end_ind = mid - 1

    raise ValueError("value not in array")
    
