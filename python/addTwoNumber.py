
# class Solution:
#     def addTwoNumbers(self, l1, l2):
#       if len(l1) >= len(l2):
#         result = []
#         previous_big_than_10 = False
#         for i in range(len(l1)):
#           if i < len(l2):
#             result.append(l1[i]+l2[i])
#             if l1[i]+l2[i] > 9:
#               previous_big_than_10=True
#             else:
#               previous_big_than_10 = False
#           else:
#             result.append(l1[i])
#           if previous_big_than_10:
#             result[i] = result[i] + 1
#         return result
# Solution().addTwoNumbers([1,2,3],[1,2])
