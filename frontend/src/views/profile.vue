<template>
    <div>
    
        <div class="logo"><img src="@/assets/logo.png"></div>
    
        <div class="profile-aria">
    
            <div>
                <p class="text">프로필을 선택하세요.</p>
            </div>
    
            <div>
                <ul>
                    <li v-for="(a,idx) in users" :key="a">
                        <div class="profile">
                            <div @click="test(idx)">
                                <router-link class="back" to='/main'>
                                    <img class="profile-card" :src="a.img" />
                                </router-link>
                            </div>
                            <h4 class="name">{{a.name}}</h4>
                        </div>
                    </li>
                </ul>
            </div>
            <div class="button" @click="manage()">프로필 관리</div>
        </div>
    </div>
</template>

<script>
export default {


    data() {
        return {
            users: [{
                    name: 'Son',
                    img: require("../assets/profile/1.png")
                },
                {
                    name: 'Han',
                    img: require("../assets/profile/2.png")
                },
                {
                    name: 'Yang',
                    img: require("../assets/profile/3.png")
                },
                {
                    name: 'Lyu',
                    img: require("../assets/profile/4.png"),
                },

            ]
        }
    },
    methods: {

        manage: function() {
            alert('준비중 입니다.')
        },
        test(idx){
            this.$store.dispatch('selectProfile',this.users[idx])
        }

    }

}
</script>

<style scoped>
/* body {
        background-color: rgb(6, 3, 37);
        color: white;
        margin: 0px;
        padding: 0px;
        font-family: 'Roboto', sans-serif;
    } */

img {
    display: inline-block;
    width: 300px;
    height: 100px;
    margin: 10px;
}

div.profile-aria {
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
}

p.text {
    text-align: center;
    font-size: 48px;
    margin-bottom: 10px;
    margin-left: 25px;
}

li {
    float: left;
    list-style: none;
    margin: 10px;
    display: block;
}

div.profile {
    width: 150px;
    height: 200px;
    background: transparent;
}

img.profile-card {
    width: 150px;
    height: 150px;
}

.back {
    background-color: rgb(6, 3, 37);
}

h4.name {
    color: rgb(255, 255, 255);
    text-align: center;
    font-size: 20px;
}

.profile-card {
    transform: scale(1);
    -webkit-transform: scale(1);
    -moz-transform: scale(1);
    -ms-transform: scale(1);
    -o-transform: scale(1);
    transition: all 0.2s ease-in-out;
    /* 서서히 확대 */
}

.profile-card:hover {
    transform: scale(1.1);
    -webkit-transform: scale(1.1);
    -moz-transform: scale(1.1);
    -ms-transform: scale(1.1);
    -o-transform: scale(1.1);
}

.button {
    width: 120px;
    height: 28px;
    text-align: center;
    font-weight: bold;
    padding: 5px;
    border: 1px solid white;
    position: absolute;
    left: 50%;
    top: 120%;
    transform: translate(-50%, -50%);
}

.button:hover {
    background: white;
    color: black;
}
</style>
