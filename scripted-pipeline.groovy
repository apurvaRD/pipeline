node {  
    stage('Pull') { 
        git 'https://github.com/apurvaRD/devops-b27.git' 
    }
    stage('Build') { 
        echo 'build successful' 
    }
    stage('Test') { 
        echo 'test successful'
    }
    stage('Deploy') { 
        echo 'deploy successful'

    }
}