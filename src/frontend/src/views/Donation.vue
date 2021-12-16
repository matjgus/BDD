<template>
    <div>
        <div id="headers"></div>
    
   

    
    <div class="donation-wrap">
        <div class="donation-link-btn">
           
            <a href="sponsorship">
            <div class="sponsorship-link-side">
              <p>후원참여</p>
              <img src="../assets/img/hand.png">
            </div>
          </a>

          <a href="reverse_sponsorship">
            <div class="reverse-sponsorship-link-side">
              <p>후원받기</p>
              <img src="../assets/img/hospital.png">
            </div>
          </a>
    </div>

    <div class="wrap-donation-guide">
      <p class="p-title">후원안내</p>
      <div class="donation-guide-box">
        <div>
          <img src="../assets/img/patient.png">
          <p class="p-contents">사람들의 사연을 읽고 선택합니다.</p>
        </div>
        <div>
          <img src="../assets/img/Logo.png">
          <p class="p-contents">사연을 선택하면 원하는 수만큼 <br> 헌혈증을 기증할 수 있습니다.</p>
        </div>
        <div>
          <img src="../assets/img/blood_donation_img.png">
          <p class="p-contents">헌혈증은 환자에게 바로 전달됩니다.</p>
        </div>
        <div>
          <img src="../assets/img/house.png">
          <p class="p-contents">재단에 헌혈증을 보관할 수 있습니다. <br> 보관한 헌혈증은 추후 <br>  원하는 곳에 기증할 수 있습니다.</p>
        </div>
      </div>
      <div class="gotodonation">
      <p class="p-title2"><a href="sponsorship"><b>후원하러가기</b></a></p><b/>
      </div>
    </div>


    <div class="wrap-blood-donation">
      <p class="title">헌혈증이란?</p>
      <div class="blood-donation-info">
        <div>
          <img src="../assets/img/blood_donation.jpg">
        </div>
        <div>
          <p>
          혈액관리법 제14조에 의하면 헌혈 후<br> <b>헌혈증서 1개</b>를 받을 수 있습니다. <br>
          후에 헌혈증서를 의료기관에 제출하면<br>  <b>무상으로 수혈</b>받을 수 있습니다. <br>
          <b>(본인 부담금에 한해서만)</b>
          </p>
        </div>
      </div>

      <div class="wrap-qna">
        <ul class="qna">
            <img src="../assets/img/blood.png" >
            <li><p>분실 혹은 훼손된 헌혈증은 재발급할 수 있나요?</p></li>
            <p>2021.3.23에 재발급할 수 있게 법이 개정되었으며 <br> 2022.9.24에 시행됩니다.<br> 즉, 2022.9.24부터 재발급 가능합니다.  </p>
            <li><p>헌혈증을 매매할 수 있나요?</p></li>
            <p>혈액관리법 제3조에 의하여 매매는 불법입니다. <br> 대신 타인에게 양도는 가능합니다.</p>
            <li><p>헌혈증 온라인으로 기증할 수 있나요?</p></li>
            <p>의료기관에 헌혈증을 제출할 때는 실물이 필요합니다. </p>
            <li><p>헌혈증이 있으면 없는 사람보다 빠르게 수혈받을 수 있나요?</p></li>
            <p>헌혈증의 유무로 의료기관에서 차별성을 두지 않습니다.</p>
          </ul>
      </div>

    </div>

    </div>
    </div>
</template>

<style scoped>

.donation-link-btn {
	height: 300px;
	width: 60%;
	max-width: 1000px;
	margin: 50px auto;
	display: flex;
}



.donation-wrap {
	margin: 0 auto;
}

.donation-link-btn a {
	width: 100%;
	height: 300px;
	display: block;
}

.sponsorship-link-side {
	background-color: rgb(255, 164, 178);
	color: black;
	width: 100%;
	height: 100%;
	font-size: 30px;
	text-align: center;
	font-weight: 600;
	padding-top: 20px;
	cursor: pointer;
}



.reverse-sponsorship-link-side {
	background-color: rgb(145, 210, 214);
	color: black;
	width: 100%;
	height: 100%;
	font-size: 30px;
	text-align: center;
	font-weight: 600;
	padding-top: 20px;
	cursor: pointer;
}


.wrap-blood-donation {
	text-align: center;
	flex-direction: column;
	display: flex;
	margin: 0 auto;
	width: 100%;
}

.wrap-blood-donation p {
	font-size: 40px;
	font-weight: 600;
	font-family: 'MaruBuriLight';
}

.sponsorship-link-side img {
	margin-top: 40px;
	width: 200px;
	transform:scale(1);
	transition:0.1s;
}


.reverse-sponsorship-link-side img {
	margin-top: 40px;
	width: 200px;
	transform:scale(1);
	transition:0.1s;
}

.reverse-sponsorship-link-side:hover p{
	transform:scale(1.1);
}

.reverse-sponsorship-link-side:hover img{
	transform:scale(1.1);
}
.sponsorship-link-side:hover p{
	transform:scale(1.1);
}

.sponsorship-link-side:hover img{
	transform:scale(1.1);
}

.blood-donation-info {
	display: flex;
	height: 400px;
	align-items: center;
	justify-content: center;
}

.blood-donation-info div img {
	height: 300px;
}

.blood-donation-info div {
	width: 35%;
	height: 300px;
	align-items: center;
    display: flex;
    align-items: center;
}

.blood-donation-info p {
	font-size: 25px;
	line-height: 50px;
	font-weight: 300;
}

.wrap-qna {
	border: 1px dotted rgb(116, 115, 115);
	margin-top: 20px;
	padding: 30px;
}

.qna {
	display: flex;
	flex-direction: column;
	align-items: center;
}

.qna p {
	font-size: 25px;
	font-weight: 300;
	margin-top: 20px;
}

.qna li p {
	font-size: 30px;
	font-weight: 600;
}

.qna img {
	width: 25%;
	margin-bottom: 20px;
}

.qna li {
	margin: 10px 0 0 0;
	width: 80%;
	height: 50px;
}

.wrap-donation-guide {
	width: 100%;
	max-width: 2400px;
	margin: 0 auto;
	text-align: center;
	background-color: rgb(236, 235, 255);
	height: 400px;
	margin-top: 50px;
	margin-bottom: 50px;
	display: flex;
	flex-direction: column;
}

.p-title {
	font-size: 30px;
	font-weight: 600;
	font-family: 'MaruBuriLight';
	margin-bottom: 30px;
}

.p-title2 {
	font-size: 27px;
	font-weight: 600;
	font-family: 'MaruBuriLight';
	margin-bottom: 30px;
}

.p-contents {
	font-size: 21px;
	font-weight: 300;
	color: rgb(88, 88, 88);
	margin-top: 10px;
}

.donation-guide-box {
	display: flex;
	justify-content: space-around;
}

.donation-guide-box div img {
	width: 200px;
	height: 170px;
}

.donation-guide-box div {
	width: 350px;
	height: 270px;
}


</style>