import javax.jms.*;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.log4j.BasicConfigurator;

public class Producer {
	private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;

	public Producer() throws JMSException, NamingException {

		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
		Connection connection = connectionFactory.createConnection();
		try {
			connection.start();
			// JMS messages are sent and received using a Session. We will
			// create here a non-transactional session object. If you want
			// to use transactions you should set the first parameter to 'true'
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			Destination destination = session.createQueue("MyQueue");
			// MessageProducer is used for sending messages (as opposed
			// to MessageConsumer which is used for receiving them)
			MessageProducer producer = session.createProducer(destination);
			producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

			// We will send a small text message saying 'Hello World!'
			TextMessage message = session.createTextMessage("Hello World!");
			// Here we are sending the message!
			producer.send(message);
			System.out.println("Sent message '" + message.getText() + "'");
		} finally {
			connection.close();
		}
	}

	public static void main(String[] args) throws JMSException {
		try {
			BasicConfigurator.configure();
			new Producer();
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
}