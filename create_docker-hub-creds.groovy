import com.cloudbees.plugins.credentials.impl.*;
import com.cloudbees.plugins.credentials.*;
import com.cloudbees.plugins.credentials.domains.*;
import org.jenkinsci.plugins.plaincredentials.*
import org.jenkinsci.plugins.plaincredentials.impl.*
import com.cloudbees.plugins.credentials.common.*
import com.cloudbees.jenkins.plugins.sshcredentials.impl.*
import com.cloudbees.jenkins.plugins.awscredentials.AWSCredentialsImpl
import hudson.util.Secret

// Username and password
Credentials c = (Credentials) new UsernamePasswordCredentialsImpl(
CredentialsScope.GLOBAL, // Scope
"docker-hub", // id
"Docker hub credentials", // description
"rthirumal1999", // username
"" // password
)

SystemCredentialsProvider.getInstance().getStore().addCredentials(Domain.global(), c)
