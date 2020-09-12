pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/rthirumal1999/airforce-sample.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}