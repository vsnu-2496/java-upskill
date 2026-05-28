console.log(
"Welcome to the Community Portal"
);

window.onload = function(){

    alert(
    "Page Loaded Successfully"
    );

    displayEvents(events);
};

/* Event Class */

class Event{

    constructor(
        name,
        category,
        seats,
        image
    ){

        this.name = name;
        this.category = category;
        this.seats = seats;
        this.image = image;
    }
}

/* Event Data */

let events = [

    new Event(
        "Music Festival",
        "Music",
        10,
        "../music.jpg"
    ),

    new Event(
        "Coding Workshop",
        "Workshop",
        5,
        "../coding.jpg"
    ),

    new Event(
        "Seminar",
        "Education",
        8,
        "../seminar.jpg"
    )
];

/* Display Events */

function displayEvents(data){

    const container =
    document.querySelector(
    "#eventContainer"
    );

    container.innerHTML = "";

    data.forEach(event => {

        if(event.seats > 0){

            const card =
            document.createElement("div");

            card.className = "card";

            card.innerHTML = `

            <img src="${event.image}">

            <h3>${event.name}</h3>

            <p>
            Category :
            ${event.category}
            </p>

            <p>
            Seats :
            ${event.seats}
            </p>

            <button onclick=
            "registerUser('${event.name}')">

            Register

            </button>

            `;

            container.appendChild(card);
        }

    });
}

/* Register */

function registerUser(name){

    try{

        alert(
        `Registered for ${name}`
        );

    }catch(error){

        console.log(error);
    }
}

/* Validate Phone */

function validatePhone(){

    let phone =
    document.getElementById(
    "phone"
    ).value;

    if(phone.length != 10){

        alert(
        "Phone number should contain 10 digits"
        );
    }
}

/* Show Fee */

function showFee(){

    let fee =
    document.getElementById(
    "eventType"
    ).value;

    document.getElementById(
    "fee"
    ).innerHTML =

    "Event Fee : ₹" + fee;
}

/* Character Counter */

function countCharacters(){

    let text =
    document.getElementById(
    "feedback"
    ).value;

    document.getElementById(
    "count"
    ).innerHTML =

    text.length;
}

/* Form Submit */

document.getElementById(
"registerForm"

).addEventListener(

"submit",

function(event){

    event.preventDefault();

    document.getElementById(
    "message"
    ).innerHTML =

    "Feedback Submitted Successfully!";
});