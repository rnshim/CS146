map = {}
def fib(n: int):
    if n==0:
        return 0
    if n==1:
        return 1
    if n in map:
        return map[n]
    
    fibnum = fib(n-1)+fib(n-2)
    map[n]=fibnum
    return fibnum

print(fib(15))
print(fib(3))