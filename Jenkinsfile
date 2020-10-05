pipeline {
	agent any
	
	stages {
	
		stage('Build') {
			steps {
				echo "Build Stage"
				withGradle {
    				// some block
    				sh  './gradlew clean build'
				}
			}
			
		}
		
		stage('Test') {
			steps {
				echo "Test Stage"
				withGradle {
    				// some block
    				sh  './gradlew clean test'
				}
			}
		}
		
		stage('Deploy') {
			steps {
				echo "Deploy Stage"
				sh './gradlew clean bootRun'
				sh exit
			}
		}
	}

}