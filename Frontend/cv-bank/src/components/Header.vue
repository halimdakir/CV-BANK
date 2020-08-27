<template>
  <div>
    <header id="header">
      <a href="#">
        <img class="ml-5 py-3" src="../assets/logo.svg" alt />
      </a>

      <a href="#">
        <i class="fab fa-linkedin fa-white"></i>
      </a>
      <a href="#">
        <i class="fab fa-youtube fa-white"></i>
      </a>
      <a href="#">
        <i class="fab fa-instagram fa-white"></i>
      </a>
    </header>
  </div>
</template>

<script>
export default {
  name: "Header",
};
</script>

<style scoped>
#header {
  background: #693250;
  color: white;
}

.fa-white {
  color: white;
  float: right;
  padding: 2em 0.7em 0 0;
}
</style>

