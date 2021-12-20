<template>
<div>
     <sub-banner/>
    <div class="profile-wrap">
        <div class="container">
            <div class="member_wrap">
                <div class="tit_wrap">
                    <h2 class="member_tit">회원정보수정</h2>
                </div>
            </div>
            <div class="join_wrap">
                <form>
                    <div class="join_detail">
                        <div class="input_wrap">
                            <div class="input_area first" style="display : flex;">
                                <p> 아이디 </p>
                                <input type="text" name="id" id="id" placeholder="아이디 입력* (숫자,영문 자유 형식) " required="" autocomplete="off">
                            </div>
                        
                            <div class="input_area" style="display : flex;">
                                <p> 이름 </p>
                            <input type="text" name="name" id="name" placeholder="이름 입력" required="" autocomplete="off">
                            </div>
                        
                            <div class="input_area" style="display : flex;">
                                <p> 이메일 </p>
                                <input type="text" name="email" id="email" placeholder="이메일" required="" autocomplete="off">
                            </div>
                                                
                            <div class="input_area" style="display : flex;">
                                <p> 비밀번호 </p>
                                <input type="password" name="pw" id="pw" placeholder="비밀번호(영문, 숫자 8-12자)" required="" autocomplete="off">
                            </div>
                            <div class="input_area" style="display : flex;">
                                <p> 비밀번호 </p>
                                <input type="password" name="pw2" id="pw2" placeholder="비밀번호 확인" required="" autocomplete="off">
                            </div>                            
                        </div>
                    </div>
                </form>
            </div>
            <div class= "join-btn">
                <a href="#none">저장</a>
                <a href="#none">취소</a>
            </div>
        </div>
    </div>
</div>
</template>
<script>
import subBanner from '../components/SubBanner.vue';
export default {
    components:{subBanner},
  name: 'Profile',
}
</script>
<style scoped>
/* 모바일용 화면 */
@media(max-width: 480px) {
    
}
/* 컴퓨터용 화면 */
@media(min-width: 1400px) {
.container{
    margin : 50px auto;
    max-width: 700px;
   
}
.container h2{
    text-align: center;
    font-size : 40px;
    margin-bottom : 20px;
}

.container .join_wrap{
    border: 1px solid silver;
    padding: 30px 50px;
}
.container .join_wrap p{
    padding: 0 15px; width: 15%; height: 40px;margin : 10px 15px ;  border-radius: 15px;
    line-height: 40px; border : 1px solid silver; text-align: center; background-color: silver ;
}
input[type='text']{width: 80%; height: 40px;
margin : 10px 0 ; border-radius: 10px;
padding-left: 10px;
}

input[type='password']{padding-left: 10px; width: 80%; height: 40px;margin : 10px 0 ;  border-radius: 15px;}

.join-btn { 
    margin : 20px 0; 
    width: 100%;
    display : flex;
    justify-content: center;
    
}
.join-btn a{
    display: block; border: 1px solid #ccc; line-height: 50px; text-align: center;
    width : 30%;
    border-radius: 50px;margin: 0 5px;}
}
</style>