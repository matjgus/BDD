<template>
<div>

    <div class="wrap">
        <div id="deed_history" class="deed-history">
            <h1>내 후원증</h1>
            <p> 총 후원 수 : <span  style="color:a81431">{{ tDonation }}</span>개</p>
            <p> 남은 후원증 : <span  style="color:a81431">{{ remain_deed }}</span>개</p>
            <button @click="fetchdeeds">fetchdeeds</button>
            <table>
                <tr>
                    <td>번호</td>
                    <td>후원증 충전/ 후원증 기증 여부</td>
                    <td>개수</td>
                    <td>작성자</td>         
                    <td>날짜</td>
                </tr>
                <tr>
                    <td>1</td>
                    <td>후원증을 충전하셨습니다.</td>
                    <td>5</td>
                    <td>김세현</td>
                    <td>2021.01.01</td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>후원증을 기증하셨습니다.</td>
                    <td>3</td>
                    <td>김세현</td>
                    <td>2021.01.01</td>
                </tr>
            </table>
        </div>
        
    </div>
</div>
   
</template>
<script>
export default {
  name: 'Mydeed',
}
// const deed_history = new Vue({
//     el: '#deed_history',
//     data: {
//       tDonation: 3,
//       remain_deed : 2
//     },
//     method : {
//     fetchdeeds(){
//       fetch('https://jsonplaceholder.typicode.com/todos/1')
//       .then(response => response.json())
//       .then(json => console.log(json))
//     }
//   }
//   })
</script>


<style scoped>
.wrap {
    margin : 0 auto;
    max-width: 1800px;
    width:100%;
    
}
.deed-history{
    margin: 50px;
    padding: 50px;
    border: 1px solid black;
}
.deed-history> h1{
    font-size: 40px;
    background-color: #f4f4f4;
}
.deed-history> p{
    font-size : 30px;
    padding : 30px 0;

}
.deed-history tr,td{
    padding : 15px;
}
.deed-history tr:first-child {
    font-size : 20px;
    font-weight: 550;
    padding : 30px;
}
</style>