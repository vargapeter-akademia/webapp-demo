pipeline {
  agent any

  stages {

    // "" <-- ez a Groovy String
    // '' <-- ez a Java String
    stage("Package") {
      steps {
        sh "mvn package -DskipTests=true"
      }

      post {
        success {
          archiveArtifacts artifacts: "target/*.war", fingerprint: true
        }
      }
    }

    stage("Unit test") {
      steps {
        sh "mvn surefire:test"
      }

      post {
        always {
          junit "target/surefire-reports/TEST-*.xml"
        }
      }

    }

    stage("Deploy") {
      steps {
        echo "Deploying..."
      }
    }

  }

  post {
    always {
      sh "mvn clean"
    }
  }

}