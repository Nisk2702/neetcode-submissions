class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> rowSet = new HashSet<>();
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.') {
                    if (rowSet.contains(board[i][j])) {
                        return false;
                    }
                    rowSet.add(board[i][j]);
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            HashSet<Character> colSet = new HashSet<>();
            for (int j = 0; j < board[0].length; j++) {
                if (board[j][i] != '.') {
                    if (colSet.contains(board[j][i])) {
                        return false;
                    }
                    colSet.add(board[j][i]);
                }
            }
        }

        Map<String, Set<Character>> sqMap = new HashMap<>();
        HashSet<Character> sqSet = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            
            for (int j = 0; j < board[0].length; j++) {
                String samesq = (i / 3) + "," + (j / 3);
                if (board[i][j] == '.') continue;
                if (sqMap.get(samesq) != null && sqMap.get(samesq).contains(board[i][j])) {
                    return false;
                }

                if (sqMap.get(samesq) == null ){
                HashSet<Character> newSet = new HashSet<>();
newSet.add(board[i][j]);
sqMap.put(samesq, newSet);}
                else
                sqMap.get(samesq).add(board[i][j]);

            }
        }

        return true;
    }
}
