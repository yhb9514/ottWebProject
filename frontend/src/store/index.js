import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
      profile:'',
  },
  mutations: {
    selectProfile(state, payload){
      state.profile = payload;
    }
  },
  actions: {
    selectProfile(context,payload){
      return context.commit('selectProfile',payload);
    }
  },
  modules: {
  }
})
