pipelineJob('kudos-backend') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/shekarpendem/kudos-backend.git'
                    }
                    branch 'master'
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/shekarpendem/kudos-frontend.git'
                    }
                    branch 'master'
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}
