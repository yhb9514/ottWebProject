import Vue from 'vue'
import VueRouter from 'vue-router'
import start from '../views/start.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'start',
    component: start
  },

  {
    path: '/join',
    name: 'join',
    component: () => import(/* webpackChunkName: "about" */ '../views/join.vue')
  },
  {
    path: '/profile',
    name: 'profile',
    component: () => import(/* webpackChunkName: "about" */ '../views/profile.vue')
  },
  {
    path: '/mypage',
    name: 'mypage',
    component: () => import(/* webpackChunkName: "about" */ '../views/myPage.vue')
  },
  {
    path: '/subscriptionpage',
    name: 'subscriptionpage',
    component: () => import(/* webpackChunkName: "about" */ '../views/subscriptionPage.vue')
  },
  {
    path: '/main',
    name: 'main',
    component: () => import(/* webpackChunkName: "about" */ '../views/main.vue')
  },
  {
    path: '/movie',
    name: 'movie',
    component: () => import(/* webpackChunkName: "about" */ '../views/movie.vue')
  },
  {
    path: '/tvpro',
    name: 'tvpro',
    component: () => import(/* webpackChunkName: "about" */ '../views/tvpro.vue')
  },
  {
    path: '/faq',
    name: 'faq',
    component: () => import(/* webpackChunkName: "about" */ '../views/FAQ.vue')
  },


]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
