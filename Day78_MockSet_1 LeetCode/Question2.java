class Question2 {
    public int countSubMatrices(int[][] mat, int a, int b) {
        int r=mat.length, c=mat[0].length;
        int bound=c, count=0;
        for(int i=a; i<r; i++) {
            for(int j=b; j<bound; j++) {
                if(mat[i][j]==1) count++;
                else bound=j;
            }
        }
        return count;
    }
    public int numSubmat(int[][] mat) {
        int r=mat.length, c=mat[0].length;
        int res=0;
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                res+=countSubMatrices(mat,i,j);
            }
        }
        return res;
    }
}