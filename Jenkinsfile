pipeline {
    agent any
    
    stages {
        
        // "" <-- ez a Groovy String
        // '' <-- ez a Java String
        stage("Compile") {
            steps {
                echo "Compiling..."
            }
        }

				stage("Unit test") {
           steps {
  						echo "Testing..."
           }
        }
        
        stage("Package") {
           steps {
  						echo "Packaging..."
           }
        }
        
        stage("Deploy") {
           steps {
  						echo "Deploying..."
           }
        }
        
    }

}