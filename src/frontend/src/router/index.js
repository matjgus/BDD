import Vue from 'vue'
import VueRouter from 'vue-router'
import Index from '../views/Index.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Index',
    component: Index
  },
  {
    path: '/intro',
    name: 'Intro',
    component: ()=> import('../views/Intro.vue')
  },
  {
    path: '/IntroMap',
    name: 'IntroMap',
    component: ()=> import('../views/IntroMap.vue')
  },
  {
    path: '/login',
    name: 'Login',
    component: ()=> import('../views/login.vue')
  },
  {
    path: '/signup',
    name: 'Signup',
    component: ()=> import('../views/signup.vue')
  },
  {
    path: '/donationbill',
    name: 'Donationbill',
    component: ()=> import('../views/Donationbill.vue')
  },
  {
    path: '/donation',
    name: 'Donation',
    component: ()=> import('../views/Donation.vue')
  },
  {
    path: '/reverse_sponsorship',
    name: 'Reverse_Sponsorship',
    component: ()=> import('../views/reverse_sponsorship.vue')
  },
  
  {
    path: '/benefit',
    name: 'Benefit',
    component: ()=> import('../views/benefit.vue')
  },
  {
    path: '/mydeed',
    name: 'Mydeed',
    component: ()=> import('../views/mydeed.vue')
  },
  {
    path: '/service',
    name: 'Service',
    component: ()=> import('../views/Service.vue')
  },
  {
    path: '/donationhistory',
    name: 'Donationhistory',
    component: ()=> import('../views/donationhistory.vue')
  },
  {
    path: '/sponsorship',
    name: 'Sponsorship',
    component: ()=> import('../views/sponsorship.vue')
  },
  {
    path: '/serviceboard',
    name: 'ServiceBoard',
    component: ()=> import('../views/ServiceBoard.vue')
  },
  {
    path: '/serviceview',
    name: 'ServiceView',
    component: ()=> import('../views/ServiceView.vue')
  },
  {
    path: '/profile',
    name: 'Profile',
    component: ()=> import('../views/profile.vue')
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
