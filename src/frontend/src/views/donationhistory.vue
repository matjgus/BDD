<template>
<div>
<div class="swiper mySwiper" style="height: 450px;">
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
    </div>
	
    <div class="donation-history-wrap">
		<div class="wrap history-wrap">
			<div class="donation-history-title">
				<div>
				<h1>후원 내역</h1>
				<span> .후원내역은 최대 9개까지 보여집니다.</span>
			</div>
            </div>
            
            <div class="donation-history-content">
                <div class="donation-story">
                    <ul>
                        <li>
                            <img src="../assets/img/story2.jpg" alt="사연1" style="width:100%; height:80%">
                            <p> 돈치치는 많이 아파요 </p>
                        </li>
                        <li>
                            <img src="../assets/img/story5.jpg" alt="사연1" style="width:100%; height:80%">
                            <p> 돈치치는 많이 아파요 </p>
                        </li>
                        <li>
                            <img src="../assets/img/story3.jpg" alt="사연1" style="width:100%; height:80%">
                            <p> 돈치치는 많이 아파요 </p>
                        </li>
                    </ul>
                    <ul>
                        <li>
                            <img src="../assets/img/story3.jpg" alt="사연1" style="width:100%; height:80%">
                            <p> 돈치치는 많이 아파요 </p>
                        </li>
                        <li>
                            <img src="../assets/img/story4.jpg" alt="사연1" style="width:100%; height:80%">
                            <p> 돈치치는 많이 아파요 </p>
                        </li>
                        <li>
                            <img src="../assets/img/story2.jpg" alt="사연1" style="width:100%; height:80%">
                            <p> 돈치치는 많이 아파요 </p>
                        </li>
                    </ul>
					<ul>
                        <li>
                            <img src="../assets/img/story2.jpg" alt="사연1" style="width:100%; height:80%">
                            <p> 돈치치는 많이 아파요 </p>
                        </li>
                        <li>
                            <img src="../assets/img/story3.jpg" alt="사연1" style="width:100%; height:80%">
                            <p> 돈치치는 많이 아파요 </p>
                        </li>
                        <li>
                            <img src="../assets/img/story4.jpg" alt="사연1" style="width:100%; height:80%">
                            <p> 돈치치는 많이 아파요 </p>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
		
    </div> 
</div>
</template>
<script>
export default {
  name: 'Donationhistory',
}
</script>

<style scoped>
.donation-history-wrap .wrap .donation-history-title div{
    display: flex;
    justify-content: space-between;
    max-width: 1400px;
    margin : 0 auto;
}

.donation-history-wrap .wrap .donation-history-title h1{
    font-size : 40px;
    text-align: left;
    margin : 3vh;
    padding-right : 5vw;
}
.donation-history-wrap .wrap .donation-history-title span{
    font-size : 20px;
    text-align: center;
    margin : 4vh;
}

.history-wrap{
    max-width: 1000px;
}

.donation-story ul{
    display : flex;
    justify-content: space-evenly;
    margin: 2vh auto;
    max-width: 1400px;
    

    
}
.donation-story ul li{
    width : 20%;
    border-radius: 15%;
    background-color: #a81431;
}
.donation-story ul li img{
    border-top-right-radius: 15%;
    border-top-left-radius: 15%;
}
.donation-story ul li p{
    text-align: center;
    font-size: 15px;
    line-height: 40px;
    font-weight: 600;
    color:white;
}


</style>