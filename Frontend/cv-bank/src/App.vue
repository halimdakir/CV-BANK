<template>
  <div id="app">
    <Header />
    <Login />
  </div>
</template>

<script>
import Header from "./components/Header.vue";
import Login from "./components/Login.vue";

export default {
  name: "App",
  components: {
    Header,
    Login,
  },
};
</script>

<style>
@import url("https://fonts.googleapis.com/css2?family=Average+Sans&display=swap");

#app {
  font-family: "Average Sans", sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
}

.btn-color {
  background-color: #693250;
  color: white;
  padding: 0.5em 2em;
  border-radius: 5px;
}
</style>
