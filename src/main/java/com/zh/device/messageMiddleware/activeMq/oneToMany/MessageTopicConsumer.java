//package com.zh.device.messageMiddleware.activeMq.oneToMany;
//
//import org.apache.activemq.ActiveMQConnectionFactory;
//
//import javax.jms.*;
//
//public class MessageTopicConsumer {
//    //定义ActivMQ的连接地址
//    private static final String ACTIVEMQ_URL = "tcp://192.168.32.141:61616";
//    //定义发送消息的队列名称
//    private static final String TOPIC_NAME = "MyTopicMessage";
//    public static void main(String[] args) throws JMSException {
//        //创建连接工厂
//        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);
//        //创建连接
//        Connection connection = activeMQConnectionFactory.createConnection();
//        //打开连接
//        connection.start();
//        //创建会话
//        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//        //创建主题目标  主题 一对多
//        Destination destination = session.createTopic(TOPIC_NAME);
//        //创建消费者
//        javax.jms.MessageConsumer consumer = session.createConsumer(destination);
//        //创建消费的监听
//        consumer.setMessageListener(new MessageListener() {
//            @Override
//            public void onMessage(Message message) {
//                TextMessage textMessage = (TextMessage) message;
//                try {
//                    System.out.println("获取消息：" + textMessage.getText());
//                } catch (JMSException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//    }
//}
