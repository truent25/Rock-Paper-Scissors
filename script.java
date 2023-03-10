
const decision= [];
decision[0]='rock';
decision[1]='paper';
decision[2]='scissors'



function getComputerChoice(){
    return decision[Math.floor(Math.random()*(decision.length))];
}

console.log('computer choice is :');

console.log(getComputerChoice(1,3) );


