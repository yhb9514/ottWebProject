<template>
    <div>
        <nav class="main-nav">
             <router-link to="/main"> <img src="../assets/logo.png"> </router-link>
            <ul class="nav">
                <li><router-link to="/main">홈</router-link></li>
                <li><router-link to="#">TV프로그램</router-link></li>
                <li><router-link to="#">영화</router-link></li>
                <li><router-link to="/subscriptionpage">이용권</router-link></li>
                <li><router-link to="/mypage">MY</router-link></li>
                <li><router-link to="/faq">FAQ</router-link></li>
            </ul>
            <div class="nav-1">
              <form class="nav-search">
                    <input type="text" placeholder="검색어를 입력해주세요." name="search">
              </form>
            </div>

        </nav>


        <header>
          <h2>영화 예고편</h2>
          <p align="middle"><iframe src="https://www.youtube.com/embed/dKy5B-PSYZo"  width="1000px" height="700px" frameborder="0"></iframe></p>




        </header>
        <main class="main">
            <h3>Best Movie Top 3</h3>
            <hr>
            <div class="content-history">
                <div class="content1">
                    <router-link to="/movie" @click="scrollToTop" ><img src="@/assets/action/spiderman.jpg"></router-link>
                    <p>스파이더맨:노 웨이 홈</p>
                    <p>1위</p>
                </div>
                <div class="content2">
                    <a href="#"><img src="@/assets/action/baekdoosan.jpg"></a>
                    <p>백두산</p>
                    <p>2위</p>
                </div>
                <div class="content3">
                    <a href="#"><img src="@/assets/action/exit.jpg"></a>
                    <p>엑시트</p>
                    <p>3위</p>
                </div>
            </div>

                <h3>액션 영화</h3>
                <hr>
                <div class="content-program">
                    <div class="content3">
                        <img src="@/assets/action/joker.jpg">
                        <p>조커</p>
                    </div>
                    <div class="content3">
                        <img src="@/assets/action/1917.jpg">
                        <p>1917</p>
                    </div>
                    <div class="content3">
                        <img src="@/assets/action/avengers.jpg">
                        <p>어벤져스:엔드 게임</p>
                    </div>
                    <div class="content3">
                        <img src="@/assets/action/baekdoosan.jpg">
                        <p>백두산</p>
                    </div>
                    <div class="content3">
                        <img src="@/assets/action/sherlock.jpg">
                        <p>셜록:유령 신부</p>
                    </div>
                    <div class="content3">
                        <img src="@/assets/action/exit.jpg">
                        <p>엑시트</p>
                    </div>
                </div>
                <h3>멜로 영화</h3>
                <hr>
                <div class="content-program">

                    <div class="content3">
                        <img src="@/assets/melo/before-sunrise.jpg">
                        <p>비포 선라이즈</p>
                    </div>
                    <div class="content3">
                        <img src="@/assets/melo/begin-again.jpg">
                        <p>비긴 어게인</p>
                    </div>
                    <div class="content3">
                        <img src="@/assets/melo/classic.jpg">
                        <p>클래식</p>
                    </div>
                    <div class="content3">
                        <img src="@/assets/melo/if-only.jpg">
                        <p>이프-온리</p>
                    </div>
                    <div class="content3">
                        <img src="@/assets/melo/nottingHill.jpg">
                        <p>노팅힐</p>
                    </div>
                    <div class="content3">
                        <img src="@/assets/melo/okja.jpg">
                        <p>옥자</p>
                    </div>
                    <div class="content3">
                        <img src="@/assets/melo/secret.jpg">
                        <p>말할 수 없는 비밀</p>
                    </div>
                </div>
                <h3>드라마</h3>
                <hr>
                <div class="content-program">

                    <div class="content3">
                        <router-link to="tvpro" @click="scrollToTop"><img src="@/assets/tvProgram/thatyear.jpg"></router-link>
                        <p>그 해 우리는</p>
                    </div>
                    <div class="content3">
                        <img src="@/assets/tvProgram/goblin.jpg">
                        <p>도깨비</p>
                    </div>
                    <div class="content3">
                        <img src="@/assets/tvProgram/sinsa.jpg">
                        <p>신사와 아가씨</p>
                    </div>
                    <div class="content3">
                        <img src="@/assets/tvProgram/somun.jpg">
                        <p>경이로운 소문</p>
                    </div>
                    <div class="content3">
                        <img src="@/assets/tvProgram/recall.jpg">
                        <p>응답하라</p>
                    </div>
                    <div class="content3">
                        <img src="@/assets/tvProgram/vincenjo.jpg">
                        <p>빈센조</p>
                    </div>

                </div>
                <hr><br><br>
        </main>

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
export default {
     methods: {
           scrollToTop() {
                window.scrollTo(0,0);
           }
        }

}
</script>

