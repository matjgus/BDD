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
    
    <div class="login-wrap" >
        <div class="login-box">
            <h2>통합 로그인</h2>
            <div class="login">
                <form action="">
                    <ul>
                        <li><input type='text' placeholder="아이디"></li>
                        <li><input type='password' placeholder="패스워드"></li>
                        <li class = 'btn'>
                            <button>로그인</button>
                        </li>
                    </ul>
                    <div class="opt-box">
                        <span>
                            <input type="checkbox" id = "rem "><label for='rem'>로그인 기억하기</label>
                        </span>
                        <span>
                                <a href="$none">아이디 찾기</a>
                                <a href="$none">비밀번호 찾기</a>
                        </span>
                    </div>

                <div class= "join-btn">
                    <a href="/signup">회원가입하기</a>
                </div>
            </form>
        </div>
    </div>
</div>
</div>
</template>
<script>
export default {
  name: 'Login',
}
</script>

<style scoped>

.login-box h2{
    text-align: center;
    font-size : 40px;
    margin-bottom : 20px;
    
}
input[type='text']{width: 100%; height: 40px;}

input[type='password']{width: 100%; height: 40px;}

.login-box{
    text-align: center;
    width: 100%;
    max-width: 400px;
    margin:30px auto;
    height: 800px;
    margin-top : 300px;
}
.login-box button{width:100%; height: 50px; background: #000; color: #fff; border:0;}
.login-box li{margin-bottom: 10px;}
.login .btn{
    display : block;
    margin : 0;
    padding : 0;
}
.login-box .opt-box {overflow: hidden; margin : 20px 0;}
.login-box .opt-box span{float: left;}
.login-box .opt-box span a{display : inline-block; padding: 0 10px;}
.login-box .opt-box span:first-child{float: left;}
.login-box .opt-box span:last-child{float: right;}

.login-box .join-btn { margin : 20px 0; display : block}
.login-box .join-btn a{
    display: block; border: 1px solid #ccc; line-height: 50px; text-align: center;
    border-radius: 30px;}
</style>