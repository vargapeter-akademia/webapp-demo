pipeline {
  agent any

  stages {

    // "" <-- ez a Groovy String
    // '' <-- ez a Java String
    stage("Compile") {
      steps {
        sh "mvn compile"
      }
    }

    stage("Unit test") {
      steps {
        sh "mvn surefire:test"
      }
    }

    stage("Package") {
      steps {
        sh "mvn war:war"
      }
    }

    stage("Deploy") {
      steps {
        echo "Deploying..."
      }
    }

  }

}