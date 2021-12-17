<template>
<div>
    <sub-banner/>
    

<div class="wrap">
    <div class="intro">
        <div>
            <ul class="intro-link-btn">
                <li class="intro-link-selected"><a href="/intro">소개</a></li>
                <li class="intro-link"><a href="/IntroMap">오시는 길</a></li>
            </ul>
        </div>
        <div class="intro-slogan">
            <p>혈액암 환자를 돕는 일,</p>
            <p><i class="fas fa-socks"> 빨간양말후원</i> 이 합니다.</p> 
        </div>
        <ul class="intro-greeting">
            <li>
                <div class="say-img">
                    <img src="../assets/img/representative.jpg">
                    <p>빨간양말후원 사이트 개발자 <b>구뽀미</b></p>
                </div>
            </li>
            <li>
                <div class="say-text">
                    <h2>'기증헌혈증서제도'는 생명사랑입니다.</h2>
                    <p><span style="color:red; font-weight:600"> 빨간양말후원</span>에서는 현혈증서가 필요한 환자에게 헌혈증서를 지원하고 있습니다.</p>
                    <p>치료 과정에서 수혈을 많이 받는 백혈병 등 혈액암 환자들에게 헌혈증서는 경제적으로도 도움이 됩니다. <br>모아 두신 헌혈증서가 있다면, 빨간양말재단으로 기증 부탁드립니다. 
                    필요한 분들에게 소중히 전달해 드리겠습니다.</p>
                    <p>앞으로도 빨간 양말 재단은 전문적이고 다양한 지원사업을 통해
                        <br> 혈액증서가 필요한 환자들에게 건강과 희망을 주도록 최선의 노력을 다하겠습니다.
                    </p>
                </div>
                
            </li>
        </ul>
        <div class="intro-slogan">
            <p><i class="fas fa-socks"> 핵심가치</i></p> 
        </div>
        <ul class="intro-value">
            <li><div>
                <i class="fas fa-seedling"> 생명존중</i>
                <p>생명존중을 최우선 가치로 삼습니다.</p>
            </div></li>
            <li><div>
                <i class="fas fa-user-graduate"> 전문성</i>
                <p>최상의 서비스를 지향하며 전문성 향상을 위해 노력합니다.</p>
            </div></li>
            <li><div>
                <i class="fas fa-search-dollar"> 투명성</i>
                <p>후원과 사업과정의 철저한 관리로 투명한 운영을 합니다.</p>
            </div></li>

            <li><div>
                <i class="fas fa-hand-holding-heart"> 나눔</i>
                <p>더불어 사는 삶을 지향하고 많은 사람들과 함께 하도록 합니다.</p>
            </div></li>
        </ul>
    </div>
</div>
</div>
</template>

<script>
import subBanner from '../components/SubBanner.vue';
export default {
    components:{subBanner},
    name: 'intro',
}
</script>

<style>
.intro > ul> li{
    list-style: none;
    margin: 50px;
}
.intro >ul{
    display: flex;
}
.say-img > img{
    width: 100%;
}
.say-img > p{
    text-align: center;
    font-size: 20px;
    padding: 10px;
}
.say-img > p > i{
    color:red;
}
.say-text{
    background-color: #f7f7f7;
    padding: 50px;
}
.say-text > p > i{
    color:red;

}
.say-text > h2{
    font-size: 40px;
}
.say-text > p{
    font-size: 30px;
    padding: 15px 10px;
}
.intro-icon{
    text-align: center;
}
.intro-icon > i{
    padding: 20px 10px;
    font-size: 40px;
    color: rgb(133, 125, 125);
}

.mySwiper {
    width: 100%;
    height: 400px;
    margin-bottom: 30px;
  }
  .swiper-slide {
    text-align: center;
    font-size: 18px;
    background: rgb(212, 164, 164);
    /* Center slide text vertically */
    display: -webkit-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    -webkit-box-pack: center;
    -ms-flex-pack: center;
    -webkit-justify-content: center;
    justify-content: center;
    -webkit-box-align: center;
    -ms-flex-align: center;
    -webkit-align-items: center;
    align-items: center;
  }
  .donation-wrap {
    margin: 0 auto;
}
  .intro-link-btn {
    width: 40%;
    margin: 0 auto;
    padding: 50px 0px;
    display: flex;
    cursor: pointer;
}
  .intro-link-btn li a {
    width: 100%;
    line-height: 70px;
    display: block;
}

.intro-link-selected {
    background-color: rgb(255, 164, 178);
    color: white;
    width: 50%;
    font-size: 30px;
    box-shadow: 0px 0px 15px rgb(241 128 175 / 75%);
    text-align: center;
    font-weight: 500;
    
}
.intro-link {
    background-color: rgb(214, 214, 214);
    color: black;
    width: 50%;
    height: 100%;
    line-height: 90px;
    font-size: 30px;
    text-align: center;
    font-weight: 400;
}
.intro-greeting{
    padding: 50px 0px;
}
.intro-slogan{
    padding: 20px 0px;
    font-size: 50px;
    font-weight: 500;
    text-align: center;
}
.intro-slogan > p > i{
    color: red;
}

.intro-value{
    width: 100%;
    max-width: 2000px;
    margin: 0 auto;
    padding: 100px 0px;
    display: flex;
    font-size: 40px;
    justify-content: center;
}

.intro-value > li{
    padding: 10px;
    width: 25%;
}
.intro-value > li > div > p{
    padding: 10px;
    font-size: 25px;
}
.intro-map > iframe{
    width: 100%;
    height: 800px;
    
}

.intro-map > p{
    font-size: 25px;
    text-align: center;
    margin-top: 30px;
    margin-bottom: 100px;
}
.intro-map >p >i{
    padding: 5px;
    color: red;
    font-size: 30px;
}

</style>
