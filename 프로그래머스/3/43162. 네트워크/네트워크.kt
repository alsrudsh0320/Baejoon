

class Solution {
    private var net_num = 0
    val visited = hashMapOf<Int, Boolean>()

    fun bfs(graph : HashMap<Int, List<Int>>, start_v: Int){
        val q = ArrayDeque<Pair<Int, Int>>()
        q.addLast(Pair(start_v, 0))
        visited[start_v] = true

        while (q.isNotEmpty()){
            val cur_v = q.removeFirst()

            println("현재 방문 노드 : ${cur_v.first}, 거리 : ${cur_v.second}")

            graph[cur_v.first]?.forEach {
                if (it !in visited){
                    var dist = cur_v.second // Pair 자료형 final val, 직접 변경 불가
                    q.addLast(Pair(it, ++dist))
                    visited[it] = true
                }
            }
        }
    }

    fun changeGraph(graph : Array<IntArray>) : HashMap<Int, List<Int>> {
        val hashmap = hashMapOf<Int, List<Int>>()

        graph.forEachIndexed { index, intArray ->
            hashmap[index] = intArray
                .withIndex() 
                .filter { (index2, int) -> int == 1 && index != index2 } 
                .map { (index2, _) -> index2 } 

        }
        return hashmap
    }

    fun solution(n: Int, computers: Array<IntArray>): Int {
        var changedGraph = changeGraph(computers)
        print(changedGraph)

        for (i in computers.indices){
            if (i !in visited) {
                bfs(changedGraph, i)
                net_num++
            }
        }

        return net_num
    }
}
