<template>
<div>
<sub-banner/>
    <div class="wrap">
        <div id="deed_history" class="deed-history">
            <h1>내 후원증</h1>
            <p> 총 후원 수 : <span  style="color:a81431">{{ tDonation }}</span>개</p>
            <p> 남은 후원증 : <span  style="color:a81431">{{ remain_deed }}</span>개</p>
            <table>
                <tr>
                    <td>번호</td>
                    <td>후원증 충전/ 후원증 기증 여부</td>
                    <td>개수</td>
                    <td>사용자</td>         
                    <td>날짜</td>
                </tr>
                <tr>
                    <td>1</td>
                    <td>후원증을 <span style="font-weight:700; color:red">{{isdonation}}</span>하셨습니다.</td>
                    <td>5</td>
                    <td>김세현</td>
                    <td>2021.01.01</td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>후원증을 <span style="font-weight:700; color:red">{{ischarge}}</span>하셨습니다.</td>
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
import subBanner from '../components/SubBanner.vue';
export default {
    components:{subBanner},
    name: 'Mydeed',
    data(){
        return {
            lists:[],
            tDonation : 0,
            remain_deed : 0,
            isdonation : "기증",
            ischarge : "충전"
        }
    },
    methods : {
        // axios
    },
    created : {

    }
}

</script>


<style scoped>
/* 모바일용 화면 */
@media(max-width: 480px) {
    
}
/* 컴퓨터용 화면 */
@media(min-width: 1400px) {
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
}
</style>