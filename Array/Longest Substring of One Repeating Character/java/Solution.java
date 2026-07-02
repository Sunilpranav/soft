class Solution {

    class Node {
        char leftChar;
        char rightChar;

        int prefix;
        int suffix;
        int longest;
        int len;
    }

    Node[] tree;
    char[] arr;

    public int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {

        int n = s.length();

        arr = s.toCharArray();

        tree = new Node[4 * n];

        for (int i = 0; i < tree.length; i++)
            tree[i] = new Node();

        build(1, 0, n - 1);

        int[] ans = new int[queryIndices.length];

        for (int i = 0; i < queryIndices.length; i++) {

            update(1, 0, n - 1,
                    queryIndices[i],
                    queryCharacters.charAt(i));

            ans[i] = tree[1].longest;
        }

        return ans;
    }

    private void build(int idx, int l, int r) {

        if (l == r) {

            tree[idx].leftChar = arr[l];
            tree[idx].rightChar = arr[l];
            tree[idx].prefix = 1;
            tree[idx].suffix = 1;
            tree[idx].longest = 1;
            tree[idx].len = 1;

            return;
        }

        int mid = (l + r) / 2;

        build(idx * 2, l, mid);
        build(idx * 2 + 1, mid + 1, r);

        merge(idx);
    }

    private void update(int idx, int l, int r, int pos, char ch) {

        if (l == r) {

            arr[pos] = ch;

            tree[idx].leftChar = ch;
            tree[idx].rightChar = ch;
            tree[idx].prefix = 1;
            tree[idx].suffix = 1;
            tree[idx].longest = 1;

            return;
        }

        int mid = (l + r) / 2;

        if (pos <= mid)
            update(idx * 2, l, mid, pos, ch);
        else
            update(idx * 2 + 1, mid + 1, r, pos, ch);

        merge(idx);
    }

    private void merge(int idx) {

        Node left = tree[idx * 2];
        Node right = tree[idx * 2 + 1];
        Node cur = tree[idx];

        cur.len = left.len + right.len;

        cur.leftChar = left.leftChar;
        cur.rightChar = right.rightChar;

        cur.prefix = left.prefix;

        if (left.prefix == left.len &&
                left.rightChar == right.leftChar) {

            cur.prefix += right.prefix;
        }

        cur.suffix = right.suffix;

        if (right.suffix == right.len &&
                left.rightChar == right.leftChar) {

            cur.suffix += left.suffix;
        }

        cur.longest = Math.max(left.longest, right.longest);

        if (left.rightChar == right.leftChar) {

            cur.longest = Math.max(
                    cur.longest,
                    left.suffix + right.prefix
            );
        }
    }
}