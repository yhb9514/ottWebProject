<template>
    <div class="app">
        <header>
            <div><img src="@/assets/logo.png">
            <button class="login" @click="isOpenModal = true">로그인</button>
                <p class="text1">영화와 드라마를 언제 어디서나!</p>
                <p class="text2">지금 바로 이메일로 등록하세요.</p>
            </div>
        </header>

            <div class="a">
                 <router-link class="start" to="/join">시작하기</router-link>
            </div>

        <!-- 모달창 -->
            <div class = "back-bg" v-if="isOpenModal==true">
                <div class="front-bg">
                    <h1>로그인</h1><hr>
                    <label>이메일</label>
                    <p><input type="text" name="email" id="email"></p>
                    <label>비밀번호</label>
                    <p><input type="password" name="pwd" id="pwd"></p>
                    <input type="button" class="loginBtn" @click="login()" value="로그인">
                    <p class="noSign">회원이 아니신가요?</p>
                    <p class="now_join" @click="isOpenModal = false">지금 가입하세요.</p>
                </div>
            </div>

        <footer>
            <hr color="grey" size=0.1px;>
            <ul>
                <li><a href="">회사소개</a></li>
                <li><a href="">서비스 소개</a></li>
                <li><a href="">이용약관</a></li>
                <li><a href="">개인정보 처리방침</a></li>
                <li><a href="">고객센터</a></li>
            </ul>
            <p>7조 주식회사 | 대표이사 ooo | 고객센터 1234-5678 (평일 9:00~18:00) / 점심시간 12:00~13:00 / 주말 및 공휴일 휴무 </p>
            <p>사업자등록번호 123-45-67890 | 호스팅서비스제공자: 마이크로소프트 유한회사</p>
            <p>통신판매업 신고번호: 제 2021-서울강남구-1234호 | 통신판매업 정보 공개 : <a href="https://www.multicampus.com">https://www.multicampus.com</a></p>
            <p>서울특별시 강남구 언주로 508 14층(역삼동, 서울상록빌딩)</p>
            <p class="copyright">Copyright&#169; (주)풀스택개발-7조 All rights reserved.</p>
        </footer>


    </div>


</template>

<script>
import axios from 'axios';
export default {

    data() {
        return {
            isOpenModal : false,

        }
    },

    methods: {
        async login(){
            var email = document.getElementById("email").value;
            var pwd = document.getElementById("pwd").value;
                axios.get('/api/login', {
                    params:{
                    email: email,
                    pwd: pwd,
                    }
                })
                .then(res => {
                        console.log(res.data);
                        if(res.data == '/' ){

                            alert("로그인에 실패했습니다.")
                            // window.location.href = res.data;
                            this.$router.push(res.data);
                        }
                        else{
                            alert("로그인 되었습니다.")
                            // window.location.href = res.data;
                            this.$router.push(res.data);
                        }

                })
                .catch(err => {
                    console.log(err);
                    alert("로그인 실패했습니다.");
                })
        },

    },

}

</script>



<style scoped>

    body {
        background-color: rgb(6, 3, 37);
        color: white;
        margin: 0px;
        padding: 0px;
        overflow-x: hidden;
        font-family: 'Roboto', sans-serif;
    }

    header {
        background-image: url('../assets/bg-img/back1.png'),
                        url('../assets/bg-img/back2.png'),
                        url('../assets/bg-img/back3.png'),
                        url('../assets/bg-img/back4.png'),
                        url('../assets/bg-img/back5.png'),
                        url('../assets/bg-img/back6.png'),
                        url('../assets/bg-img/back7.png'),
                        url('../assets/bg-img/back8.png'),
                        url('../assets/bg-img/back9.png'),
                        url('../assets/bg-img/back10.png'),
                        url('../assets/bg-img/back11.png'),
                        url('../assets/bg-img/back12.png'),
                        url('../assets/bg-img/back13.png'),
                        url('../assets/bg-img/back14.png');
        background-repeat:no-repeat;
        background-size: 300px 300px;
        background-position:0px ,300px, 600px, 900px, 1200px, 1500px, 1800px,
                            0px 300px, 300px 300px, 600px 300px, 900px 300px, 1200px 300px, 1500px 300px, 1800px 300px;
        opacity: 0.8;
    }


    img{
    display: inline-block;
    width:300px;
    height:100px;
    margin: 10px;
    }


    .login {
        color: black;
        font-size: 1.5rem;
        font-weight: bold;
        text-align: center;
        text-decoration: none;
        width: 150px;
        height: 50px;
        border: 2px;
        border-radius: 5px;
        float: right;
        margin: 10px;
        text-align: center;
        margin: .25rem;
        padding: .5rem 1rem;
        text-decoration: none;
        font-weight: bold;
        background: rgb(255,232,18);
    }

    .login:hover {
      background: white;
      color: black;
    }

    .text1 {
        color: white;
        text-align: center;
        font-size: 100px;
        margin-bottom: 25px;
        margin-left: 0px;
        background-color: black;
        opacity: 0.8;
        padding: 0px;

    }
    .text2 {
        color: white;
        text-align: center;
        font-size: 50px;
        margin-bottom: 25px;
        margin-left: 0px;
        background-color: black;
        opacity: 0.8;

    }

    .start{
        text-align: center;
        text-decoration: none;
        background: rgb(255,232,18);
        color: black;
        font-size: 2.0rem;
        font-weight: bold;
        display: inline-block;
        width: 280px;
        height: 50px;
        border: 2px;
        border-radius: 7px;
        margin: 10px;
    }

    .a{
        text-align: center;
    }
    .start:hover{
        background: white;
        color: black;
    }

    .back-bg {
        width: 100%; height: 100%;
        background: rgba(0,0,0,0.);
        /* position: fixed; */
        padding: 20px;
        position: absolute;
        left:50%;
        top:50%;
        transform: translate(-50%,-50%);
    }
    .front-bg {
        color: white;
        text-align: center;
        width: 500px;
        height: 500px;
        background: black;
        border-radius: 8px;
        padding: 20px;
        position: absolute;
        left:50%;
        top:50%;
        transform: translate(-50%,-50%);
        border: 3px solid white;
        opacity: 0.9;
    }
    .loginBtn{
        color: black;
        background: rgb(255,232,18);
        font-size: 1.1rem;
        font-weight: bold;
        text-align: center;
        display: inline-block;
        width: 200px;
        height: 30px;
        border-radius: 5px;
        margin: 10px;

    }
    .loginBtn:hover {
      background: white;
      color: black;
    }

    .now_join {
        display: block;
        text-align: center;
        margin: .25rem;
        padding: .5rem 1rem;
        text-decoration: none;
        font-weight: bold;
        color: black;
        background: rgb(255,232,18);
        font-family: 'Roboto', sans-serif;
    }

    .now_join:hover {
      background: white;
      color: black;
    }

    footer {
        width: 100%;
        min-height: 15px;
        padding: 20px 0 40px 20px;
        top: 100%;
        text-align: center;
        position : absolute;
        bottom:0%;

    }
    footer a{
        color: white;
        text-decoration-line: none;
        display:inline-block;
        margin: .1rem;
        font-weight: 100;
        text-decoration: none;
        font: bold;

    }
    footer a:hover{
        background-color: rgb(6, 3, 37);
        color: red;
    }

    footer .copyright {
        font-size: .75em;
        color: white;
    }

    footer ul {
        list-style-type: none;
        margin: 0;
        padding: 0;
    }

    footer ul li {
        display: inline-block;
        margin: 7px;
        font-size: .85em;
    }
    footer p{
        color:#ccc;
        font-size: .75em;
    }


</style>