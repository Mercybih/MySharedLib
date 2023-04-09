def welcome(name, devops_class){
  echo "Hello ${name} from Class ${devops_class}, you just used a shared library"
}

def newfile(file_name){
  echo "creating file called ${file_name}"
  sh "touch ${file_name}"
}

def call(){
  echo "You had to use just the name of the file here"
}
