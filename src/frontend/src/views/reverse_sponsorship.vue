<template>
<div>
<div class="swiper mySwiper" style="height: 650px;">
        <div class="swiper-wrapper">
          <div class="swiper-slide">
              <img src="../assets/img/banner1.jpg">
              
          </div>
          <div class="swiper-slide">
            <img src="../assets/img/banner2.jpg">
          </div>
          <div class="swiper-slide">
              <img src="../assets/img/banner4.jpg">
          </div>
    </div>
        <div class="swiper-button-next"></div>
        <div class="swiper-button-prev"></div>
        <div class="swiper-pagination"></div>
    </div>

    

    <div class="sponsorship-guide">
      
      <img src="../assets/img/donation.png" style="width: 300px; height: 300px; margin-top:30px;">
        <p class="title">후원받기안내</p>

      <div class="guide-box">
        <div>
          <p><b>메일주소:</b> redsocksdoantion@redsocksdonation.co.kr</p>
        </div>  
      </div>
      <div class="guide-box">
        <div>
          <p><b>주소:</b> 대구광역시 동구 동내로 70, 첨단정보통신융합산업기술원 3층 Hustar</p>
        </div>
      </div>
      <div class="guide-box">
        <div>
          <p><b>전화번호:</b> 010-2456-4511</p>
        </div>
      </div>

      
      
    </div>
</div>
</template>
<script>
export default {
  name: 'Reverse_Sponsorship',
}
</script>

<style scoped>
body {
    margin:0 auto;
    justify-content: center;
    text-align: center;
}

.sponsorship-guide {
    display: flex;
    flex-direction: column;
    text-align: center;
    margin-bottom: 100px;
}

.sponsorship-guide img{
    margin: 0 auto;
    width: 100px;
    height: 100px;
}

.title {
    font-size: 30px;
    font-weight: 900;
}

.guide-box p {
    margin:30px 30px 0 30px;
    font-size: 20px;
}

.guide-box {
    text-align: center;
    display: flex;
    justify-content: center;
    align-items: center;
}

</style>