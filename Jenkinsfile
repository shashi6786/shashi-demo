pipeline {
	agent any
	
	stages {
	
		stage('Build') {
			steps {
				echo "Build Stage"
				withGradle {
    				// some block
    				gradle clean build
				}
			}
			
		}
		
		stage('Test') {
			steps {
				echo "Test Stage"
				withGradle {
    				// some block
    				gradle clean test
				}
			}
		}
		
		stage('Deploy') {
			steps {
				echo "Deploy Stage"
			}
		}
	}

}