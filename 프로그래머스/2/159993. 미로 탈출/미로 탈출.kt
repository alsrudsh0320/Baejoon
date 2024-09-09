
class Solution {
    var start_r = 0
    var start_c = 0
    var l_r = 0
    var l_c = 0
    var exit_r = 0
    var exit_c = 0
    val dr = arrayOf(0, 1, 0, -1)
    val dc = arrayOf(1, 0, -1, 0)

    fun scanMap(maps : Array<String>){
        maps.forEachIndexed{ index_r, it  ->
            it.forEachIndexed{ index_c, it ->
                if(it == 'S') {
                    start_r = index_r
                    start_c = index_c
                }
                if(it == 'E') {
                    exit_r = index_r
                    exit_c = index_c
                }
                if(it == 'L') {
                    l_r = index_r
                    l_c = index_c
                }
            }
        }
    }
    fun bfs(maps : Array<String>, start_r : Int, start_c : Int, end_r : Int, end_c : Int) : Int{
        val q = ArrayDeque<Array<Int>>()
        q.addLast(arrayOf(start_r, start_c, 0))
        val visited = Array(maps.size){BooleanArray(maps[0].length) {false}}
        visited[start_r][start_c] = true

        while(q.isNotEmpty()){
            val cur_v = q.removeFirst()
            if(cur_v[0] == end_r && cur_v[1] == end_c) return cur_v[2]

            for(i in 0 .. 3){
                val next_r = cur_v[0] + dr[i]
                val next_c = cur_v[1] + dc[i]
                if(next_r in maps.indices &&
                    next_c in maps[0].indices &&
                    maps[next_r][next_c] != 'X' ){
                    if(!visited[next_r][next_c]){
                        q.addLast(arrayOf(next_r, next_c, cur_v[2] + 1))
                        visited[next_r][next_c] = true
                    }
                }

            }

        }
        return -1

    }
    fun solution(maps: Array<String>): Int {
        scanMap(maps)
        val stol = bfs(maps, start_r, start_c, l_r, l_c )
        val ltoe = bfs(maps, l_r, l_c, exit_r, exit_c)
        if(stol == -1 || ltoe == -1) return -1
        return stol + ltoe
    }
}