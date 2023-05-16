//Variables

let btn = document.querySelector('#new-quote');
let quote = document.querySelector('.quote');
let person = document.querySelector('.person');

const quotes = [{

    quote:" Where the mind is led forward by thee into ever-widening thought and action-Into that heaven of freedom, my father, let my country awake. ",
    person: "Rabindranath Tagore."
},{
    quote: "Revolution is an inalienable right of mankind. Freedom is an imperishable birthright of all.",
    person:  "Bhagat Singh."
},{
    quote:"Don’t take rest after your first victory because if you fail in second, more lips are waiting to say that your first victory was just luck.",
    person: "A.P.J.Abdul Kalam."
},{
    quote: "I believe in a religion that propagates freedom, equality and brotherhood",
    person:"Chandrasekhar Azad"
},{
    quote:"We want deeper sincerity of motive, a greater courage in speech and earnestness in action",
    person:"Sarojini Naidu"
},{
    quote: "Life is all about a card game. Choosing the right cards is not in our hand. But playing well with the cards in hand determines our success.",
    person: "Bal Gangadhar Tilak"
},{
    quote:"One individual may die for an idea, but that idea will, after his death, incarnate itself in a thousand lives.",
    person: "Netaji Subhash Chandra Bose"
},{
    quote:"There is only one caste... the caste of humanity. There is only one religion... the religion of love.There is only one language... the language of the heart.",
    person:"Sathya Sai Baba"
}];


btn.addEventListener('click', function(){

    let random = Math.floor(Math.random() * quotes.length);

    quote.innerText = quotes[random].quote;
    person.innerText = quotes[random].person;
})

