def twosum(nums, target):
    map = {}
    for i in range(len(nums)):
        if target - nums[i] in map:
            return [i, map[target - nums[i]]]
        else:
            map[nums[i]] = i

print(twosum([5,8,2,3], 13))