package patterns.observer.example1.model;

import patterns.observer.example1.interfaces.Observer;
import patterns.observer.example1.interfaces.Subject;

public class EmailTopicSubscriber implements Observer {

    private String name;
    private Subject topic;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    public void update() {
        String msg = (String) topic.getUpdate(this);
        if (msg == null)
            System.out.println(name + " No new message on this topic");
        else
            System.out.println(name + " Retrieving message: " + msg);

    }

    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
