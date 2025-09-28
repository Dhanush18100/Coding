def remove_duplicate(user_ids):
    user_ids.sort()
    unique_ids = []
    prev = None
    for i in user_ids:
        if i != prev:
            unique_ids.append(i)
        prev = i
    return unique_ids

user_id=[1,1,1,3,4,3,2,1]
print(remove_duplicate(user_id))