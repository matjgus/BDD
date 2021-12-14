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
    path: '/service',
    name: 'Service',
    component: ()=> import('../views/Service.vue')
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
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
