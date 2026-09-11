                    return false;
                }
                char open = st.peek();
                if((ch == ')' && open != '(') || (ch == '}' && open != '{') || (ch == ']' && 
                open != '[')){
                    return false;
                }
                st.pop();
            }
        }
                return st.isEmpty();
    }
}
