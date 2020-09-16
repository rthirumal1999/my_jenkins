import com.cloudbees.plugins.credentials.impl.*;
import com.cloudbees.plugins.credentials.*;
import com.cloudbees.plugins.credentials.domains.*;
import org.jenkinsci.plugins.plaincredentials.*
import org.jenkinsci.plugins.plaincredentials.impl.*
import com.cloudbees.plugins.credentials.common.*
import com.cloudbees.jenkins.plugins.sshcredentials.impl.*
import com.cloudbees.jenkins.plugins.awscredentials.AWSCredentialsImpl
import hudson.util.Secret

Credentials myawscreds = (Credentials) new AWSCredentialsImpl(
CredentialsScope.GLOBAL,
"aws-credentials", // id
"", // accessKey
"", // secretKey
"aws-credentials" // description
)

SystemCredentialsProvider.getInstance().getStore().addCredentials(Domain.global(), myawscreds)
