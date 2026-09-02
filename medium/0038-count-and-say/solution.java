            StringBuilder current = new StringBuilder();
            int count = 1;

            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == result.charAt(j - 1)) {
                    count++;
                } else {
                    current.append(count);
                    current.append(result.charAt(j - 1));
                    count = 1;
                }
            }

            current.append(count);
