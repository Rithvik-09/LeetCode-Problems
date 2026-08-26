
        for(int i = 0;i<s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);

            if(sm[a] != tm[b]){
                return false;
            }

            sm[a] = i+1;
            tm[b] = i+1;
        }
    }
        return true;
