def bad_version(n):
    index = n/2+1
    if (isBadVersion(index)):
        while isBadVersion(index-1):
            index -= 1
        return int(index)
    else:
        while not isBadVersion(index):
            index += 1
        return int(index)

def isBadVersion(version):
    if (version>=2):
        return True
    else:
        return False

print(bad_version(2))
print(bad_version(6))