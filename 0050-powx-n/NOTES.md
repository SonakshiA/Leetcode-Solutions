Let ans = 1;

When the power is divisible by 2, we multiply x*x and reduce power by half
When power is odd, we multiply x by ans and reduce power by 1

2^10 = (2*2)^5, nn=5
4^5 = 4 * 4^4 and ans = 4, nn=4
4^4 = (4*4)^2
16^2 = (16*16)^1
256^1 = 4(ans=4)*256 and nn=0 
