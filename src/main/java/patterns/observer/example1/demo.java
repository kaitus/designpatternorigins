package patterns.observer.example1;

import patterns.observer.example1.interfaces.Observer;
import patterns.observer.example1.model.EmailTopic;
import patterns.observer.example1.model.EmailTopicSubscriber;

public class demo {
    public static void main(String[] args) {
        EmailTopic emailTopic = new EmailTopic();

        //Create observers
        Observer firstObserver = new EmailTopicSubscriber("firstObserver");

        Observer secondObserver = new EmailTopicSubscriber("secondObserver");

        Observer thirdObserver = new EmailTopicSubscriber("thirdObserver");

        //Register them...
        emailTopic.register(firstObserver);
        emailTopic.register(secondObserver);
        emailTopic.register(thirdObserver);

        //Attaching observer to subject
        firstObserver.setSubject(emailTopic);
        secondObserver.setSubject(emailTopic);
        thirdObserver.setSubject(emailTopic);

        //check for updates
        firstObserver.update();
        thirdObserver.update();

        //Provider / subject (broadcaster)
        emailTopic.postMessage("1. Hello subscribers \n");

        emailTopic.unregister(firstObserver);

        emailTopic.postMessage("2. Hello subscribers \n");

    }
}
