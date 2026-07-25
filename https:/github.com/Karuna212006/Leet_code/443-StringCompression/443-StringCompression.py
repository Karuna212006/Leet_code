# Last updated: 7/25/2026, 2:19:18 PM
class Solution(object):
    def compress(self, chars):
        write = 0 
        read = 0 
        
        while read < len(chars):
            char = chars[read]
            count = 0
            
            while read < len(chars) and chars[read] == char:
                read += 1
                count += 1
                
            chars[write] = char
            write += 1
            
            if count > 1:
                for digit in str(count):
                    chars[write] = digit
                    write += 1
                    
        return write