let canvas = document.getElementById("snake");
let context = canvas.getContext("2d");
let box = 32;
let snake = [];
snake[0] = {
  x: 8 * box,
  y: 8 * box
}
let direction = "right";
let food = {
  x: Math.floor(Math.random() * 15 + 1) * box,
  y: Math.floor(Math.random() * 15 + 1) * box
}


/*estilizacao do campo/background*/
function criarBG() {
  context.fillStyle = "lightgreen";
  context.fillRect(0, 0, 16 * box, 16 * box);
}
/*estilizacao da cobrinha*/
function criarCobrinha() {
  for(i=0; i < snake.length; i++)  {
    context.fillStyle = "yellow";
    context.fillRect(snake[i].x, snake[i].y, box-2, box-2);
  }/*box-2 para separacao dos blocos do corpo*/
}

function drawFood() {
  context.fillStyle = "darkmagenta";
  context.fillRect(food.x, food.y, box, box);
}

document.addEventListener('keydown', update);
/*funcoes de comandos da cobrinha*/
function update (event) {
  if (event.keyCode == 37 && direction != 'right') direction = 'left';
  if (event.keyCode == 38 && direction != 'down') direction = 'up';
  if (event.keyCode == 39 && direction != 'left') direction = 'right';
  if (event.keyCode == 40 && direction != 'up') direction = 'down';
}

/*comandos dos botoes*/
function btnSelector(){
    if(event.srcElement.id == 'left' && direction != 'right') direction = 'left';
    if(event.srcElement.id == 'up' && direction != 'down') direction = 'up';
    if(event.srcElement.id == 'right' && direction != 'left') direction = 'right';
    if(event.srcElement.id == 'down' && direction != 'up') direction = 'down';
}

function iniciarJogo() {
  if(snake[0].x > 15 * box && direction =='right') snake[0].x = 0;
  if(snake[0].x < 0 && direction=='left') snake[0].x = 16 * box;
  if(snake[0].y > 15 * box && direction =='down') snake[0].y = 0;
  if(snake[0].y < 0 && direction=='up') snake[0].y = 16 * box;
  
  /*detectar colisao com o corpo*/
  for(i = 1; i < snake.length; i++){
    if(snake[0].x == snake[i].x && snake[0].y == snake[i].y){
      clearInterval(jogo);
      alert('Game Over :(');
    }
  }
  
  criarBG();
  criarCobrinha();
  drawFood();
  
  let snakeX = snake[0].x;
  let snakeY = snake[0].y;
  
  if(direction == "right") snakeX += box;
  if(direction == "left") snakeX -= box;
  if(direction == "up") snakeY -= box;
  if(direction == "down") snakeY += box;
  /*pontuacao ao comer frutas*/
  let points = parseInt(document.getElementById("points").innerText);
  
  if(snakeX != food.x || snakeY != food.y) {
    snake.pop();
  }
  else {
    food.x = Math.floor(Math.random() * 15 + 1) * box;
    food.y = Math.floor(Math.random() * 15 + 1) * box;
    points +=10;
  }
  
  document.getElementById("points").innerHTML = points;
  
  let newHead = {
    x: snakeX,
    y: snakeY
  }
  snake.unshift(newHead);
}

let jogo = setInterval(iniciarJogo, 100);