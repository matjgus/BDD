<template>
<div>
<div class="swiper mySwiper" style="height: 500px;">
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
	<div class="benefit-wrap">
		<div class="wrap">
			<div class="benefit-title">
				<h1>후원 기념 상품 선택</h1>
			</div>
			<div class="total-donation-box">
				<p>총 후원수 : 427</p>
				<div>
					<p>상품 선택 : </p>
				</div>
				<form action="">
					<div>
						<select name="product" onchange="handleOnChange(this)" class="product-option">
							<option value=medal>10회 메달</option>
							<option value=keyring>10회 키링</option>
							<option value=medal>20회 메달</option>
							<option value=bracelet>20회 팔찌</option>
							<option value=medal>30회 메달</option>
							<option value=ring>30회 반지</option>
						</select>
					</div>

				</form>
			</div>
			<!--	<div id='result'></div>-->

		</div>


		<!--contents-->

	</div>
	<div class="benefit-product-wrap">
		<div class="wrap">
			<div class="product">

				<p>10회</p>
				<hr size="3" noshade color="EAEAEA">
				<ul>
					<li><img src="../assets/img/medal0.png" alt="메달1">
						<p>10회 메달</p>
					</li>
					<li><img src="../assets/img/product0.png" alt="메달1">
						<p>10회 키링</p>
					</li>
				</ul>

			</div>
		</div>

		<div class="wrap">
			<div class="product">
				<p>20회</p>
				<hr size="3" noshade color="EAEAEA">
				<ul>
					<li><img src="../assets/img/medal1.png" alt="메달1">
						<p>20회 메달</p>
					</li>
					<li><img src="../assets/img/product1.png" alt="반지">
						<p>20회 팔찌</p>
					</li>
				</ul>
			</div>
		</div>
		<div class="wrap">
			<div class="product">
				<p>30회</p>
				<hr size="3" noshade color="EAEAEA">
				<ul>
					<li><img src="../assets/img/medal2.png" alt="메달1">
						<p>30회 메달</p>
					</li>
					<li><img src="../assets/img/product2.jpg" alt="반지">
						<p>30회 반지</p>
					</li>
				</ul>

			</div>
		</div>
	</div>
    </div>
</template>
<script>
export default {
  name: 'Benefit',
}
</script>

<style scoped>
.benefit-title h1 {
    font-size: 40px;
    text-align: center;
}
.total-donation-box{
    width : 30%;
    border : 1px solid rgb(240, 240, 240);
    border-radius: 3%;
    margin-top: 5vh;
    padding : 10px 10px;
    background-color: rgb(253, 253, 253);
    display : flex;
    align-items: center;
    justify-content: space-between;
}

.product-option {
	height: 40px;
	width: 120px;
	font-size: 20px;
}

.total-donation-box p{
    font-size : 30px;
    text-align: left;
}
.benefit-product-wrap .wrap .product{
    width: 100%;
    margin-top: 2vh;
}
.benefit-product-wrap .wrap .product ul{
    width: 100%;
    display: flex;
    
}
.benefit-product-wrap .wrap .product ul > li{
    width: 20%; 
    height: 30vh;
    border: 1px solid silver; 
    border-radius: 5%;
    margin-right: 4vw;  
    padding : 15px;
}

.benefit-product-wrap .wrap .product img{
    width : 100%;
    height: 85%;
}
.benefit-product-wrap .wrap .product >ul >li > p{
    font-size: 30px;
    text-align: center;
    font-weight: bold;
    height: 15%;
    background-color: rgb(244, 247, 250);
    line-height: 60px;
}
.benefit-product-wrap .wrap .product p{
    font-size: 30px;
    margin-bottom: 1vh;
    width: auto;
    background-color: rgb(250, 252, 253);
}

.benefit-product-wrap .wrap .product hr{
    font-size: 30px;
    margin-bottom: 1vh;
}

.benefit-product-wrap{
    margin-bottom: 50px;
}







/*팝업창*/
/* #popup {
    display: none; 숨기기
    position: fixed;
    width: 100%;
    top: 0%;
    height: 100%;
    background: rgba(0,0,0,0.9);
    z-index: 9999;
    
}

#popmenu {
    position: absolute;
    left: 50%;
    top: 50%;
    transform: translate(-50%,-50%);
    width: 30vw;
    height: 30vh;
    text-align: center;
    background: white;
    border: 1px solid black;
}

#popmenu p {
    margin-top: 80px;
}

.exit {
    position: absolute;
    left: 52%;
    bottom: 10px;
    width: 8%;
    height: 40px;
    text-align: center;
    line-height: 40px;
    background: rgb(192, 192, 192);
    cursor: pointer;
    font-size: 20px;
    font-weight: 700;
    border-radius: 10px;
}
.select {
    position: absolute;
    left: 41%;
    bottom: 10px;
    width: 8%;
    height: 40px;
    text-align: center;
    line-height: 40px;
    background: rgb(192, 192, 192);
    cursor: pointer;
    font-size: 20px;
    font-weight: 700;
    border-radius: 10px;
}
.product-select-box{
	margin-top: 20px;
    text-align: center;
    line-height: 30px;
    cursor: pointer;
    font-size: 40px;
}
본문내용
#contents {
    width: 100px;
    height: 50px;
    text-align: center;
    line-height: 50px;
    color: #fff;
    background: #555;
    cursor: pointer;
    margin-left: 2vw;
    font-weight: 700;
    font-size: 15px;
    border-radius: 10px;
} */
</style>