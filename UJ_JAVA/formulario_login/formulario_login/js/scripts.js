const mode = document.getElementById('mode_icon');
const facebook = document.getElementById('facebook_login')
const google = document.getElementById('google_login')
const github = document.getElementById('github_login')

mode.addEventListener('click', transform)

function transform(){
    const form = document.getElementById('login_form')
    if(mode.classList.contains('fa-moon')){
        mode.classList.remove('fa-moon');
        mode.classList.add('fa-sun');

        form.classList.add('dark')
    }
    else{
        mode.classList.remove('fa-sun');
        mode.classList.add('fa-moon');
        form.classList.remove('dark');
        
    }
}