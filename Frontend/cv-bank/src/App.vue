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
    <footer>
      <img class="ml-5 py-3" src="@/assets/logo.svg" alt />
      <div class="footer-social">
        <a href="https://www.facebook.com/ITHogskolan/" target="_blank">
          <i class="fab fa-facebook-square"></i>
        </a>
        <a href="#" target="_blank">
          <i class="fab fa-linkedin"></i>
        </a>
        <a href="https://www.youtube.com/channel/UCMG9JpaFbZQQVsvBoXKttmQ" target="_blank">
          <i class="fab fa-youtube"></i>
        </a>
      </div>
    </footer>
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

footer {
  background: #693250;
  margin: 100px 0 -1px 0;
  color: white;
}

.footer-social {
  float: right;
  margin: 2em 2em 0 0;
}

.footer-social a {
  padding-right: 10px;
  color: white;
}
</style>
