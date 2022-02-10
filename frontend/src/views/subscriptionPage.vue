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
            <div class="div-intro">
                <h1>이용권</h1>
                <p>DeepSee이용권으로 더 넓은 콘텐츠 세상으로의 항해, DeepSee와 함께하세요!</p>
            </div>
        </header>
        <main class="main">
            <div>
                <h3>이용권 종류</h3>
                <hr color="grey" size="0.5px" width="80%">
            </div>
            <div class="box-wrap">
                <div class="box">
                    <h2>프리미엄</h2>
                    <p>TV프로그램+영화(개별구매 제외) <br>| 1080p + 4K 화질 <br>| 동시 시청 4명 <br>| 모든 디바이스</p>
                    <h4>월 13,900원</h4>
                    <input type="button" value="구매하기" onclick="purchase()">
                </div>
                <div class="box">
                    <h2>스탠다드</h2>
                    <p>TV프로그램+영화(개별구매 제외)<br> | 1080p 화질<br> | 동시 시청 2명<br> | 모든 디바이스</p>
                    <h4>월 10,900원</h4>
                    <input type="button" value="구매하기" onclick="purchase()">
                </div>
                <div class="box">
                    <h2>베이직</h2>
                    <p>TV프로그램+영화(개별구매 제외) <br>| 720p 화질 <br>| 동시 시청 1명 <br>| 모바일 + PC</p>
                    <h4>월 7,900원</h4>
                    <input type="button" value="구매하기" onclick="purchase()">
                </div>
            </div>
            <div class="table">
            <table>
                <tr>
                <th></th>
                <th>프리미엄</th>
                <th>스탠다드</th>
                <th>베이직</th>
            </tr>
                <tr>
                <td>프로필 개수</td>
                <td>4</td>
                <td>2</td>
                <td>1</td>
                </tr>
                <tr>
                <td>동시 시청이 가능한 수</td>
                <td>4</td>
                <td>2</td>
                <td>1</td>
                </tr>
                <tr>
                <td>지원하는 최대 화질</td>
                <td>1080p + 4K</td>
                <td>1080p</td>
                <td>720p</td>
                </tr>
                <tr>
                <td>PC, 스마트폰, 태블릿, 크롬캐스트</td>
                <td>●</td>
                <td>●</td>
                <td>●</td>
                </tr>
                <tr>
                <td>안드로이드 TV(뷰잉)</td>
                <td>●</td>
                <td>●</td>
                <td>&#9747;</td>
                </tr>
                <tr>
                <td>스마트TV(삼성, LG)</td>
                <td>●</td>
                <td>●</td>
                <td>&#9747;</td>
                </tr>
                <tr>
                <td>월 요금</td>
                <td>월 13,900원</td>
                <td>월 10,000원</td>
                <td>월 7,900원</td>
                </tr>
            </table>
            </div>
            <div class="notice">
            <h4>이용권 구독 주의 사항</h4>
            <p>
                •모든 결제 금액에는 부가세(VAT)가 포함되어 있습니다.<br>
                •서비스(TV프로그램, 영화 등)는 저작권자의 요청으로 해외에서 이용하실 수 없습니다.<br>
                •이용권 구매 시 모든 TV프로그램 및 월정액 영화 시청이 가능하며, 저작권자의 요청으로 일부 프로그램의 실시간 및 TV프로그램은 시청이 제한될 수 있습니다.<br>
                •DRM 콘텐츠는 기기 등록한 디바이스에서만 이용 가능합니다. 루팅된 단말 및 일부 디바이스에서는 DRM 콘텐츠를 이용하실 수 없습니다.<br>
                •만 14세 이상 회원만 구매 가능합니다.<br>
                •미성년자의 콘텐츠 구매 시 법정대리인의 동의를 받아야 하며, 동의를 받지 않은 경우 법정 대리인이 이를 취소할 수 있습니다.<br>
                •모든 결제 금액에는 부가세(VAT)가 포함되어 있습니다.<br>
                •이용권은 매달 동일한 날짜에 자동 결제되며, 당월에 해당 일자가 없는 경우 말일에 결제가 이루어집니다.<br>
                •자동 결제 해지는 결제 예정일 최소 24시간 이전에 해지 신청 해야합니다. 결제 예정일 전 24시간 이내에는 자동 결제를 해지해도 이용권이 결제될 수 있습니다.<br>
                •베이직, 스탠다드, 프리미엄 이용권을 중복 구매 하실 수 없습니다.<br>
                •프리미엄 이용권 보유 시 스마트TV에서 일부 콘텐츠를 4K 화질로 이용할 수 있습니다.<br>
                •보유한 이용권의 종류, 네트워크 환경, 콘텐츠 계약 조건, 디바이스 종류 및 사양에 따라 4K 화질 이용이 제한될 수 있습니다.<br>
                •동시접속 가능한 이용권을 구매하실 경우 동시에 여러기기에서 시청하실 수 있으며, 이용권 별로 제공되는 회선의 수가 다릅니다. 베이직 상품(1회선)이용 시 동시접속이 차단됩니다.<br>
                •미사용 상품은 유료 결제 후 7일 이내에 고객센터를 통해 이용신청의 철회가 가능하며 7일이 경과한 경우에는 위약금을 제하고 환불됩니다.<br>
                •이용권의 시청 내역이 있는 경우에는 사용일 수 만큼 차감(일할계산)후 수수료를 제외한 남은 금액이 환불됩니다.<br>
                •VOD 개별 상품을 구매한 경우 이미 다운로드 및 스트리밍하여 사용한 상품에 대해서는 결제취소 및 청약철회가 불가능하며, 여러 개의 디지털콘텐츠로 구성된 상품의 경우에는 사용하지 않은 부분에 한해 환불이 가능합니다.<br>
            </p>
            <h4>서비스 이용 권장사항</h4>
            <p>
                •PC: Window 7 이상/ HTML5 지원 모든 브라우저<br>
                •스마트폰/태블릿 : Android OS 6.0 이상 / iOS 12.0 이상(AOS 6.0 / iOS 12.0 미만 버전 APP 업데이트 불가)<br>
                •스마트TV: 삼성 스마트 TV 2016년형 이상 (타이젠 2.4 이상) / LG 스마트TV 2016년형 이상(web OS 3.0 이상)<br>
                •안드로이드TV: Android OS 8.0 이상의 Android TV 기기<br>
                    - 안드로이드 TV 버전에 따라 일부 기기에서는 서비스가 정상 동작하지 않을 수 있습니다.<br>
                    - 저작권자의 요청으로 안드로이드 TV에서 일부 콘텐츠는 시청이 제한 될 수 있습니다.<br>
                •OS버전 및 제조사에 따라 일부 기기에서는 정상 동작하지 않을 수 있으므로 이용권 구매 전 영상 미리보기를 통해 시청 가능 여부를 확인해주세요.<br>
            </p>

            </div>

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
    background: rgb(6, 3, 37);
    }

    a {
    text-decoration: none;
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
    .nav li a:hover{
    color:rgb(255,232,18);
    }

    .nav a:hover {
    color: white
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
    background-color: rgb(27, 24, 63);
    padding-top: 60px;
    padding-left: 100px;
    padding-right: 100px;
    display: flex;
    line-height: 1;
    text-align: left;
    }
    .div-intro{
    margin: 70px 170px;
    }
    .main{
    padding-left:70px;
    padding-right:70px;
    padding-top: 70px;
    }
    .main h3{
    text-align: left;
    padding-left: 190px;
    color: white;
    }
    .box-wrap{
    display: flex;
    justify-content: center;
    }
    .box{
    width: 300px;
    height: 300px;
    border: 3px solid rgb(255,232,18);
    border-radius: 5px;
    margin: 50px 10px 10px 10px;
    padding: 20px;
    background-color: rgb(6, 3, 37);
    text-align: center;
    }
    .box h2, h4 {
    color: white;
    }
    .box p{
    color: #ccc;
    }
    .box input{
    border: none;
    border-radius: 4px;
    width: 50%;
    background-color: rgb(255,232,18);
    font-weight: bold;
    font-size: 12px;
    color: black;
    padding: 10px;
    }
    table {
    margin-top:70px;
    margin-left: auto;
    margin-right: auto;
    border-collapse: collapse;
    width: 70%;
    border-top: 1px solid #ccc;
    text-align: center;
    }
    th, td{
    border-bottom: 0.5px solid;
    border-left: 1px solid;
    border-color: #ccc;
    padding: 10px;
    }
    th{
    height: 70px;
    }
    th:first-child, td:first-child{
    border-left: none;
    }
    td{
    height: 50px;
    }
    .notice{
    text-align: left;
    margin-top: 100px;
    margin-bottom: 100px;
    padding-left: 250px;
    padding-right: 250px;
    }
    .notice p{
    color: #ccc;
    font-size: 13px;
    }

    footer {
    width: 100%;
    min-height: 30px;
    padding: 20px 0 40px 20px;
    text-align: center;
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