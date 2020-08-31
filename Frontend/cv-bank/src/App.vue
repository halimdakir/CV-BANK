<template>
  <div id="app">
    <header>
      <Header />
    </header>

    <div class="container mt-5">
      <h3>Tillfällig navbar(Kommer tas bort när allt är kopplat till databasen)</h3>
      <router-link class="pr-3" to="/">Start</router-link>
      <router-link class="pr-3" to="/cvlista">Cv-Lista</router-link>
      <router-link class="pr-3" to="/laddaupp">Ladda upp cv</router-link>
    </div>
    <router-view />
  </div>
</template>

<script>
import Header from "./components/Header.vue";

export default {
  name: "App",
  components: {
    Header,
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
