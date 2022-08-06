/**
<p>给定一个非负整数&nbsp;<em><code>numRows</code>，</em>生成「杨辉三角」的前&nbsp;<em><code>numRows</code>&nbsp;</em>行。</p>

<p><small>在「杨辉三角」中，每个数是它左上方和右上方的数的和。</small></p>

<p><img alt="" src="https://pic.leetcode-cn.com/1626927345-DZmfxB-PascalTriangleAnimated2.gif" /></p>

<p>&nbsp;</p>

<p><strong>示例 1:</strong></p>

<pre>
<strong>输入:</strong> numRows = 5
<strong>输出:</strong> [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
</pre>

<p><strong>示例&nbsp;2:</strong></p>

<pre>
<strong>输入:</strong> numRows = 1
<strong>输出:</strong> [[1]]
</pre>

<p>&nbsp;</p>

<p><strong>提示:</strong></p>

<ul>
 <li><code>1 &lt;= numRows &lt;= 30</code></li>
</ul>

<div><div>Related Topics</div><div><li>数组</li><li>动态规划</li></div></div><br><div><li>👍 796</li><li>👎 0</li></div>
*/

package top.lan_mao.computer_world.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2019-present lan-mao.top
 * ComputerWorld is licensed under Mulan PSL v2.
 * You can use this software according to the terms and conditions of the Mulan PSL v2.
 * You may obtain a copy of Mulan PSL v2 at: <a href="http://license.coscl.org.cn/MulanPSL2">http://license.coscl.org.cn/MulanPSL2</a>
 * THIS SOFTWARE IS PROVIDED ON AN "AS IS" BASIS, WITHOUT WARRANTIES OF ANY KIND, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO NON-INFRINGEMENT, MERCHANTABILITY OR FIT FOR A PARTICULAR PURPOSE.
 * See the Mulan PSL v2 for more details.
 * <p>
 * Create Date 2022-07-23 07:53:32 <br>
 * Leetcode信息：
 *  标题：杨辉三角
 *  编号：118
 * @author lan-mao.top <br>
 * @version 1.0 <br>
 */

public class pascals_triangle{
    public static void main(String[] args) {
        Solution solution = new pascals_triangle().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        int[] temp = new int[numRows];
        int[] now = new int[numRows];

        temp[0] = 1;
        List<Integer> temp2 = new ArrayList<>();
        temp2.add(1);
        result.add(temp2);

        for (int i = 1; i < numRows; i++) {
            List<Integer> temp3 = new ArrayList<>();
            now[0] = now[i] = temp[i] = 1;
            temp3.add(1);
            for (int j = 1; j < i; j++) {
                now[j] = temp[j - 1] + temp[j];
                temp[j - 1] = now[j - 1];
                temp3.add(now[j]);
            }
            temp[i - 1] = now[i - 1];
            temp3.add(1);
            result.add(temp3);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}