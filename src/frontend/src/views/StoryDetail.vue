<template>
<div>
    hello {{ storyIdx}}
</div>
    
</template>

<script>
import axios from 'axios'

export default{
    data() {
        return{
            storyIdx : this.$route.params.idx,
        }
    },
    methods:{
        
        getstory(){
            axios.get('http://localhost:9999/storydetail?idx='+this.storyIdx)
            .then(res =>{ 
                console.log(res);
                this.lists = res.data;
                console.log(this.lists);
            })
            .catch(error => 
                console.log(error))
        },
    },
    mounted(){
        console.log(this.storyIdx);
        this.getstory();
    }
}
</script>


