// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random greeting to the page.
 */

 const projectContainer = document.querySelector(".project-items");

 const getProjects = async () => {
     const res = await fetch("/projects");
     const data = await res.json();
     return data;
 }

getProjects().then(projects => {

    let projectContent = ""
    projects.forEach((project, index) => {
    let content = `
    <div class="item">
        <div class="item-overlay">
            <p class="project-title text-primary lead">${project.title}</hp>
            <p class="project-desc my-1 small">${project.description}</p>
            <div class="project-links">
                <a href=${project.github} target="_blank"><i class="fab fa-github icon-btn"></i></a>
                <a href=${project.host} target="_blank"><i class="fas fa-external-link-alt icon-btn"></i></a>
            </div>
        </div>
        <img src="./img/${project.image}.png" alt="${project.name}" width="500" >
    </div>
    `
    projectContent += content
})
projectContainer.innerHTML = projectContent
    
}).catch(err => {
    console.err(err)
})

 const getTranslation = async (code, text) => {
    const options = {
        method: 'POST', 
        mode: 'cors', 
        cache: 'no-cache', 
        credentials: 'same-origin', 
        headers: {
        'Content-Type': 'text/plain; charset=UTF-8'
        },
        redirect: 'follow', 
        referrerPolicy: 'no-referrer'
    }

    const res = await fetch(`/translate?text=${text}&code=${code}`, options);
    const data = await res.text();
    return data;
 }

const elems = document.querySelectorAll('h1,h2,h3,h4,p')

elems.forEach(elem => {
    
    getTranslation("es", elem.textContent).then(data => {
        let html;
        if(elem.classList.contains("m-heading") && data.includes(" ")){
            const subtitle = data.split(" ")
            html = `${subtitle[0]} <span class="text-primary">${subtitle[1]}</span>`
        } else {
            html = data+" ";
        }
        elem.innerHTML = html;
    })
})



/*
const projects = [
    {
        name: "Store202",
        description: "Online shoe store built in php",
        github: "https://github.com/Gginne/IT202/tree/master/project",
        host: "https://web.njit.edu/~gc348/IT202/project"
    },
    {
        name: "Photopress",
        description: "Photo-saving app built on mern stack",
        github: "https://github.com/Gginne/photopress",
        host: "http://photopress.herokuapp.com/"
    },
      {
        name: "Mixionary",
        description: "Dictionary web app",
        github: "https://github.com/Gginne/mixionary",
        host: "https://gginne.github.io/mixionary/"
    },
     {
        name: "WeatherMe",
        description: "Weather & forecast web app",
        github: "https://github.com/Gginne/weather-app",
        host: "https://weatherandme.netlify.app/"
    },
   
    {
        name: "Expense tracker",
        description: "Expense tracking web app built in vanilla js",
        github: "https://github.com/Gginne/expense-tracker",
        host: "https://gginne.github.io/expense-tracker/"
    }
 
  
]*/
