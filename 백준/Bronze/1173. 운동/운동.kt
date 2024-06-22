import java.util.StringTokenizer

fun main(){
    val st = StringTokenizer(readln())
    val N = st.nextToken().toInt()      // 운동을 N분 하려 한다.
    val m = st.nextToken().toInt()      // 최소 맥박 // 초기 맥박
    val M = st.nextToken().toInt()      // 최대 맥박
    val T = st.nextToken().toInt()      // 증가 맥박(운동 시)
    val R = st.nextToken().toInt()      // 감소 맥박(휴식 시)

    var current_N = 0       // 현재 운동한 시간
    var current_min = 0     // 현재 지난 시간
    var current_X = m       // 현재 맥박
    var state = false       // 최대로 휴식중인지 확인

    while(current_N < N){
        if((current_X + T) <= M) {
            current_X += T
            current_min++
            current_N++
            state = false
        }else if(current_X - R >= m){
            current_X -= R
            current_min++
        }else{
            current_X = m
            current_min++
            if(state){
                print(-1)
                return
            }
            state = true
        }
    }
    print(current_min)
}