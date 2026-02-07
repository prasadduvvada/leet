class Solution {
    public int myAtoi(String s) {
               s=s.trim();
        if(s.isEmpty()) return 0;
        int sign =1;
        int j=0;
        if(s.charAt(0) == '-'){
        sign = -1;
        j =1;
    }
    else if(s.charAt(0) == '+'){
        j=1;
    }

     long result =0;
        for(int i=j; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!(Character.isDigit(ch))) break;
                int num =  ch - '0';
                result = (result * 10)+ num;
                // 4. Handle Overflow (If the number is too big for an int)
            if (sign == 1 && result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && result * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }
            return (int) result * sign;
    }

    }