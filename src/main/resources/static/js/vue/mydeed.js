const deed_history = new Vue({
    el: '#deed_history',
    data: {
      tDonation: 3,
      remain_deed : 2
    },
    method : {
    fetchdeeds(){
      fetch('https://jsonplaceholder.typicode.com/todos/1')
      .then(response => response.json())
      .then(json => console.log(json))
    }
  }
  })