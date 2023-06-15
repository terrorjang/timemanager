<script>
  import fastapi from "../lib/api";

  let group_list = [];

  function get_group_list() {
    fastapi("get", "/api/group/list", {}, (json) => {
      group_list = json;
    });
  }

  get_group_list();
</script>

<h1>Group</h1>
<ul>
  {#each group_list as group}
    <li>{group.name}</li>
  {/each}
</ul>