<style scoped>
    * {
    box-sizing: border-box;
    color: white;
    }

    body {
    margin: 0;
    padding: 0;
    text-align: center;
    font-family: 'Roboto', sans-serif;
    color: #222;
    background: rgb(27, 24, 63);
    }

    a {
    text-decoration: none;
    color: white;
    }

    .main-nav {
    width: 100%;
    background: rgb(6, 3, 37);
    min-height: 30px;
    padding:10px;
    padding-left: 250px;
    position: fixed;
    overflow: hidden;
    display: block;
    text-align: left;
    }
    .main-nav img{
    display: inline-block;
    width:150px;
    height:40px;
    margin: 10px;
    }
    .nav {
    font-weight: 700;
    list-style-type: none;
    margin: 10px 0 0 0;
    padding: 0;
    overflow: hidden;
    margin-left: 50px;
    display: inline-block;
    position: fixed;
    }
    .nav ul{
    font-size: 0;
    margin:0;
    padding:0;
    display: block;
    }
    .nav li {
    padding: 5px 10px 10px 10px;
    display: inline-block;
    }
    .nav a:hover {
    color: rgb(240, 207, 23);
    }
    .nav-1{
      padding: 10px;
      position: inherit;
      display: inline-block;
      margin-left: 600px;
    }
    .nav-search{
        width: 300px;
    }
    .nav-search>input[type=text]{
    width:100%;
    padding:10px 20px;
    margin:0;
    border: 0.1px solid white;
    background-color: rgb(6, 3, 37);
    border-radius: 30px;
    }
    .header-wrap{
    padding-left: 150px;
    display: block;
    }
    header {
    text-align: center;
    background-color:black;
    padding-top: 60px;
    padding-left: 100px;
    padding-right: 100px;
    display: block;
    line-height: 1;
    text-align: left;
    }
    header h2{
      text-align: left;
      opacity: 0.5;
    }

    iframe{
      padding-top:40px;

    }
    hr{
      color: gray;
      size: 0.5px;
      width: 90%;
    }
    .my-plan{
    display: inline-block;
    }
    .main{
    padding-left:70px;
    padding-right:70px;
    padding-top: 70px;
    background-color: rgb(6, 3, 37);
    }
    .main h3{
    text-align: left;
    padding-left: 190px;
    color: white;
    font-size: 25px;
    }
    .content-history{
    display: block;
    text-align: left;
    padding-left: 200px;
    }
    .content-history p{
    line-height: 0.5em;
    text-align: center;
    }
    .content-history img{
    border: 2px solid white;
    height: 300px;
    width: 270px;

    }

    .content1, .content2, .content3, .content4{
    display: inline-block;
    margin: 20px;
    }

    .content-program{
    display: block;
    text-align: left;
    padding-left: 100px;
    }
    .content-program img{
    height: 250px;
    width: 250px;
    }

    footer {
    width: 100%;
    min-height: 30px;
    padding: 20px 0 40px 20px;
    text-align: center;
    background-color: rgb(6, 3, 37);
    }

    footer .copyright {
    font-size: .75em;
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