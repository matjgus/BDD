<template>
<div>
<sub-banner/>
<div class="wrap">
    <div class="donation-bill">
        <div class="issue-bill">
            <h1>기부금 영수증 발급하기</h1>
            <a href = #none id="popup-button">바로가기</a>
        </div>
        <div class="donation-history">
            <h1>후원 내역 확인하기</h1>
            <a href = "./donationhistory">바로가기</a>
        </div>
        <div class="explanation">
            <p> * 개인 주민등록번호가 등록되어 후원 중인 경우,
                    후원 내역이 자동으로 국세청에 신고되어
                    별도로 기부금 영수증을 발급하지 않아도 됩니다.</p>
        </div>
    </div>
</div>

<div id="popup">
      <div id="popmenu">
          <p>영수증을 뽑을 <span style="color:#a81431">후원</span>을 선택하세요
          <select name="product" class="product-option">
            <option value=no1>1회 기부</option>
            <option value=no2>2회 기부</option>
            <option value=no3>3회 기부</option>
            <option value=no4>4회 기부</option>
            <option value=no5>5회 기부</option>
            <option value=no6>6회 기부</option>
          </select>
        </p>
        <div class="exit">닫기</div>
      </div>
  </div>
</div>
</template>

<script>
import subBanner from '../components/SubBanner.vue';
export default {
    components:{subBanner}
    
  
}
</script>
<style scoped>
.swiper-wrapper .banner1{
    background:url("../assets/img/banner2.jpg");
    object-fit: cover;
    overflow: hidden;
    background-repeat: no-repeat;
    background-size:100% 100%;
}
.swiper-wrapper .banner1 p{
    font-size : 35px;
    color: white;
}
.swiper-wrapper .banner1 h1{
    font-size : 60px;
    color: white;
    text-align: center;
}
.swiper-wrapper .banner2{
    background:url("../assets/img/banner1.jpg");
    object-fit: cover;
    overflow: hidden;
    background-repeat: no-repeat;
    background-size:100% 100%;
}

.swiper-wrapper .banner2 h1{
    font-size : 60px;
    color: white;
    text-align: center;
}
.swiper-wrapper .banner2 > div> p{
    font-size : 35px;
    color: white;
}

.swiper-wrapper .banner3{
    background:url("../assets/img/banner4.jpg");
    object-fit: cover;
    overflow: hidden;
    background-repeat: no-repeat;
    background-size:100% 100%;
}

.swiper-wrapper .banner3 h1{
    font-size : 60px;
    color: white;
    text-align: center;
}
.swiper-wrapper .banner3 > div> p{
    font-size : 35px;
    color: white;
}
.donation-bill{
    height: 35vh;
    padding :40px 30%;

}
.donation-bill > div{
    background-color: whitesmoke;
}
.donation-bill  > div > h1{
    font-size : 25px;
    text-align: left;
    line-height: 110px;
    width: 70%;
}
.donation-bill  > div > a {
    font-size : 20px;
    margin : 40px 0;
    line-height: 32px;
    text-align: center;
    border-radius: 10%;
    width: 25%;
    color : white;
    border : 700;
    background-color: rgb(0, 0, 0);
}

.donation-bill > div{
    height: 30%;
    display : flex;
    justify-content: space-between;
    border : 1px solid rgb(224, 223, 223);
    padding : 0 1vw;
}

.donation-bill .button-box{
    display : flex;
    justify-content: center;
}
.donation-bill .explanation > p{
    font-size : 15px;
    font-weight: 600;
    line-height: 30px;
}
/*팝업창*/
#popup {
    display: none; /*숨기기*/
    position: fixed;
    width: 100%;
    height: 100%;
    background: rgba(214, 214, 214, 0.9);
    top:0%;
    left:0%;
    z-index:113;
}

#popmenu {
    position: absolute;
    left: 50%;
    top: 50%;
    transform: translate(-50%,-50%);
    width: 20vw;
    height: 40vh;
    text-align: center;
    background: #fff;
    border-radius: 5%;
}

#popmenu p {
    margin-top: 80px;
    font-size: large;
}
#popmenu select{
    font-size:large;
}
.exit {
    position: absolute;
    left: 50%;
    bottom: 10px;
    transform: translate(-50%,0);
    width: 60px;
    height: 30px;
    text-align: center;
    line-height: 30px;
    background: #007AAE;
    cursor: pointer;
}
</style>