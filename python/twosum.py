# import math

class Solution():
  def twoSum(self, nums, target):
      a = 0
      b = 1
      # for i in range(round(len(nums)*(len(nums)-1)*0.5)):
      while True:
          if nums[a] + nums[b] == target:
            return [a,b]
          print('a:'+str(a) + ', b:'+str(b))
          if b==(len(nums)-1):
            a+=1
            b=a+1
          else:
            b+=1
print(Solution().twoSum([2,5,0,3,1,8,8],16))
