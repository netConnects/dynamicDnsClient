package in.netconnects.com;

import picocli.CommandLine.Option;

public class SetupDynaDnsCli implements Runnable{
    @Option(names={"-i","--pingInterval"})
    int pingInterval=5;
    @Option(names={"-u","--restUri"})
    String RestUri="";
    public void run(){
        
    }
}
