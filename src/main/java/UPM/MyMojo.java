 package UPM;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

/**
 * Goal that runs the precompiled JAR.
 *
 * @goal run-jar
 */
public class MyMojo extends AbstractMojo {

    public void execute() throws MojoExecutionException{
        try {
            ProcessBuilder builder = new ProcessBuilder("java", "-jar", "TestSmellHTML.jar", "input.csv");
            Process process = builder.start();
            process.waitFor();
            // Handle input and output streams as needed
        } catch (Exception e) {
            throw new MojoExecutionException("Error running JAR", e);
        }
    }
}