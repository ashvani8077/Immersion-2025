import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String mat[][] = new String[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                mat[i][j] = sc.next();
            }
        }

        List<String> set = new ArrayList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(!mat[i][j].equals("wall")){
                    dfs(mat, i, j, new boolean[n][m], new StringBuilder(), set);
                }
            }
        }

        int idx = 0;
        int size = 0;
        for(int i = 0; i < set.size(); i++){
            if(set.get(i).length() > size){
                size = set.get(i).length();
                idx = i;
            }
        }

        if(size == 0){
            System.out.print("null");
            return;
        }

        StringBuilder sb = new StringBuilder();
        String ar[] = set.get(idx).split(" ");
        for(int i = 0; i < ar.length; i++){
            sb.append(ar[i]);
            if(i == ar.length - 1){
                break;
            }
            sb.append(" -> ");
        }

        System.out.print(sb);
    }

    public static void dfs(String arr[][], int r, int c, boolean vis[][], StringBuilder sb, List<String> lst){
        if(r < 0 || r >= arr.length || c < 0 || c >= arr[0].length || vis[r][c]){
            return;
        }

        if(arr[r][c].equals("wall")){
            return;
        }

        lst.add(sb.toString());
        vis[r][c] = true;
        sb.append(arr[r][c]);
        sb.append(" ");

        dfs(arr, r - 1, c, vis, sb, lst); // up
        dfs(arr, r + 1, c, vis, sb, lst); // down
        dfs(arr, r, c - 1, vis, sb, lst); // left
        dfs(arr, r, c + 1, vis, sb, lst); // right

        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(sb.length() - 1);
        vis[r][c] = false;
    }
}
