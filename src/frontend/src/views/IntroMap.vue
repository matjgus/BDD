<template>
<div>
    

    <div class="wrap">
        <div class="intro">
            <div class="intro-wrap">
                <ul class="intro-link-btn">
                    <li class="intro-link"><a href="/intro">소개</a></li>
                    <li class="intro-link-selected"><a href="/intro-map">오시는 길</a></li>
                </ul>
            </div>
            <div class="intro-map">
                <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3232.8444793245444!2d128.73384945165745!3d35.87732788005154!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x35660b626ef7bf91%3A0xed9348a5a7daefae!2z7LKo64uo7KCV67O07Ya17Iug7Jy17ZWp7IKw7JeF6riw7Iig7JuQ!5e0!3m2!1sko!2skr!4v1638792705882!5m2!1sko!2skr" 
                style="border:0;" allowfullscreen="" loading="lazy"></iframe>
                <p><i class="fas fa-socks"> 오시는길</i> <br>대구광역시 동구 동내로 70, 첨단정보통신융합산업기술원 3층 Hustar</p>
            </div>

        </div>
    </div>
</div>
</template>

<script>
export default {
  name: 'IntroMap',
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
