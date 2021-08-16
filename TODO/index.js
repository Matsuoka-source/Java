// TODOアプリの開発用
// console.log('Hello');
const form = document.getElementById("form");
const input = document.getElementById("input");
const ul = document.getElementById("ul");

const todos = JSON.parse(localStorage.getItem("todos"));

if(todos){
  todos.forEach(todo => {
    add(todo);
  })
}

form.addEventListener("submit",function(event){
  event.preventDefault();
  // console.log(input.value);
  add();
});

function add(todo){
  let todoText = input.value;

  if(todo){
    todoText = todo;
  }

  if (todoText){
    const li = document.createElement("li");
    li.innerText = todoText;
    li.classList.add("list-group-item");

    li.addEventListener("contextmenu", function(event){
      event.preventDefault();
      li.remove();
      saveData();
    });
    ul.appendChild(li);
    input.value = "";
    saveData();
  }
}

function saveData(){
  const lists = document.querySelectorAll("li");
  let todos = [];
  lists.forEach(list=> {
    todos.push(list.innerText);
    // console.log(list.innerText);
  });
  localStorage.setItem("todos", JSON.stringify(todos));
  // console.log(lists);

}

// 暗黙的型変換でif(todoText.length > 0)を省略できる

// ローカルストレージにデータを残すことでリロードしても消えなくなる

// contextmenuで右クリックをすると、という記述になる。