        }
        
        int n3 = n1 * n2;

        String result = "";

        while(n3 > 0){
            int digit = n3 % 10;
            result = (char)('0' + digit) + result;
            n3 = n3/10;
        }
    }
        return result;
}
