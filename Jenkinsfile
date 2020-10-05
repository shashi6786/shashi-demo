pipeline {
	agent any
	
	stages {
	
		stage('Build') {
			steps {
				echo "Build Stage"
				withGradle {
    				// some block
    				clean build
				}
			}
			
		}
		
		stage('Test') {
			steps {
				echo "Test Stage"
				withGradle {
    				// some block
    				clean test
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