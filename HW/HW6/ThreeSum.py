from typing import List
class ThreeSum:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        answer = []
        nums.sort()
        for i, value in enumerate(nums):
            left = i+1
            right = len(nums)-1
            if i>0 and nums[i-1]==value:
                continue
            while left<right:
                sum = value+nums[left]+nums[right]
                if sum>0:
                    right-=1
                elif sum<0:
                    left+=1
                else:
                    answer.append([value,nums[left],nums[right]])
                    left+=1
                    while left<right and nums[left]==nums[left-1]:
                        left+=1
            
        return answer

ts = ThreeSum()
print(ts.threeSum([-5,0,5,10,-10,0]))
print(ts.threeSum([0,1,1]))