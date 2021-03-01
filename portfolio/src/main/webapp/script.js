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

 const projects = [
    {
        name: "Project 1",
        desc: "This is project #1",
        github: "#",
        host: "#"
    },
    {
        name: "Project 2",
        desc: "This is project #2",
        github: "#",
        host: "#"
    },
    {
        name: "Project 3",
        desc: "This is project #3",
        github: "#",
        host: "#"
    },
    {
        name: "Project 4",
        desc: "This is project #4",
        github: "#",
        host: "#"
    },
    {
        name: "Project 5",
        desc: "This is project #5",
        github: "#",
        host: "#"
    },
 
  
]

let projectContent = ""
projects.forEach((project, index) => {
    let content = `
    <div class="item">
        
        <img src="./img/item${index+1}.png" alt="${project.name}" width="500px>
    </div>
    `

    projectContent += content
})
projectContainer.innerHTML = projectContent
