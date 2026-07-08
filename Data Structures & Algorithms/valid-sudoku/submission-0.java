class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row = board.length;
        int column = board[0].length;
        List<HashSet<Integer>> rowData = new ArrayList<>();
        List<HashSet<Integer>> colData = new ArrayList<>();
        List<HashSet<Integer>> boxData = new ArrayList<>();
        for(int i=0;i<9;i++){
            rowData.add(new HashSet<>());
            colData.add(new HashSet<>());
            boxData.add(new HashSet<>());
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                int val = board[i][j];
                if(val=='.'){
                    continue;
                }
                if(rowData.get(i).contains(val)){
                    return false;
                }
                else{
                    rowData.get(i).add(val);
                }
                if(colData.get(j).contains(val)){
                    return false;
                }
                else{
                    colData.get(j).add(val);
                }
                // Calculate the sub-matrix index
                int idx = (i / 3) * 3 + (j / 3);
                if(boxData.get(idx).contains(val)){
                    return false;
                }
                else{
                    boxData.get(idx).add(val);
                }
            }
            
        }
        return true;
    }
}
